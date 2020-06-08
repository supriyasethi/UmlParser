import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.net.ssl.HttpsURLConnection;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class UmlParser extends Java8ParserBaseListener {

    private static StringBuilder classstring = new StringBuilder();
    private static StringBuilder classassociation = new StringBuilder();
    private static StringBuilder umlbuilder = new StringBuilder();
    private static ArrayList<String> classname = new ArrayList<>();
    private static ArrayList<String> gettersetter = new ArrayList<>();
    private static ArrayList<String> superclass = new ArrayList<>();
    private static ArrayList<String> superinterface = new ArrayList<>();
    private static ArrayList<String> methodname = new ArrayList<>();
    private static ArrayList<String> methoddeclaration = new ArrayList<>();
    private static ArrayList<String> parameters = new ArrayList<>();
    private static ArrayList<String> interfacename = new ArrayList<>();
    private static ArrayList<String> classes = new ArrayList<>();
    private static ArrayList<String> variablelist = new ArrayList<>();
    private static ArrayList<String> variablemodifier = new ArrayList<>();
    private static ArrayList<String> associationclassdecl = new ArrayList<>();
    private static ArrayList<String> associationclass = new ArrayList<>();
    private static ArrayList<String> previousclass = new ArrayList<>();
    private static ArrayList<String> worklist = new ArrayList<>();
    private static ArrayList<String> methodlist = new ArrayList<>();
    public static ArrayList<String> methoddeclartor = new ArrayList<>();
    private static ArrayList<String> constdeclaration = new ArrayList<>();
    private static ArrayList<String> constdeclarator = new ArrayList<>();
    private static HashMap<String, List<String>> classvariables = new HashMap<>();
    private static HashMap<String, String> methodreturntype = new HashMap<>();
    private static HashMap<String, List<String>> parameterlist = new HashMap<>();
    private static HashMap<String, List<String>> superclasslist = new HashMap<>();
    private static HashMap<String, List<String>> interfacelist = new HashMap<>();
    private static HashMap<String, String> interfaceformat = new HashMap<>();
    private static HashMap<String, List<String>> classmethodlist = new HashMap<>();
    private static HashMap<String, List<String>> interfacemethodlist = new HashMap<>();
    private static HashMap<String, String> variablemod = new HashMap<>();
    private static HashMap<String, String> variabletype = new HashMap<>();
    private static HashMap<String, String> variablearray = new HashMap<>();
    private static HashMap<String, String> associationmap = new HashMap<>();
    private static HashMap<String, List<String>> classmap = new HashMap<>();
    public static String interfacestr = "";
    public static String methoddc = "";
    public static String input = "";
    public static String output = "";
    public static String methodformat = "";
    public static int variablecount=0;

    public static void main(String args[]) throws IOException {

        File folder = new File(args[0]);
        File[] inputfiles = folder.listFiles();
        for (int i = 0; i < inputfiles.length; i++) {
            CharStream cs = fromFileName(inputfiles[i].toString());
            Java8Lexer lexer = new Java8Lexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            Java8Parser parser = new Java8Parser(token);
            parser.setBuildParseTree(true);
            Java8Parser.CompilationUnitContext cu = parser.compilationUnit();
            ParseTreeWalker treeWalker = new ParseTreeWalker();
            UmlParser listener = new UmlParser();
            treeWalker.walk(listener, cu);
            String inputfile = inputfiles[i].getName();
            String[] split = inputfile.split(".java");
            input = split[0];
            output = args[1];
            getStringFormat(input);
            if (!associationclass.isEmpty()) {
                previousclass = (ArrayList<String>) associationclass.clone();
                classmap.put(input, previousclass);
                associationclass.clear();
                associationclassdecl.clear();
            }

        }
        buildParser();
        umlbuilder.append(classstring);
        umlbuilder.append(classassociation);
        //System.out.println(umlbuilder);
        System.out.println("Class Diagram generated. Please find it at location " + args[1]);
        sendHTTPRequest(output);

    }

    /** Send http request to yuml to get uml diagram in response */
    public static void sendHTTPRequest(String pngfile) {
        OutputStream os=null;
        HttpsURLConnection connection = null;

       try {
            String urlpath = "https://yuml.me/diagram/plain/class/";
            urlpath+= umlbuilder.toString();
            urlpath+=".png";

            URL url = new URL(urlpath);
            connection = (HttpsURLConnection) url.openConnection();
            if (connection.getResponseCode() == 200) {
                File outputfile= new File(pngfile);
                os = new FileOutputStream(outputfile);

                byte[] bytesOfImage = new byte[1024];
                int read = 0;
                while ((read = connection.getInputStream().read(bytesOfImage)) != -1) os.write(bytesOfImage, 0, read);

            }else{
                System.out.println(connection.getResponseCode());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            if(os!=null)
                try {
                    os.close();
                } catch (IOException e) {
                }
            if(connection!=null) connection.disconnect();
        }
    }

    /** This method will be called for each class and interface to extract the details
     * and save it to use to format string for yuml */
    public static void getStringFormat(String name) {

        if (interfacename.contains(name)) {
            getInterfaceMethod(name);
        } else {
            if (!methodname.isEmpty()) {
                getClassMethod(name);
            }
        }
        if (!variablelist.isEmpty()) {
            getClassVariables(name);
        }
        if (!variablemodifier.isEmpty()) {
            getVariableModifierList();
        }
        if (!associationclassdecl.isEmpty()) {
            getClassAssociation();
        }
        if (!superclass.isEmpty()) {
            getSuperClassDetails(name);
        }
        if (!superinterface.isEmpty()) {
            getSuperInterfaceDetails(name);
        }

        if(!methoddeclartor.isEmpty()) {
            getParameterList();
        }
        variablelist.clear();
        variablemodifier.clear();
        methodname.clear();
        superclass.clear();
        superinterface.clear();
        methoddeclaration.clear();
        methoddeclartor.clear();
        methodlist.clear();
    }

    /** Get the list of methods corresponding to each class */
    public static void getClassMethod(String classnm) {
        for (int j = 0; j < methodname.size(); j++) {
            if (methodname.get(j).contains("get") || methodname.get(j).contains("set")) {
                worklist = (ArrayList<String>) methodname.clone();
                gettersetter.add(worklist.get(j));
            } else {
                if (methoddeclaration.get(j).contains("private")) {
                    methodformat = "-" + methodname.get(j) ;
                }
                if (methoddeclaration.get(j).contains("public")) {
                    methodformat = "+" + methodname.get(j);
                }
                methodlist.add(methodformat);
                getMethodReturnType(j);
            }
        }
        if(!methodlist.isEmpty()) {
        List<String> prevlist = (List<String>) methodlist.clone();
        classmethodlist.put(classnm, prevlist); }
        worklist.clear();
    }

    /** Get the list of methods corresponding to each interface */
    public static void getInterfaceMethod(String intname) {

        for (String name : methodname) {
            if (methoddeclaration.toString().contains("private")) {
                methodformat = "-" + name ;

            } else
            if (methoddeclaration.toString().contains("public")) {
                methodformat = "+" + name;
            } else {
                methodformat = "+" + name;
            }

            String str = methodformat;
            methodlist.add(str);
            methodformat = "";
        }
        List<String> previntlist = (List<String>) methodlist.clone();
        interfacemethodlist.put(intname, previntlist);
    }

    /** Get the return types for each method corresponding to class and method */
    public static void getMethodReturnType(int index) {
        String[] methodhead = methoddeclaration.get(index).split("\\(");
        if (methodhead[0].contains("void")) {
            methodreturntype.put(methodname.get(index),"void");
        }
        if (methodhead[0].contains("String")) {
            methodreturntype.put(methodname.get(index),"String");
        }
        if (methodhead[0].contains("int")) {
            methodreturntype.put(methodname.get(index),"int");
        }
        if (methodhead[0].contains("boolean")) {
            methodreturntype.put(methodname.get(index),"boolean");
        }
        if (methodhead[0].contains("double")) {
            methodreturntype.put(methodname.get(index),"double");
        }
    }

    /** Get the list of parameter list corresponding to each method */
    public static void getParameterList() {
        for (String name : methoddeclartor) {
            String[] str = name.split("\\(");
            if(str[1].equals(")")) {
                parameters.add("");
            } else {
                String [] str1 = str[1].split("\\)");
                if (str1[0].contains(",")) {
                    String[] params = str1[0].split(",");
                    for (int i = 0; i< params.length; i ++) {
                        parameters.add(params[i]);
                    }
                } else {
                    parameters.add(str1[0]);
                }
            }
            List<String> prevparamlist = (List<String>) parameters.clone();
            parameterlist.put(str[0], prevparamlist);
            parameters.clear();
        }
    }

    /** Get the list of class variables for each class */
    public static void getClassVariables(String classnm) {
        worklist.clear();
        worklist = (ArrayList<String>) variablelist.clone();
        variablelist.clear();
        for(int i = 0;i < worklist.size();i++) {
            if (worklist.get(i).contains("=")) {
                String[] varname = worklist.get(i).split("=");
                variablelist.add(varname[0]);
            }
            else { variablelist.add(worklist.get(i)); }
        }
        worklist.clear();
        for (String var : variablelist) {
            if (!var.contains("ArrayList")) {
                    worklist.add(var);
            }
        }
        List<String> prevlist = (List<String>) worklist.clone();
        classvariables.put(classnm, prevlist);
    }

    /** Get the variable modifiers corresponding to each variable */
    public static void getVariableModifierList() {

        for (int i = 0; i < variablemodifier.size(); i++) {
            if (variablemodifier.get(i).contains(variablelist.get(i))) {
                if (variablemodifier.get(i).contains("private")) {
                    variablemod.put(variablelist.get(i), "-");
                }
                if (variablemodifier.get(i).contains("public")) {
                    variablemod.put(variablelist.get(i), "+");
                }
                checkVariableTypesandArray(i);

            }
        }
    }

    /** Get the type of variable and array or arraylist used in the class */
    public static void checkVariableTypesandArray(int index) {

        if (variablemodifier.get(index).contains("int")) {
            variabletype.put(variablelist.get(index), "int");
        }
        if (variablemodifier.get(index).contains("double")) {
            variabletype.put(variablelist.get(index), "double");
        }
        if (variablemodifier.get(index).contains("[]")) {
            variablearray.put(variablelist.get(index), "(*)");
        }
        if (variablemodifier.get(index).contains("String")) {
            variabletype.put(variablelist.get(index), "String");
        }
        if (variablemodifier.get(index).contains("void")) {
            variabletype.put(variablelist.get(index), "void");
        }
    }

    /** Get the class associations corresponding to each other */
    public static void getClassAssociation() {
        worklist.clear();
        for (int i = 0; i < associationclassdecl.size(); i++) {
            String str = associationclassdecl.get(i);
            if (!associationclassdecl.get(i).contains("String"))
                if (associationclassdecl.get(i).contains("Collection")) {
                    for (int k = 0; k < classes.size(); k++) {
                        if (associationclassdecl.get(i).contains(classes.get(k))) {
                                associationmap.put(classes.get(k), "0..*");
                                worklist.add(classes.get(k));
                        }
                    }
                } else {
                    String classnm = checkArraylist(str);
                    if (classnm != null) {
                    associationmap.put(classnm, "1");
                    worklist.add(classnm); }
                    else {
                        if (!str.contains("_")) {
                            associationmap.put(associationclassdecl.get(i), "1");
                            worklist.add(associationclassdecl.get(i));
                        }
                    }
                    }
                }


        for (String association : worklist) {
            if (!associationclass.contains(association)) {
                associationclass.add(association);
            }
        }
    }

    /** Get the arraylist to drop it from formatted string */
    public static String checkArraylist(String decl) {
        if (decl.contains("ArrayList")) {
            String[] classnm = decl.split("<");
            String[] classnm1 = classnm[1].split(">");
            return(classnm1[0]);
        } else { return null; }
    }

    /** Get the superclass details corresponding to each class */
    public static void getSuperClassDetails(String classnm) {
        worklist.clear();
        for (int i = 0;i <superclass.size();i++) {
            worklist.add(superclass.get(i).replace("extends",""));
        }
        List<String> prevlist = (List<String>) worklist.clone();
        superclasslist.put(classnm, prevlist);
    }

    /** Get the interface details corresponding to each
     * class if it is implementing any */
    public static void getSuperInterfaceDetails(String classnm) {
        List<String> prevlist = (List<String>) superinterface.clone();
        interfacelist.put(classnm, prevlist);
    }

    /** this method is called to generate the parser string for yuml
     * once all the data is gathered for all classes and interfaces. It will
     * process all the classes and interfaces one by one
     */
    public static void buildParser() {
        if(!interfacename.isEmpty()){
            formatInterface();
        }
        if (!classname.isEmpty()) {
            for (int i = 0; i < classname.size(); i++) {
                List<String> varlist = classvariables.get(classname.get(i));
                if (varlist != null) {
                    for (String var : varlist) {
                        if (variabletype.containsKey(var)) {
                            variablecount++;
                        }
                    }
                }
                if ((variablecount  > 0) || (!constdeclarator.isEmpty()) || (classmethodlist.get(classname.get(i)) != null)) {
                    classstring.append("[" + classname.get(i) );
                    formatClassVariables(i);
                    classstring.append("],");
                    variablecount = 0;
                }

                if (!interfacelist.isEmpty()) {
                    formatInterfaceUsed(i);
                }
                if (!classmap.isEmpty()) {
                    formatClassAssociations(i);
                }
                if (!superclasslist.isEmpty()) {
                    formatSuperClass(i);
                }
            }
        }
    }

    /** Format the interfaces */
    public static void formatInterface() {
        for (String name : interfacename) {
            interfacestr += "[<<interface>>;" + name ;
            if(!interfacemethodlist.isEmpty()) {
                interfacestr += "|";
                worklist = (ArrayList<String>) ((ArrayList<String>) interfacemethodlist.get(name)).clone();
                for(String method : worklist) {
                    interfacestr += method + "(";
                    if (!parameterlist.isEmpty()) {
                        String mname = method.substring(1);
                        List<String> param = parameterlist.get(mname);
                        for (int i = 0; i < param.size(); i++) {
                            //for (String args : param) {
                            String args = param.get(i);
                            if (args.equals("") || (args.equals(null))) {
                            } else {
                                String parms = splitParameters(args);
                                if (i == param.size() - 1) {
                                    interfacestr += parms;
                                } else {
                                    interfacestr += parms + ",";
                                }
                            }
                        }interfacestr += ")";
                    }
                    if (!methodreturntype.isEmpty()) {
                        String returntype = methodreturntype.get(method.substring(1));
                        if (returntype != null) {
                        interfacestr += ":" + methodreturntype.get(method.substring(1)); }
                        interfacestr += ";";
                    }
                }
            }  interfacestr += "]";
            interfaceformat.put(name, interfacestr);
            interfacestr="";
        } worklist.clear();
    }

    /** Split the parameters in colon (:) format for final string */
    public static String splitParameters(String param){
        String parms = "";
        if (param.contains("int")) {
            String[] param1 = param.split("int");
            String arg = param1[1] + ":int";
            parms = arg;
        }
        if (param.contains("String")) {
            String[] param1 = param.split("String");
            String arg = param1[1] + ":String";
            parms = arg;
        }
        if (param.contains("double")) {
            String[] param1 = param.split("double");
            String arg = param1[1] + ":double";
            parms = arg;
        }
        if (param.contains("float")) {
            String[] param1 = param.split("float");
            String arg = param1[1] + ":float";
            parms = arg;
        }
        if (param.contains("long")) {
            String[] param1 = param.split("long");
            String arg = param1[1] + ":long";
            parms = arg;
        }
        if (param.contains("[]")) {
            String[] param1 = param.split("\\[]");
            String arg = "(*)" +param1[1] + ":" + param1[0];
            parms = arg;
        }

        for (String name : interfacename) {
            if (param.contains(name)) {
                String[] param1 = param.split(name);
                String arg = param1[1] + ":" + name;
                parms = arg;
            }
        }
        for (String name : classname) {
            if (param.contains(name)) {
                String[] param1 = param.split(name);
                String arg = param1[1] + ":" + name;
                parms = arg;
            }
        }
        return parms;

    }

    /** Format the interfaces implemented by class */
    public static void formatInterfaceUsed(int index) {
        worklist = (ArrayList<String>) interfacelist.get(classname.get(index));
        if (worklist != null) {
            for (String interfc : worklist) {
                String strinterfc = interfc.replace("implements", "");
                if (strinterfc.contains(",")) {
                    List<String> listinterfc = Arrays.asList(strinterfc.split(","));
                    for (String list : listinterfc) {
                        classstring.append(interfaceformat.get(list));
                        classstring.append(("^-.-"));
                        classstring.append("[" + classname.get(index) + "],");
                    }
                } else {
                    classstring.append(interfaceformat.get(strinterfc));
                    classstring.append(("^-.-"));
                    classstring.append("[" + classname.get(index) + "],");
                }
            }
            worklist.clear();
        }
    }

    /** Format the class variables for each class */
    public static void formatClassVariables(int index) {
        int varcount = 0;
        List<String> varlist = classvariables.get(classname.get(index));
        if (varlist != null) {
            for (int j = 0; j < varlist.size(); j++) {
                if (variabletype.containsKey(varlist.get(j))) {
                    varcount++;
                    if (gettersetter.toString().contains(varlist.get(j))) {
                        classstring.append("+");
                        classstring.append(varlist.get(j) + ":");
                        classstring.append(variabletype.get(varlist.get(j)));
                        String arraysymb = variablearray.get(varlist.get(j));
                        if (arraysymb != null) {
                            classstring.append(arraysymb);
                        }
                        classstring.append(";");
                    } else {
                        String mod = variablemod.get(varlist.get(j));
                        if (mod != null) {
                            if (varcount == 1) {
                                classstring.append("|"); }
                            if (varcount > 1) {
                                classstring.append(";");
                            }
                            classstring.append(variablemod.get(varlist.get(j)));
                            classstring.append(varlist.get(j) + ":");
                            classstring.append(variabletype.get(varlist.get(j)));
                            String arraysymb = variablearray.get(varlist.get(j));
                            if (arraysymb != null) {
                                classstring.append(arraysymb);
                            }
                        }
                    }
                }
            }
        }
        if (!constdeclaration.isEmpty()) {
            classstring.append("|");
            formatConstructor(index);
        }
        if (!classmethodlist.isEmpty()) {
             formatMethods(index);
        }
    }

    /** Format the constructors for each class */
    public static void formatConstructor(int i) {
        for (int j=0; j< constdeclaration.size(); j++)
            if (constdeclaration.get(j).contains("public"+classname.get(i))) {
                classstring.append("+" + classname.get(i) + "(");
                String[] params = constdeclarator.get(j).split("\\(");
                if(params[1].equals(")")) {
                    classstring.append(");");
                } else {
                    String[] param = params[1].split("\\)");
                    String parms = splitParameters(param[0]);
                    classstring.append( parms + ");" );
                }
            }
    }

    /** Format the methods for each class */
    public static void formatMethods(int index) {
        String methodf = "";
        worklist = (ArrayList<String>) classmethodlist.get(classname.get(index));
        if (worklist != null) {
            if (constdeclaration.isEmpty()) {
            classstring.append("|"); }
            for (String classmethod : worklist) {
                methodf = classmethod;
                if (!methodf.isEmpty()) {
                    classstring.append(classmethod + "(");
                    if (!parameterlist.isEmpty()) {
                        String cname = classmethod.substring(1);
                        List<String> param = parameterlist.get(cname);
                        for (int i = 0; i < param.size(); i++) {
                            //for (String args : param) {
                            String args = param.get(i);
                            if (args.equals("") || (args.equals(null))) {
                            } else {
                                String parms = splitParameters(args);
                                if (i == param.size() - 1) {
                                    classstring.append(parms);
                                } else {
                                    classstring.append(parms + ",");
                                }
                            }
                        }classstring.append(")");
                        if (!methodreturntype.isEmpty()) {
                            classstring.append(":" + methodreturntype.get(classmethod.substring(1)));
                            classstring.append(";");
                        }
                    }
                }
            }
        }
    }

    /** Format the class associations */
    public static void formatClassAssociations(int index) {
        List<String> classlist = classmap.get(classname.get(index));
        if (classlist != null) {
            for (String name : classlist) {
                addMapping(name, index); }
            }
    }

    /** Format the mapping of classes based on if it is associated
     * with interface or class */
    public static void addMapping(String s, int i) {
        if(interfacename.toString().contains(s)) {
                classassociation.append(("[" + classname.get(i) + "]"));
                classassociation.append("uses -.->");
                classassociation.append("[<<interface>>;" + s + "],");
        } else {
            Boolean mapped = checkParentAssociations(s, i);
            if(!mapped) {
                classassociation.append("[" + classname.get(i) + "]-");
                classassociation.append(associationmap.get(s));
                classassociation.append("[" + s + "],");
            }
        }
    }

    /** Format the superclass associations */
    public static boolean checkParentAssociations(String name,int index) {
        List<String> superclasses = superclasslist.get(classname.get(index));
        if(superclasses != null){
        for (String class1 : superclasses){
            List<String> map = classmap.get(class1);
            for (String map1 : map) {
                if (name.equals(map1)) {
                    return true;
                }
            }
        } } return false;
    }

    /** Format the superclasses */
    public static void formatSuperClass(int index) {
        worklist = (ArrayList<String>) superclasslist.get(classname.get(index));
        if (worklist != null) {
            for (String superclass : worklist) {
                if (superclass.contains(",")) {
                    List<String> listclass = Arrays.asList(superclass.split(","));
                    for (String list : listclass) {
                        classstring.append("[" +list+ "]");
                        classstring.append(("^-"));
                        classstring.append("[" + classname.get(index) + "],");
                    }
                } else {
                    classstring.append("[" +superclass + "]");
                    classstring.append(("^-"));
                    classstring.append("[" + classname.get(index) + "],"); }
            }worklist.clear();
        }
    }

    /** Overriden Listener methods from Java8ParserBaseListener to extract the information for element*/
    @Override public void enterClassName(Java8Parser.ClassNameContext ctx) {
        classname.add(ctx.getText());
    }

    @Override public void enterVariableDeclarator(Java8Parser.VariableDeclaratorContext ctx) {
        variablelist.add(ctx.getText());
    }

    @Override public void enterReferenceType(Java8Parser.ReferenceTypeContext ctx) {
        classes.add(ctx.getText());
    }

    @Override public void enterUnannClassOrInterfaceType(Java8Parser.UnannClassOrInterfaceTypeContext ctx) {
        associationclassdecl.add(ctx.getText());
    }

    @Override public void enterFieldDeclaration(Java8Parser.FieldDeclarationContext ctx){
        variablemodifier.add(ctx.getText());
    }

    @Override public void enterInterfaceName(Java8Parser.InterfaceNameContext ctx) {
        interfacename.add(ctx.getText());
    }

    @Override public void enterMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
        methoddeclaration.add(ctx.getText());
    }

    @Override public void enterMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx) {
        methoddeclartor.add(ctx.getText());
        methoddc = ctx.getText();
        String[] methodn = methoddc.split("\\(");
        methodname.add(methodn[0]);
    }

    @Override public void enterSuperclass(Java8Parser.SuperclassContext ctx) {
        superclass.add(ctx.getText());
    }

    @Override public void enterSuperinterfaces(Java8Parser.SuperinterfacesContext ctx) {
        superinterface.add(ctx.getText());
    }
    @Override public void enterConstructorDeclaration(Java8Parser.ConstructorDeclarationContext ctx) {
        constdeclaration.add(ctx.getText());
    }

    @Override public void enterInterfaceMemberDeclaration(Java8Parser.InterfaceMemberDeclarationContext ctx) {
        methoddeclaration.add(ctx.getText());
    }

    @Override public void enterConstructorDeclarator(Java8Parser.ConstructorDeclaratorContext ctx) {
        constdeclarator.add(ctx.getText());
    }
}

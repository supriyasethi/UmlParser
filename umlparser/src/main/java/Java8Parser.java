// Generated from C:/Supriya/SJSU/Semester-1/CMPE-202/Projects/cmpe202-supriyasethi/umlparser\Java8Parser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java8Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ARROW=89, COLONCOLON=90, 
		ADD_ASSIGN=91, SUB_ASSIGN=92, MUL_ASSIGN=93, DIV_ASSIGN=94, AND_ASSIGN=95, 
		OR_ASSIGN=96, XOR_ASSIGN=97, MOD_ASSIGN=98, LSHIFT_ASSIGN=99, RSHIFT_ASSIGN=100, 
		URSHIFT_ASSIGN=101, Identifier=102, AT=103, ELLIPSIS=104, WS=105, COMMENT=106, 
		LINE_COMMENT=107;
	public static final int
		RULE_literal = 0, RULE_primitiveType = 1, RULE_numericType = 2, RULE_integralType = 3, 
		RULE_floatingPointType = 4, RULE_referenceType = 5, RULE_classOrInterfaceType = 6, 
		RULE_classType = 7, RULE_classType_lf_classOrInterfaceType = 8, RULE_classType_lfno_classOrInterfaceType = 9, 
		RULE_interfaceType = 10, RULE_interfaceType_lf_classOrInterfaceType = 11, 
		RULE_interfaceType_lfno_classOrInterfaceType = 12, RULE_typeVariable = 13, 
		RULE_arrayType = 14, RULE_dims = 15, RULE_typeParameter = 16, RULE_typeParameterModifier = 17, 
		RULE_typeBound = 18, RULE_additionalBound = 19, RULE_typeArguments = 20, 
		RULE_typeArgumentList = 21, RULE_typeArgument = 22, RULE_wildcard = 23, 
		RULE_wildcardBounds = 24, RULE_packageName = 25, RULE_typeName = 26, RULE_packageOrTypeName = 27, 
		RULE_expressionName = 28, RULE_methodName = 29, RULE_ambiguousName = 30, 
		RULE_compilationUnit = 31, RULE_packageDeclaration = 32, RULE_packageModifier = 33, 
		RULE_importDeclaration = 34, RULE_singleTypeImportDeclaration = 35, RULE_typeImportOnDemandDeclaration = 36, 
		RULE_singleStaticImportDeclaration = 37, RULE_staticImportOnDemandDeclaration = 38, 
		RULE_typeDeclaration = 39, RULE_classDeclaration = 40, RULE_className = 41, 
		RULE_interfaceName = 42, RULE_normalClassDeclaration = 43, RULE_classModifier = 44, 
		RULE_typeParameters = 45, RULE_typeParameterList = 46, RULE_superclass = 47, 
		RULE_superinterfaces = 48, RULE_interfaceTypeList = 49, RULE_classBody = 50, 
		RULE_classBodyDeclaration = 51, RULE_classMemberDeclaration = 52, RULE_fieldDeclaration = 53, 
		RULE_fieldModifier = 54, RULE_variableDeclaratorList = 55, RULE_variableDeclarator = 56, 
		RULE_variableDeclaratorId = 57, RULE_variableInitializer = 58, RULE_unannType = 59, 
		RULE_unannPrimitiveType = 60, RULE_unannReferenceType = 61, RULE_unannClassOrInterfaceType = 62, 
		RULE_unannClassType = 63, RULE_unannClassType_lf_unannClassOrInterfaceType = 64, 
		RULE_unannClassType_lfno_unannClassOrInterfaceType = 65, RULE_unannInterfaceType = 66, 
		RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 67, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 68, 
		RULE_unannTypeVariable = 69, RULE_unannArrayType = 70, RULE_methodDeclaration = 71, 
		RULE_methodModifier = 72, RULE_methodHeader = 73, RULE_result = 74, RULE_methodDeclarator = 75, 
		RULE_formalParameterList = 76, RULE_formalParameters = 77, RULE_formalParameter = 78, 
		RULE_variableModifier = 79, RULE_lastFormalParameter = 80, RULE_receiverParameter = 81, 
		RULE_throws_ = 82, RULE_exceptionTypeList = 83, RULE_exceptionType = 84, 
		RULE_methodBody = 85, RULE_instanceInitializer = 86, RULE_staticInitializer = 87, 
		RULE_constructorDeclaration = 88, RULE_constructorModifier = 89, RULE_constructorDeclarator = 90, 
		RULE_simpleTypeName = 91, RULE_constructorBody = 92, RULE_explicitConstructorInvocation = 93, 
		RULE_enumDeclaration = 94, RULE_enumBody = 95, RULE_enumConstantList = 96, 
		RULE_enumConstant = 97, RULE_enumConstantModifier = 98, RULE_enumBodyDeclarations = 99, 
		RULE_interfaceDeclaration = 100, RULE_normalInterfaceDeclaration = 101, 
		RULE_interfaceModifier = 102, RULE_extendsInterfaces = 103, RULE_interfaceBody = 104, 
		RULE_interfaceMemberDeclaration = 105, RULE_constantDeclaration = 106, 
		RULE_constantModifier = 107, RULE_interfaceMethodDeclaration = 108, RULE_interfaceMethodModifier = 109, 
		RULE_annotationTypeDeclaration = 110, RULE_annotationTypeBody = 111, RULE_annotationTypeMemberDeclaration = 112, 
		RULE_annotationTypeElementDeclaration = 113, RULE_annotationTypeElementModifier = 114, 
		RULE_defaultValue = 115, RULE_annotation = 116, RULE_normalAnnotation = 117, 
		RULE_elementValuePairList = 118, RULE_elementValuePair = 119, RULE_elementValue = 120, 
		RULE_elementValueArrayInitializer = 121, RULE_elementValueList = 122, 
		RULE_markerAnnotation = 123, RULE_singleElementAnnotation = 124, RULE_arrayInitializer = 125, 
		RULE_variableInitializerList = 126, RULE_block = 127, RULE_blockStatements = 128, 
		RULE_blockStatement = 129, RULE_localVariableDeclarationStatement = 130, 
		RULE_localVariableDeclaration = 131, RULE_statement = 132, RULE_statementNoShortIf = 133, 
		RULE_statementWithoutTrailingSubstatement = 134, RULE_emptyStatement = 135, 
		RULE_labeledStatement = 136, RULE_labeledStatementNoShortIf = 137, RULE_expressionStatement = 138, 
		RULE_statementExpression = 139, RULE_ifThenStatement = 140, RULE_ifThenElseStatement = 141, 
		RULE_ifThenElseStatementNoShortIf = 142, RULE_assertStatement = 143, RULE_switchStatement = 144, 
		RULE_switchBlock = 145, RULE_switchBlockStatementGroup = 146, RULE_switchLabels = 147, 
		RULE_switchLabel = 148, RULE_enumConstantName = 149, RULE_whileStatement = 150, 
		RULE_whileStatementNoShortIf = 151, RULE_doStatement = 152, RULE_forStatement = 153, 
		RULE_forStatementNoShortIf = 154, RULE_basicForStatement = 155, RULE_basicForStatementNoShortIf = 156, 
		RULE_forInit = 157, RULE_forUpdate = 158, RULE_statementExpressionList = 159, 
		RULE_enhancedForStatement = 160, RULE_enhancedForStatementNoShortIf = 161, 
		RULE_breakStatement = 162, RULE_continueStatement = 163, RULE_returnStatement = 164, 
		RULE_throwStatement = 165, RULE_synchronizedStatement = 166, RULE_tryStatement = 167, 
		RULE_catches = 168, RULE_catchClause = 169, RULE_catchFormalParameter = 170, 
		RULE_catchType = 171, RULE_finally_ = 172, RULE_tryWithResourcesStatement = 173, 
		RULE_resourceSpecification = 174, RULE_resourceList = 175, RULE_resource = 176, 
		RULE_primary = 177, RULE_primaryNoNewArray = 178, RULE_primaryNoNewArray_lf_arrayAccess = 179, 
		RULE_primaryNoNewArray_lfno_arrayAccess = 180, RULE_primaryNoNewArray_lf_primary = 181, 
		RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 182, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 183, 
		RULE_primaryNoNewArray_lfno_primary = 184, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 185, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 186, 
		RULE_classInstanceCreationExpression = 187, RULE_classInstanceCreationExpression_lf_primary = 188, 
		RULE_classInstanceCreationExpression_lfno_primary = 189, RULE_typeArgumentsOrDiamond = 190, 
		RULE_fieldAccess = 191, RULE_fieldAccess_lf_primary = 192, RULE_fieldAccess_lfno_primary = 193, 
		RULE_arrayAccess = 194, RULE_arrayAccess_lf_primary = 195, RULE_arrayAccess_lfno_primary = 196, 
		RULE_methodInvocation = 197, RULE_methodInvocation_lf_primary = 198, RULE_methodInvocation_lfno_primary = 199, 
		RULE_argumentList = 200, RULE_methodReference = 201, RULE_methodReference_lf_primary = 202, 
		RULE_methodReference_lfno_primary = 203, RULE_arrayCreationExpression = 204, 
		RULE_dimExprs = 205, RULE_dimExpr = 206, RULE_constantExpression = 207, 
		RULE_expression = 208, RULE_lambdaExpression = 209, RULE_lambdaParameters = 210, 
		RULE_inferredFormalParameterList = 211, RULE_lambdaBody = 212, RULE_assignmentExpression = 213, 
		RULE_assignment = 214, RULE_leftHandSide = 215, RULE_assignmentOperator = 216, 
		RULE_conditionalExpression = 217, RULE_conditionalOrExpression = 218, 
		RULE_conditionalAndExpression = 219, RULE_inclusiveOrExpression = 220, 
		RULE_exclusiveOrExpression = 221, RULE_andExpression = 222, RULE_equalityExpression = 223, 
		RULE_relationalExpression = 224, RULE_shiftExpression = 225, RULE_additiveExpression = 226, 
		RULE_multiplicativeExpression = 227, RULE_unaryExpression = 228, RULE_preIncrementExpression = 229, 
		RULE_preDecrementExpression = 230, RULE_unaryExpressionNotPlusMinus = 231, 
		RULE_postfixExpression = 232, RULE_postIncrementExpression = 233, RULE_postIncrementExpression_lf_postfixExpression = 234, 
		RULE_postDecrementExpression = 235, RULE_postDecrementExpression_lf_postfixExpression = 236, 
		RULE_castExpression = 237;
	private static String[] makeRuleNames() {
		return new String[] {
			"literal", "primitiveType", "numericType", "integralType", "floatingPointType", 
			"referenceType", "classOrInterfaceType", "classType", "classType_lf_classOrInterfaceType", 
			"classType_lfno_classOrInterfaceType", "interfaceType", "interfaceType_lf_classOrInterfaceType", 
			"interfaceType_lfno_classOrInterfaceType", "typeVariable", "arrayType", 
			"dims", "typeParameter", "typeParameterModifier", "typeBound", "additionalBound", 
			"typeArguments", "typeArgumentList", "typeArgument", "wildcard", "wildcardBounds", 
			"packageName", "typeName", "packageOrTypeName", "expressionName", "methodName", 
			"ambiguousName", "compilationUnit", "packageDeclaration", "packageModifier", 
			"importDeclaration", "singleTypeImportDeclaration", "typeImportOnDemandDeclaration", 
			"singleStaticImportDeclaration", "staticImportOnDemandDeclaration", "typeDeclaration", 
			"classDeclaration", "className", "interfaceName", "normalClassDeclaration", 
			"classModifier", "typeParameters", "typeParameterList", "superclass", 
			"superinterfaces", "interfaceTypeList", "classBody", "classBodyDeclaration", 
			"classMemberDeclaration", "fieldDeclaration", "fieldModifier", "variableDeclaratorList", 
			"variableDeclarator", "variableDeclaratorId", "variableInitializer", 
			"unannType", "unannPrimitiveType", "unannReferenceType", "unannClassOrInterfaceType", 
			"unannClassType", "unannClassType_lf_unannClassOrInterfaceType", "unannClassType_lfno_unannClassOrInterfaceType", 
			"unannInterfaceType", "unannInterfaceType_lf_unannClassOrInterfaceType", 
			"unannInterfaceType_lfno_unannClassOrInterfaceType", "unannTypeVariable", 
			"unannArrayType", "methodDeclaration", "methodModifier", "methodHeader", 
			"result", "methodDeclarator", "formalParameterList", "formalParameters", 
			"formalParameter", "variableModifier", "lastFormalParameter", "receiverParameter", 
			"throws_", "exceptionTypeList", "exceptionType", "methodBody", "instanceInitializer", 
			"staticInitializer", "constructorDeclaration", "constructorModifier", 
			"constructorDeclarator", "simpleTypeName", "constructorBody", "explicitConstructorInvocation", 
			"enumDeclaration", "enumBody", "enumConstantList", "enumConstant", "enumConstantModifier", 
			"enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
			"interfaceModifier", "extendsInterfaces", "interfaceBody", "interfaceMemberDeclaration", 
			"constantDeclaration", "constantModifier", "interfaceMethodDeclaration", 
			"interfaceMethodModifier", "annotationTypeDeclaration", "annotationTypeBody", 
			"annotationTypeMemberDeclaration", "annotationTypeElementDeclaration", 
			"annotationTypeElementModifier", "defaultValue", "annotation", "normalAnnotation", 
			"elementValuePairList", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
			"elementValueList", "markerAnnotation", "singleElementAnnotation", "arrayInitializer", 
			"variableInitializerList", "block", "blockStatements", "blockStatement", 
			"localVariableDeclarationStatement", "localVariableDeclaration", "statement", 
			"statementNoShortIf", "statementWithoutTrailingSubstatement", "emptyStatement", 
			"labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
			"statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
			"assertStatement", "switchStatement", "switchBlock", "switchBlockStatementGroup", 
			"switchLabels", "switchLabel", "enumConstantName", "whileStatement", 
			"whileStatementNoShortIf", "doStatement", "forStatement", "forStatementNoShortIf", 
			"basicForStatement", "basicForStatementNoShortIf", "forInit", "forUpdate", 
			"statementExpressionList", "enhancedForStatement", "enhancedForStatementNoShortIf", 
			"breakStatement", "continueStatement", "returnStatement", "throwStatement", 
			"synchronizedStatement", "tryStatement", "catches", "catchClause", "catchFormalParameter", 
			"catchType", "finally_", "tryWithResourcesStatement", "resourceSpecification", 
			"resourceList", "resource", "primary", "primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", 
			"primaryNoNewArray_lfno_arrayAccess", "primaryNoNewArray_lf_primary", 
			"primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", "primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", 
			"primaryNoNewArray_lfno_primary", "primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", 
			"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", "classInstanceCreationExpression", 
			"classInstanceCreationExpression_lf_primary", "classInstanceCreationExpression_lfno_primary", 
			"typeArgumentsOrDiamond", "fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", 
			"arrayAccess", "arrayAccess_lf_primary", "arrayAccess_lfno_primary", 
			"methodInvocation", "methodInvocation_lf_primary", "methodInvocation_lfno_primary", 
			"argumentList", "methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", 
			"arrayCreationExpression", "dimExprs", "dimExpr", "constantExpression", 
			"expression", "lambdaExpression", "lambdaParameters", "inferredFormalParameterList", 
			"lambdaBody", "assignmentExpression", "assignment", "leftHandSide", "assignmentOperator", 
			"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
			"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
			"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "preIncrementExpression", "preDecrementExpression", 
			"unaryExpressionNotPlusMinus", "postfixExpression", "postIncrementExpression", 
			"postIncrementExpression_lf_postfixExpression", "postDecrementExpression", 
			"postDecrementExpression_lf_postfixExpression", "castExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
			"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null, 
			null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
			"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", "'::'", "'+='", 
			"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
			"'>>>='", null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", 
			"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
			"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", 
			"COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT", "ELLIPSIS", "WS", 
			"COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Java8Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Java8Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(Java8Parser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Java8Parser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(Java8Parser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(Java8Parser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(Java8Parser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(Java8Parser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode BOOLEAN() { return getToken(Java8Parser.BOOLEAN, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primitiveType);
		int _la;
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(478);
					annotation();
					}
					}
					setState(483);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(484);
				numericType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(485);
					annotation();
					}
					}
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(491);
				match(BOOLEAN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitNumericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitNumericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numericType);
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				floatingPointType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(Java8Parser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(Java8Parser.SHORT, 0); }
		public TerminalNode INT() { return getToken(Java8Parser.INT, 0); }
		public TerminalNode LONG() { return getToken(Java8Parser.LONG, 0); }
		public TerminalNode CHAR() { return getToken(Java8Parser.CHAR, 0); }
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitIntegralType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitIntegralType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(Java8Parser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(Java8Parser.DOUBLE, 0); }
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFloatingPointType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitFloatingPointType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_referenceType);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				arrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(507);
				classType_lfno_classOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(508);
				interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(513);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(511);
						classType_lf_classOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(512);
						interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classType);
		int _la;
		try {
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(518);
					annotation();
					}
					}
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(524);
				match(Identifier);
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(525);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				classOrInterfaceType();
				setState(529);
				match(DOT);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(530);
					annotation();
					}
					}
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(536);
				match(Identifier);
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(537);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitClassType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(DOT);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(543);
				annotation();
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549);
			match(Identifier);
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(550);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitClassType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(553);
				annotation();
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(559);
			match(Identifier);
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(560);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitInterfaceType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			classType_lf_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitInterfaceType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			classType_lfno_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(569);
				annotation();
				}
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(575);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayType);
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				primitiveType();
				setState(578);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				classOrInterfaceType();
				setState(581);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				typeVariable();
				setState(584);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(588);
				annotation();
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(594);
			match(LBRACK);
			setState(595);
			match(RBRACK);
			setState(606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(599);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(596);
						annotation();
						}
						}
						setState(601);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(602);
					match(LBRACK);
					setState(603);
					match(RBRACK);
					}
					} 
				}
				setState(608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}
		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(609);
				typeParameterModifier();
				}
				}
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(615);
			match(Identifier);
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(616);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeParameterModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitTypeParameterModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(Java8Parser.EXTENDS, 0); }
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeBound);
		int _la;
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				match(EXTENDS);
				setState(622);
				typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				match(EXTENDS);
				setState(624);
				classOrInterfaceType();
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(625);
					additionalBound();
					}
					}
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionalBoundContext extends ParserRuleContext {
		public TerminalNode BITAND() { return getToken(Java8Parser.BITAND, 0); }
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAdditionalBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitAdditionalBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(BITAND);
			setState(634);
			interfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Java8Parser.LT, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode GT() { return getToken(Java8Parser.GT, 0); }
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(LT);
			setState(637);
			typeArgumentList();
			setState(638);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			typeArgument();
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(641);
				match(COMMA);
				setState(642);
				typeArgument();
				}
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArgument);
		try {
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				wildcard();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(Java8Parser.QUESTION, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(652);
				annotation();
				}
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(658);
			match(QUESTION);
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(659);
				wildcardBounds();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardBoundsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(Java8Parser.EXTENDS, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitWildcardBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitWildcardBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcardBounds);
		try {
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				match(EXTENDS);
				setState(663);
				referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				match(SUPER);
				setState(665);
				referenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPackageName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPackageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(669);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(676);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(671);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(672);
					match(DOT);
					setState(673);
					match(Identifier);
					}
					} 
				}
				setState(678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeName);
		try {
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				packageOrTypeName(0);
				setState(681);
				match(DOT);
				setState(682);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPackageOrTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPackageOrTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(687);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(694);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(689);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(690);
					match(DOT);
					setState(691);
					match(Identifier);
					}
					} 
				}
				setState(696);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExpressionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitExpressionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressionName);
		try {
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(698);
				ambiguousName(0);
				setState(699);
				match(DOT);
				setState(700);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAmbiguousName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitAmbiguousName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(707);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(714);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(709);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(710);
					match(DOT);
					setState(711);
					match(Identifier);
					}
					} 
				}
				setState(716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Java8Parser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(717);
				packageDeclaration();
				}
				break;
			}
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(720);
				importDeclaration();
				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT) {
				{
				{
				setState(726);
				typeDeclaration();
				}
				}
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(732);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(Java8Parser.PACKAGE, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}
		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(734);
				packageModifier();
				}
				}
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(740);
			match(PACKAGE);
			setState(741);
			packageName(0);
			setState(742);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PackageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPackageModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPackageModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPackageModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_importDeclaration);
		try {
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(746);
				singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(747);
				typeImportOnDemandDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(748);
				singleStaticImportDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(749);
				staticImportOnDemandDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Java8Parser.IMPORT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSingleTypeImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSingleTypeImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitSingleTypeImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(IMPORT);
			setState(753);
			typeName();
			setState(754);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Java8Parser.IMPORT, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode MUL() { return getToken(Java8Parser.MUL, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeImportOnDemandDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitTypeImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(IMPORT);
			setState(757);
			packageOrTypeName(0);
			setState(758);
			match(DOT);
			setState(759);
			match(MUL);
			setState(760);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Java8Parser.IMPORT, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSingleStaticImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSingleStaticImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitSingleStaticImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(IMPORT);
			setState(763);
			match(STATIC);
			setState(764);
			typeName();
			setState(765);
			match(DOT);
			setState(766);
			match(Identifier);
			setState(767);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Java8Parser.IMPORT, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode MUL() { return getToken(Java8Parser.MUL, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterStaticImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitStaticImportOnDemandDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitStaticImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(IMPORT);
			setState(770);
			match(STATIC);
			setState(771);
			typeName();
			setState(772);
			match(DOT);
			setState(773);
			match(MUL);
			setState(774);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeDeclaration);
		try {
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(778);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_classDeclaration);
		try {
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public InterfaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitInterfaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceNameContext interfaceName() throws RecognitionException {
		InterfaceNameContext _localctx = new InterfaceNameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_interfaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(Java8Parser.CLASS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitNormalClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitNormalClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(789);
				classModifier();
				}
				}
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(795);
			match(CLASS);
			setState(796);
			className();
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(797);
				typeParameters();
				}
			}

			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(800);
				superclass();
				}
			}

			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(803);
				superinterfaces();
				}
			}

			setState(806);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(Java8Parser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(Java8Parser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(Java8Parser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(Java8Parser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(Java8Parser.STRICTFP, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitClassModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_classModifier);
		try {
			setState(816);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(809);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(810);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(811);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(812);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(813);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(814);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(815);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Java8Parser.LT, 0); }
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TerminalNode GT() { return getToken(Java8Parser.GT, 0); }
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(LT);
			setState(819);
			typeParameterList();
			setState(820);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			typeParameter();
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(823);
				match(COMMA);
				setState(824);
				typeParameter();
				}
				}
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(Java8Parser.EXTENDS, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSuperclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitSuperclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(EXTENDS);
			setState(831);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperinterfacesContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(Java8Parser.IMPLEMENTS, 0); }
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSuperinterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSuperinterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitSuperinterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(IMPLEMENTS);
			setState(834);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitInterfaceTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			interfaceType();
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(837);
				match(COMMA);
				setState(838);
				interfaceType();
				}
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(LBRACE);
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(845);
				classBodyDeclaration();
				}
				}
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(851);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class,0);
		}
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classBodyDeclaration);
		try {
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
				instanceInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(855);
				staticInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(856);
				constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_classMemberDeclaration);
		try {
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(859);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(861);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(862);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(863);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				{
				setState(866);
				fieldModifier();
				}
				}
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(872);
			unannType();
			setState(873);
			variableDeclaratorList();
			setState(874);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(Java8Parser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(Java8Parser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(Java8Parser.FINAL, 0); }
		public TerminalNode TRANSIENT() { return getToken(Java8Parser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(Java8Parser.VOLATILE, 0); }
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFieldModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitFieldModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_fieldModifier);
		try {
			setState(884);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(878);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(879);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(880);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(881);
				match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(882);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(883);
				match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitVariableDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitVariableDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			variableDeclarator();
			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(887);
				match(COMMA);
				setState(888);
				variableDeclarator();
				}
				}
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Java8Parser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			variableDeclaratorId();
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(895);
				match(ASSIGN);
				setState(896);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			match(Identifier);
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(900);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_variableInitializer);
		try {
			setState(905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(904);
				arrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitUnannType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unannType);
		try {
			setState(909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
				unannReferenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(Java8Parser.BOOLEAN, 0); }
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitUnannPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unannPrimitiveType);
		try {
			setState(913);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(911);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitUnannReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unannReferenceType);
		try {
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(915);
				unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(916);
				unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(917);
				unannArrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitUnannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(920);
				unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(921);
				unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(928);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(926);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(924);
						unannClassType_lf_unannClassOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(925);
						unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(930);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitUnannClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unannClassType);
		int _la;
		try {
			setState(947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(931);
				match(Identifier);
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(932);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
				unannClassOrInterfaceType();
				setState(936);
				match(DOT);
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(937);
					annotation();
					}
					}
					setState(942);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(943);
				match(Identifier);
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(944);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitUnannClassType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			match(DOT);
			setState(953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(950);
				annotation();
				}
				}
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(956);
			match(Identifier);
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(957);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitUnannClassType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(Identifier);
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(961);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitUnannInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			unannClassType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			unannClassType_lf_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			unannClassType_lfno_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitUnannTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitUnannArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_unannArrayType);
		try {
			setState(981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(972);
				unannPrimitiveType();
				setState(973);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(975);
				unannClassOrInterfaceType();
				setState(976);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(978);
				unannTypeVariable();
				setState(979);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				{
				setState(983);
				methodModifier();
				}
				}
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(989);
			methodHeader();
			setState(990);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(Java8Parser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(Java8Parser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(Java8Parser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(Java8Parser.FINAL, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(Java8Parser.SYNCHRONIZED, 0); }
		public TerminalNode NATIVE() { return getToken(Java8Parser.NATIVE, 0); }
		public TerminalNode STRICTFP() { return getToken(Java8Parser.STRICTFP, 0); }
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_methodModifier);
		try {
			setState(1002);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(992);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(993);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(994);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(995);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(996);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(997);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(998);
				match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(999);
				match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1000);
				match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1001);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitMethodHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_methodHeader);
		int _la;
		try {
			setState(1021);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				result();
				setState(1005);
				methodDeclarator();
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1006);
					throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1009);
				typeParameters();
				setState(1013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1010);
					annotation();
					}
					}
					setState(1015);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1016);
				result();
				setState(1017);
				methodDeclarator();
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1018);
					throws_();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Java8Parser.VOID, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_result);
		try {
			setState(1025);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1023);
				unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1024);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitMethodDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(Identifier);
			setState(1028);
			match(LPAREN);
			setState(1030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1029);
				formalParameterList();
				}
			}

			setState(1032);
			match(RPAREN);
			setState(1034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1033);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Java8Parser.COMMA, 0); }
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_formalParameterList);
		try {
			setState(1042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1036);
				receiverParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037);
				formalParameters();
				setState(1038);
				match(COMMA);
				setState(1039);
				lastFormalParameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1041);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_formalParameters);
		try {
			int _alt;
			setState(1060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1044);
				formalParameter();
				setState(1049);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1045);
						match(COMMA);
						setState(1046);
						formalParameter();
						}
						} 
					}
					setState(1051);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1052);
				receiverParameter();
				setState(1057);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1053);
						match(COMMA);
						setState(1054);
						formalParameter();
						}
						} 
					}
					setState(1059);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1062);
				variableModifier();
				}
				}
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1068);
			unannType();
			setState(1069);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(Java8Parser.FINAL, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_variableModifier);
		try {
			setState(1073);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1072);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(Java8Parser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1092);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1075);
					variableModifier();
					}
					}
					setState(1080);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1081);
				unannType();
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1082);
					annotation();
					}
					}
					setState(1087);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1088);
				match(ELLIPSIS);
				setState(1089);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1091);
				formalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(Java8Parser.THIS, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitReceiverParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitReceiverParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1094);
				annotation();
				}
				}
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1100);
			unannType();
			setState(1103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1101);
				match(Identifier);
				setState(1102);
				match(DOT);
				}
			}

			setState(1105);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throws_Context extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(Java8Parser.THROWS, 0); }
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterThrows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitThrows_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitThrows_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 164, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(THROWS);
			setState(1108);
			exceptionTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExceptionTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExceptionTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitExceptionTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			exceptionType();
			setState(1115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1111);
				match(COMMA);
				setState(1112);
				exceptionType();
				}
				}
				setState(1117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExceptionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitExceptionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_exceptionType);
		try {
			setState(1120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1118);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1119);
				typeVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_methodBody);
		try {
			setState(1124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1122);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInstanceInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInstanceInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitInstanceInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticInitializerContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitStaticInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitStaticInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			match(STATIC);
			setState(1129);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				{
				setState(1131);
				constructorModifier();
				}
				}
				setState(1136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1137);
			constructorDeclarator();
			setState(1139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1138);
				throws_();
				}
			}

			setState(1141);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(Java8Parser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(Java8Parser.PRIVATE, 0); }
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConstructorModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitConstructorModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_constructorModifier);
		try {
			setState(1147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1143);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1144);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1145);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1146);
				match(PRIVATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConstructorDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitConstructorDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1149);
				typeParameters();
				}
			}

			setState(1152);
			simpleTypeName();
			setState(1153);
			match(LPAREN);
			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1154);
				formalParameterList();
				}
			}

			setState(1157);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSimpleTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitSimpleTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			match(LBRACE);
			setState(1163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1162);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1165);
				blockStatements();
				}
			}

			setState(1168);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(Java8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExplicitConstructorInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitExplicitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1170);
					typeArguments();
					}
				}

				setState(1173);
				match(THIS);
				setState(1174);
				match(LPAREN);
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1175);
					argumentList();
					}
				}

				setState(1178);
				match(RPAREN);
				setState(1179);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1180);
					typeArguments();
					}
				}

				setState(1183);
				match(SUPER);
				setState(1184);
				match(LPAREN);
				setState(1186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1185);
					argumentList();
					}
				}

				setState(1188);
				match(RPAREN);
				setState(1189);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1190);
				expressionName();
				setState(1191);
				match(DOT);
				setState(1193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1192);
					typeArguments();
					}
				}

				setState(1195);
				match(SUPER);
				setState(1196);
				match(LPAREN);
				setState(1198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1197);
					argumentList();
					}
				}

				setState(1200);
				match(RPAREN);
				setState(1201);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1203);
				primary();
				setState(1204);
				match(DOT);
				setState(1206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1205);
					typeArguments();
					}
				}

				setState(1208);
				match(SUPER);
				setState(1209);
				match(LPAREN);
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1210);
					argumentList();
					}
				}

				setState(1213);
				match(RPAREN);
				setState(1214);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(Java8Parser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1218);
				classModifier();
				}
				}
				setState(1223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1224);
			match(ENUM);
			setState(1225);
			match(Identifier);
			setState(1227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1226);
				superinterfaces();
				}
			}

			setState(1229);
			enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Java8Parser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			match(LBRACE);
			setState(1233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1232);
				enumConstantList();
				}
			}

			setState(1236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1235);
				match(COMMA);
				}
			}

			setState(1239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1238);
				enumBodyDeclarations();
				}
			}

			setState(1241);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public EnumConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEnumConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEnumConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitEnumConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantListContext enumConstantList() throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			enumConstant();
			setState(1248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1244);
					match(COMMA);
					setState(1245);
					enumConstant();
					}
					} 
				}
				setState(1250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<EnumConstantModifierContext> enumConstantModifier() {
			return getRuleContexts(EnumConstantModifierContext.class);
		}
		public EnumConstantModifierContext enumConstantModifier(int i) {
			return getRuleContext(EnumConstantModifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1251);
				enumConstantModifier();
				}
				}
				setState(1256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1257);
			match(Identifier);
			setState(1263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1258);
				match(LPAREN);
				setState(1260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1259);
					argumentList();
					}
				}

				setState(1262);
				match(RPAREN);
				}
			}

			setState(1266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1265);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public EnumConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEnumConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEnumConstantModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitEnumConstantModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantModifierContext enumConstantModifier() throws RecognitionException {
		EnumConstantModifierContext _localctx = new EnumConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			match(SEMI);
			setState(1274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1271);
				classBodyDeclaration();
				}
				}
				setState(1276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_interfaceDeclaration);
		try {
			setState(1279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1277);
				normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1278);
				annotationTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(Java8Parser.INTERFACE, 0); }
		public InterfaceNameContext interfaceName() {
			return getRuleContext(InterfaceNameContext.class,0);
		}
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitNormalInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitNormalInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1281);
				interfaceModifier();
				}
				}
				setState(1286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1287);
			match(INTERFACE);
			setState(1288);
			interfaceName();
			setState(1290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1289);
				typeParameters();
				}
			}

			setState(1293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1292);
				extendsInterfaces();
				}
			}

			setState(1295);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(Java8Parser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(Java8Parser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(Java8Parser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(Java8Parser.STRICTFP, 0); }
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_interfaceModifier);
		try {
			setState(1304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1297);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1298);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1299);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1300);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1301);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1302);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1303);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(Java8Parser.EXTENDS, 0); }
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExtendsInterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitExtendsInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			match(EXTENDS);
			setState(1307);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			match(LBRACE);
			setState(1313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1310);
				interfaceMemberDeclaration();
				}
				}
				setState(1315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1316);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_interfaceMemberDeclaration);
		try {
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1318);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1319);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1320);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1321);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1322);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				{
				setState(1325);
				constantModifier();
				}
				}
				setState(1330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1331);
			unannType();
			setState(1332);
			variableDeclaratorList();
			setState(1333);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(Java8Parser.FINAL, 0); }
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConstantModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitConstantModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_constantModifier);
		try {
			setState(1339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1335);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1336);
				match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1337);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1338);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1341);
				interfaceMethodModifier();
				}
				}
				setState(1346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1347);
			methodHeader();
			setState(1348);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(Java8Parser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(Java8Parser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(Java8Parser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitInterfaceMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_interfaceMethodModifier);
		try {
			setState(1356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1350);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1351);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1352);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1353);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1354);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1355);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Java8Parser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(Java8Parser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1358);
					interfaceModifier();
					}
					} 
				}
				setState(1363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			setState(1364);
			match(AT);
			setState(1365);
			match(INTERFACE);
			setState(1366);
			match(Identifier);
			setState(1367);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}
		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			match(LBRACE);
			setState(1373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(1370);
				annotationTypeMemberDeclaration();
				}
				}
				setState(1375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1376);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitAnnotationTypeMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1378);
				annotationTypeElementDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1379);
				constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1380);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1381);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1382);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}
		public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class,i);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1385);
				annotationTypeElementModifier();
				}
				}
				setState(1390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1391);
			unannType();
			setState(1392);
			match(Identifier);
			setState(1393);
			match(LPAREN);
			setState(1394);
			match(RPAREN);
			setState(1396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1395);
				dims();
				}
			}

			setState(1399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1398);
				defaultValue();
				}
			}

			setState(1401);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(Java8Parser.ABSTRACT, 0); }
		public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAnnotationTypeElementModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAnnotationTypeElementModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitAnnotationTypeElementModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier() throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_annotationTypeElementModifier);
		try {
			setState(1406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1403);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1404);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1405);
				match(ABSTRACT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(Java8Parser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			match(DEFAULT);
			setState(1409);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_annotation);
		try {
			setState(1414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1411);
				normalAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1412);
				markerAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1413);
				singleElementAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Java8Parser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class,0);
		}
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterNormalAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitNormalAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitNormalAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			match(AT);
			setState(1417);
			typeName();
			setState(1418);
			match(LPAREN);
			setState(1420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1419);
				elementValuePairList();
				}
			}

			setState(1422);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairListContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterElementValuePairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitElementValuePairList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitElementValuePairList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			elementValuePair();
			setState(1429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1425);
				match(COMMA);
				setState(1426);
				elementValuePair();
				}
				}
				setState(1431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(Java8Parser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
			match(Identifier);
			setState(1433);
			match(ASSIGN);
			setState(1434);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_elementValue);
		try {
			setState(1439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1436);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1437);
				elementValueArrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1438);
				annotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Java8Parser.COMMA, 0); }
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			match(LBRACE);
			setState(1443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1442);
				elementValueList();
				}
			}

			setState(1446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1445);
				match(COMMA);
				}
			}

			setState(1448);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueListContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterElementValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitElementValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitElementValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			elementValue();
			setState(1455);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1451);
					match(COMMA);
					setState(1452);
					elementValue();
					}
					} 
				}
				setState(1457);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Java8Parser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMarkerAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMarkerAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitMarkerAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			match(AT);
			setState(1459);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Java8Parser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSingleElementAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSingleElementAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitSingleElementAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			match(AT);
			setState(1462);
			typeName();
			setState(1463);
			match(LPAREN);
			setState(1464);
			elementValue();
			setState(1465);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Java8Parser.COMMA, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1467);
			match(LBRACE);
			setState(1469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1468);
				variableInitializerList();
				}
			}

			setState(1472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1471);
				match(COMMA);
				}
			}

			setState(1474);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitVariableInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitVariableInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			variableInitializer();
			setState(1481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1477);
					match(COMMA);
					setState(1478);
					variableInitializer();
					}
					} 
				}
				setState(1483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			match(LBRACE);
			setState(1486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1485);
				blockStatements();
				}
			}

			setState(1488);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1490);
				blockStatement();
				}
				}
				setState(1493); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_blockStatement);
		try {
			setState(1498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1495);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1496);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1497);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			localVariableDeclaration();
			setState(1501);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1503);
				variableModifier();
				}
				}
				setState(1508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1509);
			unannType();
			setState(1510);
			variableDeclaratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_statement);
		try {
			setState(1518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1512);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1513);
				labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1514);
				ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1515);
				ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1516);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1517);
				forStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_statementNoShortIf);
		try {
			setState(1525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1520);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1521);
				labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1522);
				ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1523);
				whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1524);
				forStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitStatementWithoutTrailingSubstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1527);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1528);
				emptyStatement();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case INC:
			case DEC:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1529);
				expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1530);
				assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(1531);
				switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(1532);
				doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1533);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1534);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1535);
				returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1536);
				synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1537);
				throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(1538);
				tryStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1541);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			match(Identifier);
			setState(1544);
			match(COLON);
			setState(1545);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLabeledStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLabeledStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitLabeledStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			match(Identifier);
			setState(1548);
			match(COLON);
			setState(1549);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			statementExpression();
			setState(1552);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_statementExpression);
		try {
			setState(1561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1554);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1555);
				preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1556);
				preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1557);
				postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1558);
				postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1559);
				methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1560);
				classInstanceCreationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Java8Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitIfThenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitIfThenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
			match(IF);
			setState(1564);
			match(LPAREN);
			setState(1565);
			expression();
			setState(1566);
			match(RPAREN);
			setState(1567);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Java8Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(Java8Parser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitIfThenElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitIfThenElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1569);
			match(IF);
			setState(1570);
			match(LPAREN);
			setState(1571);
			expression();
			setState(1572);
			match(RPAREN);
			setState(1573);
			statementNoShortIf();
			setState(1574);
			match(ELSE);
			setState(1575);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Java8Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Java8Parser.ELSE, 0); }
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterIfThenElseStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitIfThenElseStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitIfThenElseStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			match(IF);
			setState(1578);
			match(LPAREN);
			setState(1579);
			expression();
			setState(1580);
			match(RPAREN);
			setState(1581);
			statementNoShortIf();
			setState(1582);
			match(ELSE);
			setState(1583);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(Java8Parser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAssertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_assertStatement);
		try {
			setState(1595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1585);
				match(ASSERT);
				setState(1586);
				expression();
				setState(1587);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1589);
				match(ASSERT);
				setState(1590);
				expression();
				setState(1591);
				match(COLON);
				setState(1592);
				expression();
				setState(1593);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(Java8Parser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597);
			match(SWITCH);
			setState(1598);
			match(LPAREN);
			setState(1599);
			expression();
			setState(1600);
			match(RPAREN);
			setState(1601);
			switchBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
			match(LBRACE);
			setState(1607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1604);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(1609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			}
			setState(1613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1610);
				switchLabel();
				}
				}
				setState(1615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1616);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1618);
			switchLabels();
			setState(1619);
			blockStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSwitchLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitSwitchLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621);
			switchLabel();
			setState(1625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1622);
				switchLabel();
				}
				}
				setState(1627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(Java8Parser.CASE, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(Java8Parser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_switchLabel);
		try {
			setState(1638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1628);
				match(CASE);
				setState(1629);
				constantExpression();
				setState(1630);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1632);
				match(CASE);
				setState(1633);
				enumConstantName();
				setState(1634);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1636);
				match(DEFAULT);
				setState(1637);
				match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEnumConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Java8Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			match(WHILE);
			setState(1643);
			match(LPAREN);
			setState(1644);
			expression();
			setState(1645);
			match(RPAREN);
			setState(1646);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Java8Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterWhileStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitWhileStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitWhileStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1648);
			match(WHILE);
			setState(1649);
			match(LPAREN);
			setState(1650);
			expression();
			setState(1651);
			match(RPAREN);
			setState(1652);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(Java8Parser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(Java8Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1654);
			match(DO);
			setState(1655);
			statement();
			setState(1656);
			match(WHILE);
			setState(1657);
			match(LPAREN);
			setState(1658);
			expression();
			setState(1659);
			match(RPAREN);
			setState(1660);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_forStatement);
		try {
			setState(1664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1662);
				basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1663);
				enhancedForStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_forStatementNoShortIf);
		try {
			setState(1668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1666);
				basicForStatementNoShortIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1667);
				enhancedForStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Java8Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(Java8Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Java8Parser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterBasicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitBasicForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitBasicForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			match(FOR);
			setState(1671);
			match(LPAREN);
			setState(1673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1672);
				forInit();
				}
			}

			setState(1675);
			match(SEMI);
			setState(1677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1676);
				expression();
				}
			}

			setState(1679);
			match(SEMI);
			setState(1681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1680);
				forUpdate();
				}
			}

			setState(1683);
			match(RPAREN);
			setState(1684);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Java8Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(Java8Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Java8Parser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterBasicForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitBasicForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitBasicForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686);
			match(FOR);
			setState(1687);
			match(LPAREN);
			setState(1689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1688);
				forInit();
				}
			}

			setState(1691);
			match(SEMI);
			setState(1693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1692);
				expression();
				}
			}

			setState(1695);
			match(SEMI);
			setState(1697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1696);
				forUpdate();
				}
			}

			setState(1699);
			match(RPAREN);
			setState(1700);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_forInit);
		try {
			setState(1704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1702);
				statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1703);
				localVariableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			statementExpressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionListContext extends ParserRuleContext {
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitStatementExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitStatementExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
			statementExpression();
			setState(1713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1709);
				match(COMMA);
				setState(1710);
				statementExpression();
				}
				}
				setState(1715);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Java8Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEnhancedForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEnhancedForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitEnhancedForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1716);
			match(FOR);
			setState(1717);
			match(LPAREN);
			setState(1721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1718);
				variableModifier();
				}
				}
				setState(1723);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1724);
			unannType();
			setState(1725);
			variableDeclaratorId();
			setState(1726);
			match(COLON);
			setState(1727);
			expression();
			setState(1728);
			match(RPAREN);
			setState(1729);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Java8Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEnhancedForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEnhancedForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitEnhancedForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			match(FOR);
			setState(1732);
			match(LPAREN);
			setState(1736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1733);
				variableModifier();
				}
				}
				setState(1738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1739);
			unannType();
			setState(1740);
			variableDeclaratorId();
			setState(1741);
			match(COLON);
			setState(1742);
			expression();
			setState(1743);
			match(RPAREN);
			setState(1744);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(Java8Parser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			match(BREAK);
			setState(1748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1747);
				match(Identifier);
				}
			}

			setState(1750);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(Java8Parser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			match(CONTINUE);
			setState(1754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1753);
				match(Identifier);
				}
			}

			setState(1756);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Java8Parser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			match(RETURN);
			setState(1760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1759);
				expression();
				}
			}

			setState(1762);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(Java8Parser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			match(THROW);
			setState(1765);
			expression();
			setState(1766);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public TerminalNode SYNCHRONIZED() { return getToken(Java8Parser.SYNCHRONIZED, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSynchronizedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitSynchronizedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
			match(SYNCHRONIZED);
			setState(1769);
			match(LPAREN);
			setState(1770);
			expression();
			setState(1771);
			match(RPAREN);
			setState(1772);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(Java8Parser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_tryStatement);
		int _la;
		try {
			setState(1786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1774);
				match(TRY);
				setState(1775);
				block();
				setState(1776);
				catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1778);
				match(TRY);
				setState(1779);
				block();
				setState(1781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1780);
					catches();
					}
				}

				setState(1783);
				finally_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1785);
				tryWithResourcesStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitCatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
			catchClause();
			setState(1792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1789);
				catchClause();
				}
				}
				setState(1794);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(Java8Parser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1795);
			match(CATCH);
			setState(1796);
			match(LPAREN);
			setState(1797);
			catchFormalParameter();
			setState(1798);
			match(RPAREN);
			setState(1799);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitCatchFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitCatchFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1801);
				variableModifier();
				}
				}
				setState(1806);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1807);
			catchType();
			setState(1808);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public List<TerminalNode> BITOR() { return getTokens(Java8Parser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(Java8Parser.BITOR, i);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
			unannClassType();
			setState(1815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1811);
				match(BITOR);
				setState(1812);
				classType();
				}
				}
				setState(1817);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_Context extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(Java8Parser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFinally_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFinally_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitFinally_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 344, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			match(FINALLY);
			setState(1819);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryWithResourcesStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(Java8Parser.TRY, 0); }
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResourcesStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTryWithResourcesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTryWithResourcesStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitTryWithResourcesStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1821);
			match(TRY);
			setState(1822);
			resourceSpecification();
			setState(1823);
			block();
			setState(1825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1824);
				catches();
				}
			}

			setState(1828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1827);
				finally_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			match(LPAREN);
			setState(1831);
			resourceList();
			setState(1833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1832);
				match(SEMI);
				}
			}

			setState(1835);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceListContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(Java8Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Java8Parser.SEMI, i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterResourceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitResourceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitResourceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1837);
			resource();
			setState(1842);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1838);
					match(SEMI);
					setState(1839);
					resource();
					}
					} 
				}
				setState(1844);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Java8Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1845);
				variableModifier();
				}
				}
				setState(1850);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1851);
			unannType();
			setState(1852);
			variableDeclaratorId();
			setState(1853);
			match(ASSIGN);
			setState(1854);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1856);
				primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(1857);
				arrayCreationExpression();
				}
				break;
			}
			setState(1863);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1860);
					primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(1865);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(Java8Parser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(Java8Parser.VOID, 0); }
		public TerminalNode THIS() { return getToken(Java8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(1895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1866);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1867);
				typeName();
				setState(1872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1868);
					match(LBRACK);
					setState(1869);
					match(RBRACK);
					}
					}
					setState(1874);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1875);
				match(DOT);
				setState(1876);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1878);
				match(VOID);
				setState(1879);
				match(DOT);
				setState(1880);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1881);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1882);
				typeName();
				setState(1883);
				match(DOT);
				setState(1884);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1886);
				match(LPAREN);
				setState(1887);
				expression();
				setState(1888);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1890);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1891);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1892);
				arrayAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1893);
				methodInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1894);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(Java8Parser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(Java8Parser.VOID, 0); }
		public TerminalNode THIS() { return getToken(Java8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(1927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1899);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1900);
				typeName();
				setState(1905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1901);
					match(LBRACK);
					setState(1902);
					match(RBRACK);
					}
					}
					setState(1907);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1908);
				match(DOT);
				setState(1909);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1911);
				match(VOID);
				setState(1912);
				match(DOT);
				setState(1913);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1914);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1915);
				typeName();
				setState(1916);
				match(DOT);
				setState(1917);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1919);
				match(LPAREN);
				setState(1920);
				expression();
				setState(1921);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1923);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1924);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1925);
				methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1926);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(1934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1929);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1930);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1931);
				arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1932);
				methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1933);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(1942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1938);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1939);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1940);
				methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1941);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(Java8Parser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Java8Parser.VOID, 0); }
		public TerminalNode THIS() { return getToken(Java8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(1984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1944);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1945);
				typeName();
				setState(1950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1946);
					match(LBRACK);
					setState(1947);
					match(RBRACK);
					}
					}
					setState(1952);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1953);
				match(DOT);
				setState(1954);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1956);
				unannPrimitiveType();
				setState(1961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1957);
					match(LBRACK);
					setState(1958);
					match(RBRACK);
					}
					}
					setState(1963);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1964);
				match(DOT);
				setState(1965);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1967);
				match(VOID);
				setState(1968);
				match(DOT);
				setState(1969);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1970);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1971);
				typeName();
				setState(1972);
				match(DOT);
				setState(1973);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1975);
				match(LPAREN);
				setState(1976);
				expression();
				setState(1977);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1979);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1980);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1981);
				arrayAccess_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1982);
				methodInvocation_lfno_primary();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1983);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(Java8Parser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Java8Parser.VOID, 0); }
		public TerminalNode THIS() { return getToken(Java8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1988);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1989);
				typeName();
				setState(1994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1990);
					match(LBRACK);
					setState(1991);
					match(RBRACK);
					}
					}
					setState(1996);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1997);
				match(DOT);
				setState(1998);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2000);
				unannPrimitiveType();
				setState(2005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2001);
					match(LBRACK);
					setState(2002);
					match(RBRACK);
					}
					}
					setState(2007);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2008);
				match(DOT);
				setState(2009);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2011);
				match(VOID);
				setState(2012);
				match(DOT);
				setState(2013);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2014);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2015);
				typeName();
				setState(2016);
				match(DOT);
				setState(2017);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2019);
				match(LPAREN);
				setState(2020);
				expression();
				setState(2021);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2023);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2024);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2025);
				methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2026);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(Java8Parser.NEW, 0); }
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java8Parser.DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassInstanceCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitClassInstanceCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2029);
				match(NEW);
				setState(2031);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2030);
					typeArguments();
					}
				}

				setState(2036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2033);
					annotation();
					}
					}
					setState(2038);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2039);
				match(Identifier);
				setState(2050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2040);
					match(DOT);
					setState(2044);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2041);
						annotation();
						}
						}
						setState(2046);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2047);
					match(Identifier);
					}
					}
					setState(2052);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2054);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2053);
					typeArgumentsOrDiamond();
					}
				}

				setState(2056);
				match(LPAREN);
				setState(2058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2057);
					argumentList();
					}
				}

				setState(2060);
				match(RPAREN);
				setState(2062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2061);
					classBody();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2064);
				expressionName();
				setState(2065);
				match(DOT);
				setState(2066);
				match(NEW);
				setState(2068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2067);
					typeArguments();
					}
				}

				setState(2073);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2070);
					annotation();
					}
					}
					setState(2075);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2076);
				match(Identifier);
				setState(2078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2077);
					typeArgumentsOrDiamond();
					}
				}

				setState(2080);
				match(LPAREN);
				setState(2082);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2081);
					argumentList();
					}
				}

				setState(2084);
				match(RPAREN);
				setState(2086);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2085);
					classBody();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2088);
				primary();
				setState(2089);
				match(DOT);
				setState(2090);
				match(NEW);
				setState(2092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2091);
					typeArguments();
					}
				}

				setState(2097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2094);
					annotation();
					}
					}
					setState(2099);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2100);
				match(Identifier);
				setState(2102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2101);
					typeArgumentsOrDiamond();
					}
				}

				setState(2104);
				match(LPAREN);
				setState(2106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2105);
					argumentList();
					}
				}

				setState(2108);
				match(RPAREN);
				setState(2110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2109);
					classBody();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode NEW() { return getToken(Java8Parser.NEW, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitClassInstanceCreationExpression_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2114);
			match(DOT);
			setState(2115);
			match(NEW);
			setState(2117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2116);
				typeArguments();
				}
			}

			setState(2122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2119);
				annotation();
				}
				}
				setState(2124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2125);
			match(Identifier);
			setState(2127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2126);
				typeArgumentsOrDiamond();
				}
			}

			setState(2129);
			match(LPAREN);
			setState(2131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2130);
				argumentList();
				}
			}

			setState(2133);
			match(RPAREN);
			setState(2135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(2134);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(Java8Parser.NEW, 0); }
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java8Parser.DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitClassInstanceCreationExpression_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2137);
				match(NEW);
				setState(2139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2138);
					typeArguments();
					}
				}

				setState(2144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2141);
					annotation();
					}
					}
					setState(2146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2147);
				match(Identifier);
				setState(2158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2148);
					match(DOT);
					setState(2152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2149);
						annotation();
						}
						}
						setState(2154);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2155);
					match(Identifier);
					}
					}
					setState(2160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2161);
					typeArgumentsOrDiamond();
					}
				}

				setState(2164);
				match(LPAREN);
				setState(2166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2165);
					argumentList();
					}
				}

				setState(2168);
				match(RPAREN);
				setState(2170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(2169);
					classBody();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2172);
				expressionName();
				setState(2173);
				match(DOT);
				setState(2174);
				match(NEW);
				setState(2176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2175);
					typeArguments();
					}
				}

				setState(2181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2178);
					annotation();
					}
					}
					setState(2183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2184);
				match(Identifier);
				setState(2186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2185);
					typeArgumentsOrDiamond();
					}
				}

				setState(2188);
				match(LPAREN);
				setState(2190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2189);
					argumentList();
					}
				}

				setState(2192);
				match(RPAREN);
				setState(2194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(2193);
					classBody();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode LT() { return getToken(Java8Parser.LT, 0); }
		public TerminalNode GT() { return getToken(Java8Parser.GT, 0); }
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_typeArgumentsOrDiamond);
		try {
			setState(2201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2198);
				typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2199);
				match(LT);
				setState(2200);
				match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Java8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java8Parser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_fieldAccess);
		try {
			setState(2216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2203);
				primary();
				setState(2204);
				match(DOT);
				setState(2205);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2207);
				match(SUPER);
				setState(2208);
				match(DOT);
				setState(2209);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2210);
				typeName();
				setState(2211);
				match(DOT);
				setState(2212);
				match(SUPER);
				setState(2213);
				match(DOT);
				setState(2214);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFieldAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFieldAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitFieldAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2218);
			match(DOT);
			setState(2219);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public List<TerminalNode> DOT() { return getTokens(Java8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java8Parser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFieldAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFieldAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitFieldAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_fieldAccess_lfno_primary);
		try {
			setState(2230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2221);
				match(SUPER);
				setState(2222);
				match(DOT);
				setState(2223);
				match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2224);
				typeName();
				setState(2225);
				match(DOT);
				setState(2226);
				match(SUPER);
				setState(2227);
				match(DOT);
				setState(2228);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(2232);
				expressionName();
				setState(2233);
				match(LBRACK);
				setState(2234);
				expression();
				setState(2235);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2237);
				primaryNoNewArray_lfno_arrayAccess();
				setState(2238);
				match(LBRACK);
				setState(2239);
				expression();
				setState(2240);
				match(RBRACK);
				}
				break;
			}
			setState(2251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2244);
				primaryNoNewArray_lf_arrayAccess();
				setState(2245);
				match(LBRACK);
				setState(2246);
				expression();
				setState(2247);
				match(RBRACK);
				}
				}
				setState(2253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitArrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2254);
			primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2255);
			match(LBRACK);
			setState(2256);
			expression();
			setState(2257);
			match(RBRACK);
			}
			setState(2266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2259);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2260);
					match(LBRACK);
					setState(2261);
					expression();
					setState(2262);
					match(RBRACK);
					}
					} 
				}
				setState(2268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitArrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(2269);
				expressionName();
				setState(2270);
				match(LBRACK);
				setState(2271);
				expression();
				setState(2272);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2274);
				primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2275);
				match(LBRACK);
				setState(2276);
				expression();
				setState(2277);
				match(RBRACK);
				}
				break;
			}
			setState(2288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2281);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2282);
					match(LBRACK);
					setState(2283);
					expression();
					setState(2284);
					match(RBRACK);
					}
					} 
				}
				setState(2290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Java8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java8Parser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_methodInvocation);
		int _la;
		try {
			setState(2359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2291);
				methodName();
				setState(2292);
				match(LPAREN);
				setState(2294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2293);
					argumentList();
					}
				}

				setState(2296);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2298);
				typeName();
				setState(2299);
				match(DOT);
				setState(2301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2300);
					typeArguments();
					}
				}

				setState(2303);
				match(Identifier);
				setState(2304);
				match(LPAREN);
				setState(2306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2305);
					argumentList();
					}
				}

				setState(2308);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2310);
				expressionName();
				setState(2311);
				match(DOT);
				setState(2313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2312);
					typeArguments();
					}
				}

				setState(2315);
				match(Identifier);
				setState(2316);
				match(LPAREN);
				setState(2318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2317);
					argumentList();
					}
				}

				setState(2320);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2322);
				primary();
				setState(2323);
				match(DOT);
				setState(2325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2324);
					typeArguments();
					}
				}

				setState(2327);
				match(Identifier);
				setState(2328);
				match(LPAREN);
				setState(2330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2329);
					argumentList();
					}
				}

				setState(2332);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2334);
				match(SUPER);
				setState(2335);
				match(DOT);
				setState(2337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2336);
					typeArguments();
					}
				}

				setState(2339);
				match(Identifier);
				setState(2340);
				match(LPAREN);
				setState(2342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2341);
					argumentList();
					}
				}

				setState(2344);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2345);
				typeName();
				setState(2346);
				match(DOT);
				setState(2347);
				match(SUPER);
				setState(2348);
				match(DOT);
				setState(2350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2349);
					typeArguments();
					}
				}

				setState(2352);
				match(Identifier);
				setState(2353);
				match(LPAREN);
				setState(2355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2354);
					argumentList();
					}
				}

				setState(2357);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodInvocation_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodInvocation_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitMethodInvocation_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2361);
			match(DOT);
			setState(2363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2362);
				typeArguments();
				}
			}

			setState(2365);
			match(Identifier);
			setState(2366);
			match(LPAREN);
			setState(2368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2367);
				argumentList();
				}
			}

			setState(2370);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Java8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java8Parser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodInvocation_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodInvocation_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitMethodInvocation_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2372);
				methodName();
				setState(2373);
				match(LPAREN);
				setState(2375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2374);
					argumentList();
					}
				}

				setState(2377);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2379);
				typeName();
				setState(2380);
				match(DOT);
				setState(2382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2381);
					typeArguments();
					}
				}

				setState(2384);
				match(Identifier);
				setState(2385);
				match(LPAREN);
				setState(2387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2386);
					argumentList();
					}
				}

				setState(2389);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2391);
				expressionName();
				setState(2392);
				match(DOT);
				setState(2394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2393);
					typeArguments();
					}
				}

				setState(2396);
				match(Identifier);
				setState(2397);
				match(LPAREN);
				setState(2399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2398);
					argumentList();
					}
				}

				setState(2401);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2403);
				match(SUPER);
				setState(2404);
				match(DOT);
				setState(2406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2405);
					typeArguments();
					}
				}

				setState(2408);
				match(Identifier);
				setState(2409);
				match(LPAREN);
				setState(2411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2410);
					argumentList();
					}
				}

				setState(2413);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2414);
				typeName();
				setState(2415);
				match(DOT);
				setState(2416);
				match(SUPER);
				setState(2417);
				match(DOT);
				setState(2419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2418);
					typeArguments();
					}
				}

				setState(2421);
				match(Identifier);
				setState(2422);
				match(LPAREN);
				setState(2424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2423);
					argumentList();
					}
				}

				setState(2426);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2430);
			expression();
			setState(2435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2431);
				match(COMMA);
				setState(2432);
				expression();
				}
				}
				setState(2437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(Java8Parser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(Java8Parser.NEW, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_methodReference);
		int _la;
		try {
			setState(2485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2438);
				expressionName();
				setState(2439);
				match(COLONCOLON);
				setState(2441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2440);
					typeArguments();
					}
				}

				setState(2443);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2445);
				referenceType();
				setState(2446);
				match(COLONCOLON);
				setState(2448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2447);
					typeArguments();
					}
				}

				setState(2450);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2452);
				primary();
				setState(2453);
				match(COLONCOLON);
				setState(2455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2454);
					typeArguments();
					}
				}

				setState(2457);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2459);
				match(SUPER);
				setState(2460);
				match(COLONCOLON);
				setState(2462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2461);
					typeArguments();
					}
				}

				setState(2464);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2465);
				typeName();
				setState(2466);
				match(DOT);
				setState(2467);
				match(SUPER);
				setState(2468);
				match(COLONCOLON);
				setState(2470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2469);
					typeArguments();
					}
				}

				setState(2472);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2474);
				classType();
				setState(2475);
				match(COLONCOLON);
				setState(2477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2476);
					typeArguments();
					}
				}

				setState(2479);
				match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2481);
				arrayType();
				setState(2482);
				match(COLONCOLON);
				setState(2483);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public TerminalNode COLONCOLON() { return getToken(Java8Parser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodReference_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodReference_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitMethodReference_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2487);
			match(COLONCOLON);
			setState(2489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2488);
				typeArguments();
				}
			}

			setState(2491);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(Java8Parser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(Java8Parser.NEW, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodReference_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodReference_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitMethodReference_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2493);
				expressionName();
				setState(2494);
				match(COLONCOLON);
				setState(2496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2495);
					typeArguments();
					}
				}

				setState(2498);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2500);
				referenceType();
				setState(2501);
				match(COLONCOLON);
				setState(2503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2502);
					typeArguments();
					}
				}

				setState(2505);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2507);
				match(SUPER);
				setState(2508);
				match(COLONCOLON);
				setState(2510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2509);
					typeArguments();
					}
				}

				setState(2512);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2513);
				typeName();
				setState(2514);
				match(DOT);
				setState(2515);
				match(SUPER);
				setState(2516);
				match(COLONCOLON);
				setState(2518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2517);
					typeArguments();
					}
				}

				setState(2520);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2522);
				classType();
				setState(2523);
				match(COLONCOLON);
				setState(2525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2524);
					typeArguments();
					}
				}

				setState(2527);
				match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2529);
				arrayType();
				setState(2530);
				match(COLONCOLON);
				setState(2531);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(Java8Parser.NEW, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArrayCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitArrayCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_arrayCreationExpression);
		try {
			setState(2557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2535);
				match(NEW);
				setState(2536);
				primitiveType();
				setState(2537);
				dimExprs();
				setState(2539);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2538);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2541);
				match(NEW);
				setState(2542);
				classOrInterfaceType();
				setState(2543);
				dimExprs();
				setState(2545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2544);
					dims();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2547);
				match(NEW);
				setState(2548);
				primitiveType();
				setState(2549);
				dims();
				setState(2550);
				arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2552);
				match(NEW);
				setState(2553);
				classOrInterfaceType();
				setState(2554);
				dims();
				setState(2555);
				arrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitDimExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitDimExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2559);
			dimExpr();
			setState(2563);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2560);
					dimExpr();
					}
					} 
				}
				setState(2565);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Java8Parser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Java8Parser.RBRACK, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitDimExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitDimExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2566);
				annotation();
				}
				}
				setState(2571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2572);
			match(LBRACK);
			setState(2573);
			expression();
			setState(2574);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2576);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_expression);
		try {
			setState(2580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2578);
				lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2579);
				assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(Java8Parser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2582);
			lambdaParameters();
			setState(2583);
			match(ARROW);
			setState(2584);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_lambdaParameters);
		int _la;
		try {
			setState(2596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2586);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2587);
				match(LPAREN);
				setState(2589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(2588);
					formalParameterList();
					}
				}

				setState(2591);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2592);
				match(LPAREN);
				setState(2593);
				inferredFormalParameterList();
				setState(2594);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInferredFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInferredFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitInferredFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2598);
			match(Identifier);
			setState(2603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2599);
				match(COMMA);
				setState(2600);
				match(Identifier);
				}
				}
				setState(2605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_lambdaBody);
		try {
			setState(2608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2606);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2607);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_assignmentExpression);
		try {
			setState(2612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2610);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2611);
				assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2614);
			leftHandSide();
			setState(2615);
			assignmentOperator();
			setState(2616);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLeftHandSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitLeftHandSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_leftHandSide);
		try {
			setState(2621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2618);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2619);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2620);
				arrayAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(Java8Parser.ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(Java8Parser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(Java8Parser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(Java8Parser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(Java8Parser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(Java8Parser.SUB_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(Java8Parser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(Java8Parser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(Java8Parser.URSHIFT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(Java8Parser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(Java8Parser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(Java8Parser.OR_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2623);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ASSIGN - 66)) | (1L << (ADD_ASSIGN - 66)) | (1L << (SUB_ASSIGN - 66)) | (1L << (MUL_ASSIGN - 66)) | (1L << (DIV_ASSIGN - 66)) | (1L << (AND_ASSIGN - 66)) | (1L << (OR_ASSIGN - 66)) | (1L << (XOR_ASSIGN - 66)) | (1L << (MOD_ASSIGN - 66)) | (1L << (LSHIFT_ASSIGN - 66)) | (1L << (RSHIFT_ASSIGN - 66)) | (1L << (URSHIFT_ASSIGN - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(Java8Parser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_conditionalExpression);
		try {
			setState(2632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2625);
				conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2626);
				conditionalOrExpression(0);
				setState(2627);
				match(QUESTION);
				setState(2628);
				expression();
				setState(2629);
				match(COLON);
				setState(2630);
				conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(Java8Parser.OR, 0); }
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 436;
		enterRecursionRule(_localctx, 436, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2635);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2637);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2638);
					match(OR);
					setState(2639);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(2644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(Java8Parser.AND, 0); }
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 438;
		enterRecursionRule(_localctx, 438, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2646);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2653);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2648);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2649);
					match(AND);
					setState(2650);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(2655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TerminalNode BITOR() { return getToken(Java8Parser.BITOR, 0); }
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 440;
		enterRecursionRule(_localctx, 440, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2657);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2664);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2659);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2660);
					match(BITOR);
					setState(2661);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(2666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode CARET() { return getToken(Java8Parser.CARET, 0); }
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 442;
		enterRecursionRule(_localctx, 442, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2668);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2675);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2670);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2671);
					match(CARET);
					setState(2672);
					andExpression(0);
					}
					} 
				}
				setState(2677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode BITAND() { return getToken(Java8Parser.BITAND, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 444;
		enterRecursionRule(_localctx, 444, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2679);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2686);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2681);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2682);
					match(BITAND);
					setState(2683);
					equalityExpression(0);
					}
					} 
				}
				setState(2688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(Java8Parser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(Java8Parser.NOTEQUAL, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2690);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2698);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2692);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2693);
						match(EQUAL);
						setState(2694);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2695);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2696);
						match(NOTEQUAL);
						setState(2697);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode LT() { return getToken(Java8Parser.LT, 0); }
		public TerminalNode GT() { return getToken(Java8Parser.GT, 0); }
		public TerminalNode LE() { return getToken(Java8Parser.LE, 0); }
		public TerminalNode GE() { return getToken(Java8Parser.GE, 0); }
		public TerminalNode INSTANCEOF() { return getToken(Java8Parser.INSTANCEOF, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 448;
		enterRecursionRule(_localctx, 448, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2704);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2723);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2721);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2706);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2707);
						match(LT);
						setState(2708);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2709);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2710);
						match(GT);
						setState(2711);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2712);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2713);
						match(LE);
						setState(2714);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2715);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2716);
						match(GE);
						setState(2717);
						shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2718);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2719);
						match(INSTANCEOF);
						setState(2720);
						referenceType();
						}
						break;
					}
					} 
				}
				setState(2725);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public List<TerminalNode> LT() { return getTokens(Java8Parser.LT); }
		public TerminalNode LT(int i) {
			return getToken(Java8Parser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(Java8Parser.GT); }
		public TerminalNode GT(int i) {
			return getToken(Java8Parser.GT, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 450;
		enterRecursionRule(_localctx, 450, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2727);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2742);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2729);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2730);
						match(LT);
						setState(2731);
						match(LT);
						setState(2732);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2733);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2734);
						match(GT);
						setState(2735);
						match(GT);
						setState(2736);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2737);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2738);
						match(GT);
						setState(2739);
						match(GT);
						setState(2740);
						match(GT);
						setState(2741);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(Java8Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(Java8Parser.SUB, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 452;
		enterRecursionRule(_localctx, 452, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2748);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2756);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2750);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2751);
						match(ADD);
						setState(2752);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2753);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2754);
						match(SUB);
						setState(2755);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(Java8Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(Java8Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(Java8Parser.MOD, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 454;
		enterRecursionRule(_localctx, 454, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2762);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2775);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2773);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2764);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2765);
						match(MUL);
						setState(2766);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2767);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2768);
						match(DIV);
						setState(2769);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2770);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2771);
						match(MOD);
						setState(2772);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(2777);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(Java8Parser.ADD, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(Java8Parser.SUB, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_unaryExpression);
		try {
			setState(2785);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2778);
				preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2779);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2780);
				match(ADD);
				setState(2781);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2782);
				match(SUB);
				setState(2783);
				unaryExpression();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2784);
				unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(Java8Parser.INC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPreIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPreIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2787);
			match(INC);
			setState(2788);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(Java8Parser.DEC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPreDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPreDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2790);
			match(DEC);
			setState(2791);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(Java8Parser.TILDE, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(Java8Parser.BANG, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitUnaryExpressionNotPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2793);
				postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2794);
				match(TILDE);
				setState(2795);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2796);
				match(BANG);
				setState(2797);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2798);
				castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				{
				setState(2801);
				primary();
				}
				break;
			case 2:
				{
				setState(2802);
				expressionName();
				}
				break;
			}
			setState(2809);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2807);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(2805);
						postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(2806);
						postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(2811);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(Java8Parser.INC, 0); }
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2812);
			postfixExpression();
			setState(2813);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(Java8Parser.INC, 0); }
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPostIncrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2815);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode DEC() { return getToken(Java8Parser.DEC, 0); }
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPostDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPostDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2817);
			postfixExpression();
			setState(2818);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(Java8Parser.DEC, 0); }
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitPostDecrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2820);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8ParserVisitor ) return ((Java8ParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_castExpression);
		int _la;
		try {
			setState(2849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2822);
				match(LPAREN);
				setState(2823);
				primitiveType();
				setState(2824);
				match(RPAREN);
				setState(2825);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2827);
				match(LPAREN);
				setState(2828);
				referenceType();
				setState(2832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2829);
					additionalBound();
					}
					}
					setState(2834);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2835);
				match(RPAREN);
				setState(2836);
				unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2838);
				match(LPAREN);
				setState(2839);
				referenceType();
				setState(2843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2840);
					additionalBound();
					}
					}
					setState(2845);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2846);
				match(RPAREN);
				setState(2847);
				lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 27:
			return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
		case 30:
			return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 218:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 219:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 220:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 221:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 222:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 223:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 224:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 225:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 226:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 227:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3m\u0b26\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\3\2\3\2\3\3\7\3\u01e2"+
		"\n\3\f\3\16\3\u01e5\13\3\3\3\3\3\7\3\u01e9\n\3\f\3\16\3\u01ec\13\3\3\3"+
		"\5\3\u01ef\n\3\3\4\3\4\5\4\u01f3\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7\u01fc"+
		"\n\7\3\b\3\b\5\b\u0200\n\b\3\b\3\b\7\b\u0204\n\b\f\b\16\b\u0207\13\b\3"+
		"\t\7\t\u020a\n\t\f\t\16\t\u020d\13\t\3\t\3\t\5\t\u0211\n\t\3\t\3\t\3\t"+
		"\7\t\u0216\n\t\f\t\16\t\u0219\13\t\3\t\3\t\5\t\u021d\n\t\5\t\u021f\n\t"+
		"\3\n\3\n\7\n\u0223\n\n\f\n\16\n\u0226\13\n\3\n\3\n\5\n\u022a\n\n\3\13"+
		"\7\13\u022d\n\13\f\13\16\13\u0230\13\13\3\13\3\13\5\13\u0234\n\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\7\17\u023d\n\17\f\17\16\17\u0240\13\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u024d\n\20\3\21"+
		"\7\21\u0250\n\21\f\21\16\21\u0253\13\21\3\21\3\21\3\21\7\21\u0258\n\21"+
		"\f\21\16\21\u025b\13\21\3\21\3\21\7\21\u025f\n\21\f\21\16\21\u0262\13"+
		"\21\3\22\7\22\u0265\n\22\f\22\16\22\u0268\13\22\3\22\3\22\5\22\u026c\n"+
		"\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u0275\n\24\f\24\16\24\u0278"+
		"\13\24\5\24\u027a\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\7\27\u0286\n\27\f\27\16\27\u0289\13\27\3\30\3\30\5\30\u028d\n\30\3"+
		"\31\7\31\u0290\n\31\f\31\16\31\u0293\13\31\3\31\3\31\5\31\u0297\n\31\3"+
		"\32\3\32\3\32\3\32\5\32\u029d\n\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u02a5\n\33\f\33\16\33\u02a8\13\33\3\34\3\34\3\34\3\34\3\34\5\34\u02af"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u02b7\n\35\f\35\16\35\u02ba\13"+
		"\35\3\36\3\36\3\36\3\36\3\36\5\36\u02c1\n\36\3\37\3\37\3 \3 \3 \3 \3 "+
		"\3 \7 \u02cb\n \f \16 \u02ce\13 \3!\5!\u02d1\n!\3!\7!\u02d4\n!\f!\16!"+
		"\u02d7\13!\3!\7!\u02da\n!\f!\16!\u02dd\13!\3!\3!\3\"\7\"\u02e2\n\"\f\""+
		"\16\"\u02e5\13\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\5$\u02f1\n$\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\5)\u030e\n)\3*\3*\5*\u0312\n*\3+\3+\3,\3,\3-\7-\u0319\n-\f"+
		"-\16-\u031c\13-\3-\3-\3-\5-\u0321\n-\3-\5-\u0324\n-\3-\5-\u0327\n-\3-"+
		"\3-\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0333\n.\3/\3/\3/\3/\3\60\3\60\3\60\7\60"+
		"\u033c\n\60\f\60\16\60\u033f\13\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\7\63\u034a\n\63\f\63\16\63\u034d\13\63\3\64\3\64\7\64\u0351"+
		"\n\64\f\64\16\64\u0354\13\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u035c"+
		"\n\65\3\66\3\66\3\66\3\66\3\66\5\66\u0363\n\66\3\67\7\67\u0366\n\67\f"+
		"\67\16\67\u0369\13\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\58\u0377"+
		"\n8\39\39\39\79\u037c\n9\f9\169\u037f\139\3:\3:\3:\5:\u0384\n:\3;\3;\5"+
		";\u0388\n;\3<\3<\5<\u038c\n<\3=\3=\5=\u0390\n=\3>\3>\5>\u0394\n>\3?\3"+
		"?\3?\5?\u0399\n?\3@\3@\5@\u039d\n@\3@\3@\7@\u03a1\n@\f@\16@\u03a4\13@"+
		"\3A\3A\5A\u03a8\nA\3A\3A\3A\7A\u03ad\nA\fA\16A\u03b0\13A\3A\3A\5A\u03b4"+
		"\nA\5A\u03b6\nA\3B\3B\7B\u03ba\nB\fB\16B\u03bd\13B\3B\3B\5B\u03c1\nB\3"+
		"C\3C\5C\u03c5\nC\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\5"+
		"H\u03d8\nH\3I\7I\u03db\nI\fI\16I\u03de\13I\3I\3I\3I\3J\3J\3J\3J\3J\3J"+
		"\3J\3J\3J\3J\5J\u03ed\nJ\3K\3K\3K\5K\u03f2\nK\3K\3K\7K\u03f6\nK\fK\16"+
		"K\u03f9\13K\3K\3K\3K\5K\u03fe\nK\5K\u0400\nK\3L\3L\5L\u0404\nL\3M\3M\3"+
		"M\5M\u0409\nM\3M\3M\5M\u040d\nM\3N\3N\3N\3N\3N\3N\5N\u0415\nN\3O\3O\3"+
		"O\7O\u041a\nO\fO\16O\u041d\13O\3O\3O\3O\7O\u0422\nO\fO\16O\u0425\13O\5"+
		"O\u0427\nO\3P\7P\u042a\nP\fP\16P\u042d\13P\3P\3P\3P\3Q\3Q\5Q\u0434\nQ"+
		"\3R\7R\u0437\nR\fR\16R\u043a\13R\3R\3R\7R\u043e\nR\fR\16R\u0441\13R\3"+
		"R\3R\3R\3R\5R\u0447\nR\3S\7S\u044a\nS\fS\16S\u044d\13S\3S\3S\3S\5S\u0452"+
		"\nS\3S\3S\3T\3T\3T\3U\3U\3U\7U\u045c\nU\fU\16U\u045f\13U\3V\3V\5V\u0463"+
		"\nV\3W\3W\5W\u0467\nW\3X\3X\3Y\3Y\3Y\3Z\7Z\u046f\nZ\fZ\16Z\u0472\13Z\3"+
		"Z\3Z\5Z\u0476\nZ\3Z\3Z\3[\3[\3[\3[\5[\u047e\n[\3\\\5\\\u0481\n\\\3\\\3"+
		"\\\3\\\5\\\u0486\n\\\3\\\3\\\3]\3]\3^\3^\5^\u048e\n^\3^\5^\u0491\n^\3"+
		"^\3^\3_\5_\u0496\n_\3_\3_\3_\5_\u049b\n_\3_\3_\3_\5_\u04a0\n_\3_\3_\3"+
		"_\5_\u04a5\n_\3_\3_\3_\3_\3_\5_\u04ac\n_\3_\3_\3_\5_\u04b1\n_\3_\3_\3"+
		"_\3_\3_\3_\5_\u04b9\n_\3_\3_\3_\5_\u04be\n_\3_\3_\3_\5_\u04c3\n_\3`\7"+
		"`\u04c6\n`\f`\16`\u04c9\13`\3`\3`\3`\5`\u04ce\n`\3`\3`\3a\3a\5a\u04d4"+
		"\na\3a\5a\u04d7\na\3a\5a\u04da\na\3a\3a\3b\3b\3b\7b\u04e1\nb\fb\16b\u04e4"+
		"\13b\3c\7c\u04e7\nc\fc\16c\u04ea\13c\3c\3c\3c\5c\u04ef\nc\3c\5c\u04f2"+
		"\nc\3c\5c\u04f5\nc\3d\3d\3e\3e\7e\u04fb\ne\fe\16e\u04fe\13e\3f\3f\5f\u0502"+
		"\nf\3g\7g\u0505\ng\fg\16g\u0508\13g\3g\3g\3g\5g\u050d\ng\3g\5g\u0510\n"+
		"g\3g\3g\3h\3h\3h\3h\3h\3h\3h\5h\u051b\nh\3i\3i\3i\3j\3j\7j\u0522\nj\f"+
		"j\16j\u0525\13j\3j\3j\3k\3k\3k\3k\3k\5k\u052e\nk\3l\7l\u0531\nl\fl\16"+
		"l\u0534\13l\3l\3l\3l\3l\3m\3m\3m\3m\5m\u053e\nm\3n\7n\u0541\nn\fn\16n"+
		"\u0544\13n\3n\3n\3n\3o\3o\3o\3o\3o\3o\5o\u054f\no\3p\7p\u0552\np\fp\16"+
		"p\u0555\13p\3p\3p\3p\3p\3p\3q\3q\7q\u055e\nq\fq\16q\u0561\13q\3q\3q\3"+
		"r\3r\3r\3r\3r\5r\u056a\nr\3s\7s\u056d\ns\fs\16s\u0570\13s\3s\3s\3s\3s"+
		"\3s\5s\u0577\ns\3s\5s\u057a\ns\3s\3s\3t\3t\3t\5t\u0581\nt\3u\3u\3u\3v"+
		"\3v\3v\5v\u0589\nv\3w\3w\3w\3w\5w\u058f\nw\3w\3w\3x\3x\3x\7x\u0596\nx"+
		"\fx\16x\u0599\13x\3y\3y\3y\3y\3z\3z\3z\5z\u05a2\nz\3{\3{\5{\u05a6\n{\3"+
		"{\5{\u05a9\n{\3{\3{\3|\3|\3|\7|\u05b0\n|\f|\16|\u05b3\13|\3}\3}\3}\3~"+
		"\3~\3~\3~\3~\3~\3\177\3\177\5\177\u05c0\n\177\3\177\5\177\u05c3\n\177"+
		"\3\177\3\177\3\u0080\3\u0080\3\u0080\7\u0080\u05ca\n\u0080\f\u0080\16"+
		"\u0080\u05cd\13\u0080\3\u0081\3\u0081\5\u0081\u05d1\n\u0081\3\u0081\3"+
		"\u0081\3\u0082\6\u0082\u05d6\n\u0082\r\u0082\16\u0082\u05d7\3\u0083\3"+
		"\u0083\3\u0083\5\u0083\u05dd\n\u0083\3\u0084\3\u0084\3\u0084\3\u0085\7"+
		"\u0085\u05e3\n\u0085\f\u0085\16\u0085\u05e6\13\u0085\3\u0085\3\u0085\3"+
		"\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u05f1\n"+
		"\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u05f8\n\u0087\3"+
		"\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\5\u0088\u0606\n\u0088\3\u0089\3\u0089\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c"+
		"\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d"+
		"\u061c\n\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u063e"+
		"\n\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093"+
		"\7\u0093\u0648\n\u0093\f\u0093\16\u0093\u064b\13\u0093\3\u0093\7\u0093"+
		"\u064e\n\u0093\f\u0093\16\u0093\u0651\13\u0093\3\u0093\3\u0093\3\u0094"+
		"\3\u0094\3\u0094\3\u0095\3\u0095\7\u0095\u065a\n\u0095\f\u0095\16\u0095"+
		"\u065d\13\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\5\u0096\u0669\n\u0096\3\u0097\3\u0097\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009b\3\u009b\5\u009b\u0683\n\u009b\3\u009c\3\u009c\5\u009c"+
		"\u0687\n\u009c\3\u009d\3\u009d\3\u009d\5\u009d\u068c\n\u009d\3\u009d\3"+
		"\u009d\5\u009d\u0690\n\u009d\3\u009d\3\u009d\5\u009d\u0694\n\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\5\u009e\u069c\n\u009e\3\u009e"+
		"\3\u009e\5\u009e\u06a0\n\u009e\3\u009e\3\u009e\5\u009e\u06a4\n\u009e\3"+
		"\u009e\3\u009e\3\u009e\3\u009f\3\u009f\5\u009f\u06ab\n\u009f\3\u00a0\3"+
		"\u00a0\3\u00a1\3\u00a1\3\u00a1\7\u00a1\u06b2\n\u00a1\f\u00a1\16\u00a1"+
		"\u06b5\13\u00a1\3\u00a2\3\u00a2\3\u00a2\7\u00a2\u06ba\n\u00a2\f\u00a2"+
		"\16\u00a2\u06bd\13\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u06c9\n\u00a3\f\u00a3\16\u00a3"+
		"\u06cc\13\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a4\3\u00a4\5\u00a4\u06d7\n\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5"+
		"\5\u00a5\u06dd\n\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\5\u00a6\u06e3\n"+
		"\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\5\u00a9\u06f8\n\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u06fd\n\u00a9\3\u00aa\3\u00aa\7\u00aa\u0701\n\u00aa\f\u00aa\16\u00aa"+
		"\u0704\13\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac"+
		"\7\u00ac\u070d\n\u00ac\f\u00ac\16\u00ac\u0710\13\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ad\3\u00ad\3\u00ad\7\u00ad\u0718\n\u00ad\f\u00ad\16\u00ad"+
		"\u071b\13\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\5\u00af\u0724\n\u00af\3\u00af\5\u00af\u0727\n\u00af\3\u00b0\3\u00b0\3"+
		"\u00b0\5\u00b0\u072c\n\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\7"+
		"\u00b1\u0733\n\u00b1\f\u00b1\16\u00b1\u0736\13\u00b1\3\u00b2\7\u00b2\u0739"+
		"\n\u00b2\f\u00b2\16\u00b2\u073c\13\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b3\3\u00b3\5\u00b3\u0745\n\u00b3\3\u00b3\7\u00b3\u0748\n"+
		"\u00b3\f\u00b3\16\u00b3\u074b\13\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\7\u00b4\u0751\n\u00b4\f\u00b4\16\u00b4\u0754\13\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\5\u00b4\u076a\n\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\7\u00b6\u0772\n\u00b6\f\u00b6\16\u00b6\u0775\13\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6"+
		"\u078a\n\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0791\n"+
		"\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u0799\n"+
		"\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\7\u00ba\u079f\n\u00ba\f\u00ba\16"+
		"\u00ba\u07a2\13\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\7\u00ba\u07aa\n\u00ba\f\u00ba\16\u00ba\u07ad\13\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\5\u00ba\u07c3\n\u00ba\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\7\u00bc\u07cb\n\u00bc\f\u00bc\16\u00bc\u07ce\13\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\7\u00bc\u07d6\n\u00bc\f\u00bc\16\u00bc"+
		"\u07d9\13\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u07ee\n\u00bc\3\u00bd\3\u00bd\5\u00bd"+
		"\u07f2\n\u00bd\3\u00bd\7\u00bd\u07f5\n\u00bd\f\u00bd\16\u00bd\u07f8\13"+
		"\u00bd\3\u00bd\3\u00bd\3\u00bd\7\u00bd\u07fd\n\u00bd\f\u00bd\16\u00bd"+
		"\u0800\13\u00bd\3\u00bd\7\u00bd\u0803\n\u00bd\f\u00bd\16\u00bd\u0806\13"+
		"\u00bd\3\u00bd\5\u00bd\u0809\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u080d\n\u00bd"+
		"\3\u00bd\3\u00bd\5\u00bd\u0811\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\5\u00bd\u0817\n\u00bd\3\u00bd\7\u00bd\u081a\n\u00bd\f\u00bd\16\u00bd"+
		"\u081d\13\u00bd\3\u00bd\3\u00bd\5\u00bd\u0821\n\u00bd\3\u00bd\3\u00bd"+
		"\5\u00bd\u0825\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u0829\n\u00bd\3\u00bd\3"+
		"\u00bd\3\u00bd\3\u00bd\5\u00bd\u082f\n\u00bd\3\u00bd\7\u00bd\u0832\n\u00bd"+
		"\f\u00bd\16\u00bd\u0835\13\u00bd\3\u00bd\3\u00bd\5\u00bd\u0839\n\u00bd"+
		"\3\u00bd\3\u00bd\5\u00bd\u083d\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u0841\n"+
		"\u00bd\5\u00bd\u0843\n\u00bd\3\u00be\3\u00be\3\u00be\5\u00be\u0848\n\u00be"+
		"\3\u00be\7\u00be\u084b\n\u00be\f\u00be\16\u00be\u084e\13\u00be\3\u00be"+
		"\3\u00be\5\u00be\u0852\n\u00be\3\u00be\3\u00be\5\u00be\u0856\n\u00be\3"+
		"\u00be\3\u00be\5\u00be\u085a\n\u00be\3\u00bf\3\u00bf\5\u00bf\u085e\n\u00bf"+
		"\3\u00bf\7\u00bf\u0861\n\u00bf\f\u00bf\16\u00bf\u0864\13\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\7\u00bf\u0869\n\u00bf\f\u00bf\16\u00bf\u086c\13\u00bf"+
		"\3\u00bf\7\u00bf\u086f\n\u00bf\f\u00bf\16\u00bf\u0872\13\u00bf\3\u00bf"+
		"\5\u00bf\u0875\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u0879\n\u00bf\3\u00bf\3"+
		"\u00bf\5\u00bf\u087d\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0883"+
		"\n\u00bf\3\u00bf\7\u00bf\u0886\n\u00bf\f\u00bf\16\u00bf\u0889\13\u00bf"+
		"\3\u00bf\3\u00bf\5\u00bf\u088d\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u0891\n"+
		"\u00bf\3\u00bf\3\u00bf\5\u00bf\u0895\n\u00bf\5\u00bf\u0897\n\u00bf\3\u00c0"+
		"\3\u00c0\3\u00c0\5\u00c0\u089c\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\5\u00c1\u08ab\n\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u08b9\n\u00c3"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\5\u00c4\u08c5\n\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\7\u00c4\u08cc\n\u00c4\f\u00c4\16\u00c4\u08cf\13\u00c4\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\7\u00c5"+
		"\u08db\n\u00c5\f\u00c5\16\u00c5\u08de\13\u00c5\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u08ea"+
		"\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\7\u00c6\u08f1\n\u00c6"+
		"\f\u00c6\16\u00c6\u08f4\13\u00c6\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u08f9"+
		"\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0900\n\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0905\n\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\5\u00c7\u090c\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7"+
		"\u0911\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0918\n"+
		"\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u091d\n\u00c7\3\u00c7\3\u00c7\3"+
		"\u00c7\3\u00c7\3\u00c7\5\u00c7\u0924\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5"+
		"\u00c7\u0929\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5"+
		"\u00c7\u0931\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0936\n\u00c7\3\u00c7"+
		"\3\u00c7\5\u00c7\u093a\n\u00c7\3\u00c8\3\u00c8\5\u00c8\u093e\n\u00c8\3"+
		"\u00c8\3\u00c8\3\u00c8\5\u00c8\u0943\n\u00c8\3\u00c8\3\u00c8\3\u00c9\3"+
		"\u00c9\3\u00c9\5\u00c9\u094a\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3"+
		"\u00c9\5\u00c9\u0951\n\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0956\n\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u095d\n\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\5\u00c9\u0962\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\5\u00c9\u0969\n\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u096e\n"+
		"\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0976\n"+
		"\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u097b\n\u00c9\3\u00c9\3\u00c9\5"+
		"\u00c9\u097f\n\u00c9\3\u00ca\3\u00ca\3\u00ca\7\u00ca\u0984\n\u00ca\f\u00ca"+
		"\16\u00ca\u0987\13\u00ca\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u098c\n\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0993\n\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u099a\n\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u09a1\n\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u09a9\n\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\5\u00cb\u09b0\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\5\u00cb\u09b8\n\u00cb\3\u00cc\3\u00cc\5\u00cc\u09bc\n"+
		"\u00cc\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09c3\n\u00cd\3"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09ca\n\u00cd\3\u00cd\3"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09d1\n\u00cd\3\u00cd\3\u00cd\3"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09d9\n\u00cd\3\u00cd\3\u00cd\3"+
		"\u00cd\3\u00cd\3\u00cd\5\u00cd\u09e0\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3"+
		"\u00cd\3\u00cd\3\u00cd\5\u00cd\u09e8\n\u00cd\3\u00ce\3\u00ce\3\u00ce\3"+
		"\u00ce\5\u00ce\u09ee\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u09f4"+
		"\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\5\u00ce\u0a00\n\u00ce\3\u00cf\3\u00cf\7\u00cf\u0a04\n"+
		"\u00cf\f\u00cf\16\u00cf\u0a07\13\u00cf\3\u00d0\7\u00d0\u0a0a\n\u00d0\f"+
		"\u00d0\16\u00d0\u0a0d\13\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d1"+
		"\3\u00d1\3\u00d2\3\u00d2\5\u00d2\u0a17\n\u00d2\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0a20\n\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0a27\n\u00d4\3\u00d5\3\u00d5\3\u00d5"+
		"\7\u00d5\u0a2c\n\u00d5\f\u00d5\16\u00d5\u0a2f\13\u00d5\3\u00d6\3\u00d6"+
		"\5\u00d6\u0a33\n\u00d6\3\u00d7\3\u00d7\5\u00d7\u0a37\n\u00d7\3\u00d8\3"+
		"\u00d8\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u0a40\n\u00d9\3"+
		"\u00da\3\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\5\u00db\u0a4b\n\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\7\u00dc\u0a53\n\u00dc\f\u00dc\16\u00dc\u0a56\13\u00dc\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u0a5e\n\u00dd\f\u00dd\16\u00dd"+
		"\u0a61\13\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\7\u00de"+
		"\u0a69\n\u00de\f\u00de\16\u00de\u0a6c\13\u00de\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\7\u00df\u0a74\n\u00df\f\u00df\16\u00df\u0a77"+
		"\13\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\7\u00e0\u0a7f"+
		"\n\u00e0\f\u00e0\16\u00e0\u0a82\13\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\7\u00e1\u0a8d\n\u00e1\f\u00e1"+
		"\16\u00e1\u0a90\13\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\7\u00e2\u0aa4\n\u00e2\f\u00e2\16\u00e2\u0aa7"+
		"\13\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\7\u00e3"+
		"\u0ab9\n\u00e3\f\u00e3\16\u00e3\u0abc\13\u00e3\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\7\u00e4\u0ac7\n\u00e4"+
		"\f\u00e4\16\u00e4\u0aca\13\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\7\u00e5\u0ad8"+
		"\n\u00e5\f\u00e5\16\u00e5\u0adb\13\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\5\u00e6\u0ae4\n\u00e6\3\u00e7\3\u00e7\3\u00e7"+
		"\3\u00e8\3\u00e8\3\u00e8\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\5\u00e9\u0af2\n\u00e9\3\u00ea\3\u00ea\5\u00ea\u0af6\n\u00ea\3\u00ea\3"+
		"\u00ea\7\u00ea\u0afa\n\u00ea\f\u00ea\16\u00ea\u0afd\13\u00ea\3\u00eb\3"+
		"\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ed\3\u00ee\3\u00ee"+
		"\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\7\u00ef"+
		"\u0b11\n\u00ef\f\u00ef\16\u00ef\u0b14\13\u00ef\3\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00ef\7\u00ef\u0b1c\n\u00ef\f\u00ef\16\u00ef\u0b1f"+
		"\13\u00ef\3\u00ef\3\u00ef\3\u00ef\5\u00ef\u0b24\n\u00ef\3\u00ef\2\17\64"+
		"8>\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u00f0\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e"+
		"\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166"+
		"\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e"+
		"\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196"+
		"\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae"+
		"\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6"+
		"\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\2\6"+
		"\3\2\65:\7\2\7\7\n\n\35\35\37\37\'\'\4\2\20\20\26\26\4\2DD]g\2\u0c15\2"+
		"\u01de\3\2\2\2\4\u01ee\3\2\2\2\6\u01f2\3\2\2\2\b\u01f4\3\2\2\2\n\u01f6"+
		"\3\2\2\2\f\u01fb\3\2\2\2\16\u01ff\3\2\2\2\20\u021e\3\2\2\2\22\u0220\3"+
		"\2\2\2\24\u022e\3\2\2\2\26\u0235\3\2\2\2\30\u0237\3\2\2\2\32\u0239\3\2"+
		"\2\2\34\u023e\3\2\2\2\36\u024c\3\2\2\2 \u0251\3\2\2\2\"\u0266\3\2\2\2"+
		"$\u026d\3\2\2\2&\u0279\3\2\2\2(\u027b\3\2\2\2*\u027e\3\2\2\2,\u0282\3"+
		"\2\2\2.\u028c\3\2\2\2\60\u0291\3\2\2\2\62\u029c\3\2\2\2\64\u029e\3\2\2"+
		"\2\66\u02ae\3\2\2\28\u02b0\3\2\2\2:\u02c0\3\2\2\2<\u02c2\3\2\2\2>\u02c4"+
		"\3\2\2\2@\u02d0\3\2\2\2B\u02e3\3\2\2\2D\u02ea\3\2\2\2F\u02f0\3\2\2\2H"+
		"\u02f2\3\2\2\2J\u02f6\3\2\2\2L\u02fc\3\2\2\2N\u0303\3\2\2\2P\u030d\3\2"+
		"\2\2R\u0311\3\2\2\2T\u0313\3\2\2\2V\u0315\3\2\2\2X\u031a\3\2\2\2Z\u0332"+
		"\3\2\2\2\\\u0334\3\2\2\2^\u0338\3\2\2\2`\u0340\3\2\2\2b\u0343\3\2\2\2"+
		"d\u0346\3\2\2\2f\u034e\3\2\2\2h\u035b\3\2\2\2j\u0362\3\2\2\2l\u0367\3"+
		"\2\2\2n\u0376\3\2\2\2p\u0378\3\2\2\2r\u0380\3\2\2\2t\u0385\3\2\2\2v\u038b"+
		"\3\2\2\2x\u038f\3\2\2\2z\u0393\3\2\2\2|\u0398\3\2\2\2~\u039c\3\2\2\2\u0080"+
		"\u03b5\3\2\2\2\u0082\u03b7\3\2\2\2\u0084\u03c2\3\2\2\2\u0086\u03c6\3\2"+
		"\2\2\u0088\u03c8\3\2\2\2\u008a\u03ca\3\2\2\2\u008c\u03cc\3\2\2\2\u008e"+
		"\u03d7\3\2\2\2\u0090\u03dc\3\2\2\2\u0092\u03ec\3\2\2\2\u0094\u03ff\3\2"+
		"\2\2\u0096\u0403\3\2\2\2\u0098\u0405\3\2\2\2\u009a\u0414\3\2\2\2\u009c"+
		"\u0426\3\2\2\2\u009e\u042b\3\2\2\2\u00a0\u0433\3\2\2\2\u00a2\u0446\3\2"+
		"\2\2\u00a4\u044b\3\2\2\2\u00a6\u0455\3\2\2\2\u00a8\u0458\3\2\2\2\u00aa"+
		"\u0462\3\2\2\2\u00ac\u0466\3\2\2\2\u00ae\u0468\3\2\2\2\u00b0\u046a\3\2"+
		"\2\2\u00b2\u0470\3\2\2\2\u00b4\u047d\3\2\2\2\u00b6\u0480\3\2\2\2\u00b8"+
		"\u0489\3\2\2\2\u00ba\u048b\3\2\2\2\u00bc\u04c2\3\2\2\2\u00be\u04c7\3\2"+
		"\2\2\u00c0\u04d1\3\2\2\2\u00c2\u04dd\3\2\2\2\u00c4\u04e8\3\2\2\2\u00c6"+
		"\u04f6\3\2\2\2\u00c8\u04f8\3\2\2\2\u00ca\u0501\3\2\2\2\u00cc\u0506\3\2"+
		"\2\2\u00ce\u051a\3\2\2\2\u00d0\u051c\3\2\2\2\u00d2\u051f\3\2\2\2\u00d4"+
		"\u052d\3\2\2\2\u00d6\u0532\3\2\2\2\u00d8\u053d\3\2\2\2\u00da\u0542\3\2"+
		"\2\2\u00dc\u054e\3\2\2\2\u00de\u0553\3\2\2\2\u00e0\u055b\3\2\2\2\u00e2"+
		"\u0569\3\2\2\2\u00e4\u056e\3\2\2\2\u00e6\u0580\3\2\2\2\u00e8\u0582\3\2"+
		"\2\2\u00ea\u0588\3\2\2\2\u00ec\u058a\3\2\2\2\u00ee\u0592\3\2\2\2\u00f0"+
		"\u059a\3\2\2\2\u00f2\u05a1\3\2\2\2\u00f4\u05a3\3\2\2\2\u00f6\u05ac\3\2"+
		"\2\2\u00f8\u05b4\3\2\2\2\u00fa\u05b7\3\2\2\2\u00fc\u05bd\3\2\2\2\u00fe"+
		"\u05c6\3\2\2\2\u0100\u05ce\3\2\2\2\u0102\u05d5\3\2\2\2\u0104\u05dc\3\2"+
		"\2\2\u0106\u05de\3\2\2\2\u0108\u05e4\3\2\2\2\u010a\u05f0\3\2\2\2\u010c"+
		"\u05f7\3\2\2\2\u010e\u0605\3\2\2\2\u0110\u0607\3\2\2\2\u0112\u0609\3\2"+
		"\2\2\u0114\u060d\3\2\2\2\u0116\u0611\3\2\2\2\u0118\u061b\3\2\2\2\u011a"+
		"\u061d\3\2\2\2\u011c\u0623\3\2\2\2\u011e\u062b\3\2\2\2\u0120\u063d\3\2"+
		"\2\2\u0122\u063f\3\2\2\2\u0124\u0645\3\2\2\2\u0126\u0654\3\2\2\2\u0128"+
		"\u0657\3\2\2\2\u012a\u0668\3\2\2\2\u012c\u066a\3\2\2\2\u012e\u066c\3\2"+
		"\2\2\u0130\u0672\3\2\2\2\u0132\u0678\3\2\2\2\u0134\u0682\3\2\2\2\u0136"+
		"\u0686\3\2\2\2\u0138\u0688\3\2\2\2\u013a\u0698\3\2\2\2\u013c\u06aa\3\2"+
		"\2\2\u013e\u06ac\3\2\2\2\u0140\u06ae\3\2\2\2\u0142\u06b6\3\2\2\2\u0144"+
		"\u06c5\3\2\2\2\u0146\u06d4\3\2\2\2\u0148\u06da\3\2\2\2\u014a\u06e0\3\2"+
		"\2\2\u014c\u06e6\3\2\2\2\u014e\u06ea\3\2\2\2\u0150\u06fc\3\2\2\2\u0152"+
		"\u06fe\3\2\2\2\u0154\u0705\3\2\2\2\u0156\u070e\3\2\2\2\u0158\u0714\3\2"+
		"\2\2\u015a\u071c\3\2\2\2\u015c\u071f\3\2\2\2\u015e\u0728\3\2\2\2\u0160"+
		"\u072f\3\2\2\2\u0162\u073a\3\2\2\2\u0164\u0744\3\2\2\2\u0166\u0769\3\2"+
		"\2\2\u0168\u076b\3\2\2\2\u016a\u0789\3\2\2\2\u016c\u0790\3\2\2\2\u016e"+
		"\u0792\3\2\2\2\u0170\u0798\3\2\2\2\u0172\u07c2\3\2\2\2\u0174\u07c4\3\2"+
		"\2\2\u0176\u07ed\3\2\2\2\u0178\u0842\3\2\2\2\u017a\u0844\3\2\2\2\u017c"+
		"\u0896\3\2\2\2\u017e\u089b\3\2\2\2\u0180\u08aa\3\2\2\2\u0182\u08ac\3\2"+
		"\2\2\u0184\u08b8\3\2\2\2\u0186\u08c4\3\2\2\2\u0188\u08d0\3\2\2\2\u018a"+
		"\u08e9\3\2\2\2\u018c\u0939\3\2\2\2\u018e\u093b\3\2\2\2\u0190\u097e\3\2"+
		"\2\2\u0192\u0980\3\2\2\2\u0194\u09b7\3\2\2\2\u0196\u09b9\3\2\2\2\u0198"+
		"\u09e7\3\2\2\2\u019a\u09ff\3\2\2\2\u019c\u0a01\3\2\2\2\u019e\u0a0b\3\2"+
		"\2\2\u01a0\u0a12\3\2\2\2\u01a2\u0a16\3\2\2\2\u01a4\u0a18\3\2\2\2\u01a6"+
		"\u0a26\3\2\2\2\u01a8\u0a28\3\2\2\2\u01aa\u0a32\3\2\2\2\u01ac\u0a36\3\2"+
		"\2\2\u01ae\u0a38\3\2\2\2\u01b0\u0a3f\3\2\2\2\u01b2\u0a41\3\2\2\2\u01b4"+
		"\u0a4a\3\2\2\2\u01b6\u0a4c\3\2\2\2\u01b8\u0a57\3\2\2\2\u01ba\u0a62\3\2"+
		"\2\2\u01bc\u0a6d\3\2\2\2\u01be\u0a78\3\2\2\2\u01c0\u0a83\3\2\2\2\u01c2"+
		"\u0a91\3\2\2\2\u01c4\u0aa8\3\2\2\2\u01c6\u0abd\3\2\2\2\u01c8\u0acb\3\2"+
		"\2\2\u01ca\u0ae3\3\2\2\2\u01cc\u0ae5\3\2\2\2\u01ce\u0ae8\3\2\2\2\u01d0"+
		"\u0af1\3\2\2\2\u01d2\u0af5\3\2\2\2\u01d4\u0afe\3\2\2\2\u01d6\u0b01\3\2"+
		"\2\2\u01d8\u0b03\3\2\2\2\u01da\u0b06\3\2\2\2\u01dc\u0b23\3\2\2\2\u01de"+
		"\u01df\t\2\2\2\u01df\3\3\2\2\2\u01e0\u01e2\5\u00eav\2\u01e1\u01e0\3\2"+
		"\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e6\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01ef\5\6\4\2\u01e7\u01e9\5\u00ea"+
		"v\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ef\7\5"+
		"\2\2\u01ee\u01e3\3\2\2\2\u01ee\u01ea\3\2\2\2\u01ef\5\3\2\2\2\u01f0\u01f3"+
		"\5\b\5\2\u01f1\u01f3\5\n\6\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3"+
		"\7\3\2\2\2\u01f4\u01f5\t\3\2\2\u01f5\t\3\2\2\2\u01f6\u01f7\t\4\2\2\u01f7"+
		"\13\3\2\2\2\u01f8\u01fc\5\16\b\2\u01f9\u01fc\5\34\17\2\u01fa\u01fc\5\36"+
		"\20\2\u01fb\u01f8\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc"+
		"\r\3\2\2\2\u01fd\u0200\5\24\13\2\u01fe\u0200\5\32\16\2\u01ff\u01fd\3\2"+
		"\2\2\u01ff\u01fe\3\2\2\2\u0200\u0205\3\2\2\2\u0201\u0204\5\22\n\2\u0202"+
		"\u0204\5\30\r\2\u0203\u0201\3\2\2\2\u0203\u0202\3\2\2\2\u0204\u0207\3"+
		"\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\17\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0208\u020a\5\u00eav\2\u0209\u0208\3\2\2\2\u020a\u020d"+
		"\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d"+
		"\u020b\3\2\2\2\u020e\u0210\7h\2\2\u020f\u0211\5*\26\2\u0210\u020f\3\2"+
		"\2\2\u0210\u0211\3\2\2\2\u0211\u021f\3\2\2\2\u0212\u0213\5\16\b\2\u0213"+
		"\u0217\7C\2\2\u0214\u0216\5\u00eav\2\u0215\u0214\3\2\2\2\u0216\u0219\3"+
		"\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219"+
		"\u0217\3\2\2\2\u021a\u021c\7h\2\2\u021b\u021d\5*\26\2\u021c\u021b\3\2"+
		"\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u020b\3\2\2\2\u021e"+
		"\u0212\3\2\2\2\u021f\21\3\2\2\2\u0220\u0224\7C\2\2\u0221\u0223\5\u00ea"+
		"v\2\u0222\u0221\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0227\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0229\7h"+
		"\2\2\u0228\u022a\5*\26\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\23\3\2\2\2\u022b\u022d\5\u00eav\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2"+
		"\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0231\u0233\7h\2\2\u0232\u0234\5*\26\2\u0233\u0232\3\2"+
		"\2\2\u0233\u0234\3\2\2\2\u0234\25\3\2\2\2\u0235\u0236\5\20\t\2\u0236\27"+
		"\3\2\2\2\u0237\u0238\5\22\n\2\u0238\31\3\2\2\2\u0239\u023a\5\24\13\2\u023a"+
		"\33\3\2\2\2\u023b\u023d\5\u00eav\2\u023c\u023b\3\2\2\2\u023d\u0240\3\2"+
		"\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240"+
		"\u023e\3\2\2\2\u0241\u0242\7h\2\2\u0242\35\3\2\2\2\u0243\u0244\5\4\3\2"+
		"\u0244\u0245\5 \21\2\u0245\u024d\3\2\2\2\u0246\u0247\5\16\b\2\u0247\u0248"+
		"\5 \21\2\u0248\u024d\3\2\2\2\u0249\u024a\5\34\17\2\u024a\u024b\5 \21\2"+
		"\u024b\u024d\3\2\2\2\u024c\u0243\3\2\2\2\u024c\u0246\3\2\2\2\u024c\u0249"+
		"\3\2\2\2\u024d\37\3\2\2\2\u024e\u0250\5\u00eav\2\u024f\u024e\3\2\2\2\u0250"+
		"\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2"+
		"\2\2\u0253\u0251\3\2\2\2\u0254\u0255\7?\2\2\u0255\u0260\7@\2\2\u0256\u0258"+
		"\5\u00eav\2\u0257\u0256\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2"+
		"\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025d"+
		"\7?\2\2\u025d\u025f\7@\2\2\u025e\u0259\3\2\2\2\u025f\u0262\3\2\2\2\u0260"+
		"\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261!\3\2\2\2\u0262\u0260\3\2\2\2"+
		"\u0263\u0265\5$\23\2\u0264\u0263\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264"+
		"\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2\2\2\u0268\u0266\3\2\2\2\u0269"+
		"\u026b\7h\2\2\u026a\u026c\5&\24\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2"+
		"\2\2\u026c#\3\2\2\2\u026d\u026e\5\u00eav\2\u026e%\3\2\2\2\u026f\u0270"+
		"\7\23\2\2\u0270\u027a\5\34\17\2\u0271\u0272\7\23\2\2\u0272\u0276\5\16"+
		"\b\2\u0273\u0275\5(\25\2\u0274\u0273\3\2\2\2\u0275\u0278\3\2\2\2\u0276"+
		"\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2"+
		"\2\2\u0279\u026f\3\2\2\2\u0279\u0271\3\2\2\2\u027a\'\3\2\2\2\u027b\u027c"+
		"\7W\2\2\u027c\u027d\5\26\f\2\u027d)\3\2\2\2\u027e\u027f\7F\2\2\u027f\u0280"+
		"\5,\27\2\u0280\u0281\7E\2\2\u0281+\3\2\2\2\u0282\u0287\5.\30\2\u0283\u0284"+
		"\7B\2\2\u0284\u0286\5.\30\2\u0285\u0283\3\2\2\2\u0286\u0289\3\2\2\2\u0287"+
		"\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288-\3\2\2\2\u0289\u0287\3\2\2\2"+
		"\u028a\u028d\5\f\7\2\u028b\u028d\5\60\31\2\u028c\u028a\3\2\2\2\u028c\u028b"+
		"\3\2\2\2\u028d/\3\2\2\2\u028e\u0290\5\u00eav\2\u028f\u028e\3\2\2\2\u0290"+
		"\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\3\2"+
		"\2\2\u0293\u0291\3\2\2\2\u0294\u0296\7I\2\2\u0295\u0297\5\62\32\2\u0296"+
		"\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\61\3\2\2\2\u0298\u0299\7\23\2"+
		"\2\u0299\u029d\5\f\7\2\u029a\u029b\7*\2\2\u029b\u029d\5\f\7\2\u029c\u0298"+
		"\3\2\2\2\u029c\u029a\3\2\2\2\u029d\63\3\2\2\2\u029e\u029f\b\33\1\2\u029f"+
		"\u02a0\7h\2\2\u02a0\u02a6\3\2\2\2\u02a1\u02a2\f\3\2\2\u02a2\u02a3\7C\2"+
		"\2\u02a3\u02a5\7h\2\2\u02a4\u02a1\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4"+
		"\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\65\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9"+
		"\u02af\7h\2\2\u02aa\u02ab\58\35\2\u02ab\u02ac\7C\2\2\u02ac\u02ad\7h\2"+
		"\2\u02ad\u02af\3\2\2\2\u02ae\u02a9\3\2\2\2\u02ae\u02aa\3\2\2\2\u02af\67"+
		"\3\2\2\2\u02b0\u02b1\b\35\1\2\u02b1\u02b2\7h\2\2\u02b2\u02b8\3\2\2\2\u02b3"+
		"\u02b4\f\3\2\2\u02b4\u02b5\7C\2\2\u02b5\u02b7\7h\2\2\u02b6\u02b3\3\2\2"+
		"\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b99"+
		"\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02c1\7h\2\2\u02bc\u02bd\5> \2\u02bd"+
		"\u02be\7C\2\2\u02be\u02bf\7h\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02bb\3\2\2"+
		"\2\u02c0\u02bc\3\2\2\2\u02c1;\3\2\2\2\u02c2\u02c3\7h\2\2\u02c3=\3\2\2"+
		"\2\u02c4\u02c5\b \1\2\u02c5\u02c6\7h\2\2\u02c6\u02cc\3\2\2\2\u02c7\u02c8"+
		"\f\3\2\2\u02c8\u02c9\7C\2\2\u02c9\u02cb\7h\2\2\u02ca\u02c7\3\2\2\2\u02cb"+
		"\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd?\3\2\2\2"+
		"\u02ce\u02cc\3\2\2\2\u02cf\u02d1\5B\"\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1"+
		"\3\2\2\2\u02d1\u02d5\3\2\2\2\u02d2\u02d4\5F$\2\u02d3\u02d2\3\2\2\2\u02d4"+
		"\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02db\3\2"+
		"\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02da\5P)\2\u02d9\u02d8\3\2\2\2\u02da\u02dd"+
		"\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02de\3\2\2\2\u02dd"+
		"\u02db\3\2\2\2\u02de\u02df\7\2\2\3\u02dfA\3\2\2\2\u02e0\u02e2\5D#\2\u02e1"+
		"\u02e0\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2"+
		"\2\2\u02e4\u02e6\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02e7\7\"\2\2\u02e7"+
		"\u02e8\5\64\33\2\u02e8\u02e9\7A\2\2\u02e9C\3\2\2\2\u02ea\u02eb\5\u00ea"+
		"v\2\u02ebE\3\2\2\2\u02ec\u02f1\5H%\2\u02ed\u02f1\5J&\2\u02ee\u02f1\5L"+
		"\'\2\u02ef\u02f1\5N(\2\u02f0\u02ec\3\2\2\2\u02f0\u02ed\3\2\2\2\u02f0\u02ee"+
		"\3\2\2\2\u02f0\u02ef\3\2\2\2\u02f1G\3\2\2\2\u02f2\u02f3\7\33\2\2\u02f3"+
		"\u02f4\5\66\34\2\u02f4\u02f5\7A\2\2\u02f5I\3\2\2\2\u02f6\u02f7\7\33\2"+
		"\2\u02f7\u02f8\58\35\2\u02f8\u02f9\7C\2\2\u02f9\u02fa\7U\2\2\u02fa\u02fb"+
		"\7A\2\2\u02fbK\3\2\2\2\u02fc\u02fd\7\33\2\2\u02fd\u02fe\7(\2\2\u02fe\u02ff"+
		"\5\66\34\2\u02ff\u0300\7C\2\2\u0300\u0301\7h\2\2\u0301\u0302\7A\2\2\u0302"+
		"M\3\2\2\2\u0303\u0304\7\33\2\2\u0304\u0305\7(\2\2\u0305\u0306\5\66\34"+
		"\2\u0306\u0307\7C\2\2\u0307\u0308\7U\2\2\u0308\u0309\7A\2\2\u0309O\3\2"+
		"\2\2\u030a\u030e\5R*\2\u030b\u030e\5\u00caf\2\u030c\u030e\7A\2\2\u030d"+
		"\u030a\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030c\3\2\2\2\u030eQ\3\2\2\2"+
		"\u030f\u0312\5X-\2\u0310\u0312\5\u00be`\2\u0311\u030f\3\2\2\2\u0311\u0310"+
		"\3\2\2\2\u0312S\3\2\2\2\u0313\u0314\7h\2\2\u0314U\3\2\2\2\u0315\u0316"+
		"\7h\2\2\u0316W\3\2\2\2\u0317\u0319\5Z.\2\u0318\u0317\3\2\2\2\u0319\u031c"+
		"\3\2\2\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031d\3\2\2\2\u031c"+
		"\u031a\3\2\2\2\u031d\u031e\7\13\2\2\u031e\u0320\5T+\2\u031f\u0321\5\\"+
		"/\2\u0320\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0323\3\2\2\2\u0322"+
		"\u0324\5`\61\2\u0323\u0322\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0326\3\2"+
		"\2\2\u0325\u0327\5b\62\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327"+
		"\u0328\3\2\2\2\u0328\u0329\5f\64\2\u0329Y\3\2\2\2\u032a\u0333\5\u00ea"+
		"v\2\u032b\u0333\7%\2\2\u032c\u0333\7$\2\2\u032d\u0333\7#\2\2\u032e\u0333"+
		"\7\3\2\2\u032f\u0333\7(\2\2\u0330\u0333\7\24\2\2\u0331\u0333\7)\2\2\u0332"+
		"\u032a\3\2\2\2\u0332\u032b\3\2\2\2\u0332\u032c\3\2\2\2\u0332\u032d\3\2"+
		"\2\2\u0332\u032e\3\2\2\2\u0332\u032f\3\2\2\2\u0332\u0330\3\2\2\2\u0332"+
		"\u0331\3\2\2\2\u0333[\3\2\2\2\u0334\u0335\7F\2\2\u0335\u0336\5^\60\2\u0336"+
		"\u0337\7E\2\2\u0337]\3\2\2\2\u0338\u033d\5\"\22\2\u0339\u033a\7B\2\2\u033a"+
		"\u033c\5\"\22\2\u033b\u0339\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033b\3"+
		"\2\2\2\u033d\u033e\3\2\2\2\u033e_\3\2\2\2\u033f\u033d\3\2\2\2\u0340\u0341"+
		"\7\23\2\2\u0341\u0342\5\20\t\2\u0342a\3\2\2\2\u0343\u0344\7\32\2\2\u0344"+
		"\u0345\5d\63\2\u0345c\3\2\2\2\u0346\u034b\5\26\f\2\u0347\u0348\7B\2\2"+
		"\u0348\u034a\5\26\f\2\u0349\u0347\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349"+
		"\3\2\2\2\u034b\u034c\3\2\2\2\u034ce\3\2\2\2\u034d\u034b\3\2\2\2\u034e"+
		"\u0352\7=\2\2\u034f\u0351\5h\65\2\u0350\u034f\3\2\2\2\u0351\u0354\3\2"+
		"\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0355\3\2\2\2\u0354"+
		"\u0352\3\2\2\2\u0355\u0356\7>\2\2\u0356g\3\2\2\2\u0357\u035c\5j\66\2\u0358"+
		"\u035c\5\u00aeX\2\u0359\u035c\5\u00b0Y\2\u035a\u035c\5\u00b2Z\2\u035b"+
		"\u0357\3\2\2\2\u035b\u0358\3\2\2\2\u035b\u0359\3\2\2\2\u035b\u035a\3\2"+
		"\2\2\u035ci\3\2\2\2\u035d\u0363\5l\67\2\u035e\u0363\5\u0090I\2\u035f\u0363"+
		"\5R*\2\u0360\u0363\5\u00caf\2\u0361\u0363\7A\2\2\u0362\u035d\3\2\2\2\u0362"+
		"\u035e\3\2\2\2\u0362\u035f\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0361\3\2"+
		"\2\2\u0363k\3\2\2\2\u0364\u0366\5n8\2\u0365\u0364\3\2\2\2\u0366\u0369"+
		"\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u036a\3\2\2\2\u0369"+
		"\u0367\3\2\2\2\u036a\u036b\5x=\2\u036b\u036c\5p9\2\u036c\u036d\7A\2\2"+
		"\u036dm\3\2\2\2\u036e\u0377\5\u00eav\2\u036f\u0377\7%\2\2\u0370\u0377"+
		"\7$\2\2\u0371\u0377\7#\2\2\u0372\u0377\7(\2\2\u0373\u0377\7\24\2\2\u0374"+
		"\u0377\7\60\2\2\u0375\u0377\7\63\2\2\u0376\u036e\3\2\2\2\u0376\u036f\3"+
		"\2\2\2\u0376\u0370\3\2\2\2\u0376\u0371\3\2\2\2\u0376\u0372\3\2\2\2\u0376"+
		"\u0373\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0375\3\2\2\2\u0377o\3\2\2\2"+
		"\u0378\u037d\5r:\2\u0379\u037a\7B\2\2\u037a\u037c\5r:\2\u037b\u0379\3"+
		"\2\2\2\u037c\u037f\3\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e"+
		"q\3\2\2\2\u037f\u037d\3\2\2\2\u0380\u0383\5t;\2\u0381\u0382\7D\2\2\u0382"+
		"\u0384\5v<\2\u0383\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384s\3\2\2\2\u0385"+
		"\u0387\7h\2\2\u0386\u0388\5 \21\2\u0387\u0386\3\2\2\2\u0387\u0388\3\2"+
		"\2\2\u0388u\3\2\2\2\u0389\u038c\5\u01a2\u00d2\2\u038a\u038c\5\u00fc\177"+
		"\2\u038b\u0389\3\2\2\2\u038b\u038a\3\2\2\2\u038cw\3\2\2\2\u038d\u0390"+
		"\5z>\2\u038e\u0390\5|?\2\u038f\u038d\3\2\2\2\u038f\u038e\3\2\2\2\u0390"+
		"y\3\2\2\2\u0391\u0394\5\6\4\2\u0392\u0394\7\5\2\2\u0393\u0391\3\2\2\2"+
		"\u0393\u0392\3\2\2\2\u0394{\3\2\2\2\u0395\u0399\5~@\2\u0396\u0399\5\u008c"+
		"G\2\u0397\u0399\5\u008eH\2\u0398\u0395\3\2\2\2\u0398\u0396\3\2\2\2\u0398"+
		"\u0397\3\2\2\2\u0399}\3\2\2\2\u039a\u039d\5\u0084C\2\u039b\u039d\5\u008a"+
		"F\2\u039c\u039a\3\2\2\2\u039c\u039b\3\2\2\2\u039d\u03a2\3\2\2\2\u039e"+
		"\u03a1\5\u0082B\2\u039f\u03a1\5\u0088E\2\u03a0\u039e\3\2\2\2\u03a0\u039f"+
		"\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3"+
		"\177\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5\u03a7\7h\2\2\u03a6\u03a8\5*\26"+
		"\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03b6\3\2\2\2\u03a9\u03aa"+
		"\5~@\2\u03aa\u03ae\7C\2\2\u03ab\u03ad\5\u00eav\2\u03ac\u03ab\3\2\2\2\u03ad"+
		"\u03b0\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b1\3\2"+
		"\2\2\u03b0\u03ae\3\2\2\2\u03b1\u03b3\7h\2\2\u03b2\u03b4\5*\26\2\u03b3"+
		"\u03b2\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b6\3\2\2\2\u03b5\u03a5\3\2"+
		"\2\2\u03b5\u03a9\3\2\2\2\u03b6\u0081\3\2\2\2\u03b7\u03bb\7C\2\2\u03b8"+
		"\u03ba\5\u00eav\2\u03b9\u03b8\3\2\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03b9"+
		"\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03be\3\2\2\2\u03bd\u03bb\3\2\2\2\u03be"+
		"\u03c0\7h\2\2\u03bf\u03c1\5*\26\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2"+
		"\2\2\u03c1\u0083\3\2\2\2\u03c2\u03c4\7h\2\2\u03c3\u03c5\5*\26\2\u03c4"+
		"\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u0085\3\2\2\2\u03c6\u03c7\5\u0080"+
		"A\2\u03c7\u0087\3\2\2\2\u03c8\u03c9\5\u0082B\2\u03c9\u0089\3\2\2\2\u03ca"+
		"\u03cb\5\u0084C\2\u03cb\u008b\3\2\2\2\u03cc\u03cd\7h\2\2\u03cd\u008d\3"+
		"\2\2\2\u03ce\u03cf\5z>\2\u03cf\u03d0\5 \21\2\u03d0\u03d8\3\2\2\2\u03d1"+
		"\u03d2\5~@\2\u03d2\u03d3\5 \21\2\u03d3\u03d8\3\2\2\2\u03d4\u03d5\5\u008c"+
		"G\2\u03d5\u03d6\5 \21\2\u03d6\u03d8\3\2\2\2\u03d7\u03ce\3\2\2\2\u03d7"+
		"\u03d1\3\2\2\2\u03d7\u03d4\3\2\2\2\u03d8\u008f\3\2\2\2\u03d9\u03db\5\u0092"+
		"J\2\u03da\u03d9\3\2\2\2\u03db\u03de\3\2\2\2\u03dc\u03da\3\2\2\2\u03dc"+
		"\u03dd\3\2\2\2\u03dd\u03df\3\2\2\2\u03de\u03dc\3\2\2\2\u03df\u03e0\5\u0094"+
		"K\2\u03e0\u03e1\5\u00acW\2\u03e1\u0091\3\2\2\2\u03e2\u03ed\5\u00eav\2"+
		"\u03e3\u03ed\7%\2\2\u03e4\u03ed\7$\2\2\u03e5\u03ed\7#\2\2\u03e6\u03ed"+
		"\7\3\2\2\u03e7\u03ed\7(\2\2\u03e8\u03ed\7\24\2\2\u03e9\u03ed\7,\2\2\u03ea"+
		"\u03ed\7 \2\2\u03eb\u03ed\7)\2\2\u03ec\u03e2\3\2\2\2\u03ec\u03e3\3\2\2"+
		"\2\u03ec\u03e4\3\2\2\2\u03ec\u03e5\3\2\2\2\u03ec\u03e6\3\2\2\2\u03ec\u03e7"+
		"\3\2\2\2\u03ec\u03e8\3\2\2\2\u03ec\u03e9\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec"+
		"\u03eb\3\2\2\2\u03ed\u0093\3\2\2\2\u03ee\u03ef\5\u0096L\2\u03ef\u03f1"+
		"\5\u0098M\2\u03f0\u03f2\5\u00a6T\2\u03f1\u03f0\3\2\2\2\u03f1\u03f2\3\2"+
		"\2\2\u03f2\u0400\3\2\2\2\u03f3\u03f7\5\\/\2\u03f4\u03f6\5\u00eav\2\u03f5"+
		"\u03f4\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2"+
		"\2\2\u03f8\u03fa\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa\u03fb\5\u0096L\2\u03fb"+
		"\u03fd\5\u0098M\2\u03fc\u03fe\5\u00a6T\2\u03fd\u03fc\3\2\2\2\u03fd\u03fe"+
		"\3\2\2\2\u03fe\u0400\3\2\2\2\u03ff\u03ee\3\2\2\2\u03ff\u03f3\3\2\2\2\u0400"+
		"\u0095\3\2\2\2\u0401\u0404\5x=\2\u0402\u0404\7\62\2\2\u0403\u0401\3\2"+
		"\2\2\u0403\u0402\3\2\2\2\u0404\u0097\3\2\2\2\u0405\u0406\7h\2\2\u0406"+
		"\u0408\7;\2\2\u0407\u0409\5\u009aN\2\u0408\u0407\3\2\2\2\u0408\u0409\3"+
		"\2\2\2\u0409\u040a\3\2\2\2\u040a\u040c\7<\2\2\u040b\u040d\5 \21\2\u040c"+
		"\u040b\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u0099\3\2\2\2\u040e\u0415\5\u00a4"+
		"S\2\u040f\u0410\5\u009cO\2\u0410\u0411\7B\2\2\u0411\u0412\5\u00a2R\2\u0412"+
		"\u0415\3\2\2\2\u0413\u0415\5\u00a2R\2\u0414\u040e\3\2\2\2\u0414\u040f"+
		"\3\2\2\2\u0414\u0413\3\2\2\2\u0415\u009b\3\2\2\2\u0416\u041b\5\u009eP"+
		"\2\u0417\u0418\7B\2\2\u0418\u041a\5\u009eP\2\u0419\u0417\3\2\2\2\u041a"+
		"\u041d\3\2\2\2\u041b\u0419\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u0427\3\2"+
		"\2\2\u041d\u041b\3\2\2\2\u041e\u0423\5\u00a4S\2\u041f\u0420\7B\2\2\u0420"+
		"\u0422\5\u009eP\2\u0421\u041f\3\2\2\2\u0422\u0425\3\2\2\2\u0423\u0421"+
		"\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0427\3\2\2\2\u0425\u0423\3\2\2\2\u0426"+
		"\u0416\3\2\2\2\u0426\u041e\3\2\2\2\u0427\u009d\3\2\2\2\u0428\u042a\5\u00a0"+
		"Q\2\u0429\u0428\3\2\2\2\u042a\u042d\3\2\2\2\u042b\u0429\3\2\2\2\u042b"+
		"\u042c\3\2\2\2\u042c\u042e\3\2\2\2\u042d\u042b\3\2\2\2\u042e\u042f\5x"+
		"=\2\u042f\u0430\5t;\2\u0430\u009f\3\2\2\2\u0431\u0434\5\u00eav\2\u0432"+
		"\u0434\7\24\2\2\u0433\u0431\3\2\2\2\u0433\u0432\3\2\2\2\u0434\u00a1\3"+
		"\2\2\2\u0435\u0437\5\u00a0Q\2\u0436\u0435\3\2\2\2\u0437\u043a\3\2\2\2"+
		"\u0438\u0436\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043b\3\2\2\2\u043a\u0438"+
		"\3\2\2\2\u043b\u043f\5x=\2\u043c\u043e\5\u00eav\2\u043d\u043c\3\2\2\2"+
		"\u043e\u0441\3\2\2\2\u043f\u043d\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0442"+
		"\3\2\2\2\u0441\u043f\3\2\2\2\u0442\u0443\7j\2\2\u0443\u0444\5t;\2\u0444"+
		"\u0447\3\2\2\2\u0445\u0447\5\u009eP\2\u0446\u0438\3\2\2\2\u0446\u0445"+
		"\3\2\2\2\u0447\u00a3\3\2\2\2\u0448\u044a\5\u00eav\2\u0449\u0448\3\2\2"+
		"\2\u044a\u044d\3\2\2\2\u044b\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044e"+
		"\3\2\2\2\u044d\u044b\3\2\2\2\u044e\u0451\5x=\2\u044f\u0450\7h\2\2\u0450"+
		"\u0452\7C\2\2\u0451\u044f\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0453\3\2"+
		"\2\2\u0453\u0454\7-\2\2\u0454\u00a5\3\2\2\2\u0455\u0456\7/\2\2\u0456\u0457"+
		"\5\u00a8U\2\u0457\u00a7\3\2\2\2\u0458\u045d\5\u00aaV\2\u0459\u045a\7B"+
		"\2\2\u045a\u045c\5\u00aaV\2\u045b\u0459\3\2\2\2\u045c\u045f\3\2\2\2\u045d"+
		"\u045b\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u00a9\3\2\2\2\u045f\u045d\3\2"+
		"\2\2\u0460\u0463\5\20\t\2\u0461\u0463\5\34\17\2\u0462\u0460\3\2\2\2\u0462"+
		"\u0461\3\2\2\2\u0463\u00ab\3\2\2\2\u0464\u0467\5\u0100\u0081\2\u0465\u0467"+
		"\7A\2\2\u0466\u0464\3\2\2\2\u0466\u0465\3\2\2\2\u0467\u00ad\3\2\2\2\u0468"+
		"\u0469\5\u0100\u0081\2\u0469\u00af\3\2\2\2\u046a\u046b\7(\2\2\u046b\u046c"+
		"\5\u0100\u0081\2\u046c\u00b1\3\2\2\2\u046d\u046f\5\u00b4[\2\u046e\u046d"+
		"\3\2\2\2\u046f\u0472\3\2\2\2\u0470\u046e\3\2\2\2\u0470\u0471\3\2\2\2\u0471"+
		"\u0473\3\2\2\2\u0472\u0470\3\2\2\2\u0473\u0475\5\u00b6\\\2\u0474\u0476"+
		"\5\u00a6T\2\u0475\u0474\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0477\3\2\2"+
		"\2\u0477\u0478\5\u00ba^\2\u0478\u00b3\3\2\2\2\u0479\u047e\5\u00eav\2\u047a"+
		"\u047e\7%\2\2\u047b\u047e\7$\2\2\u047c\u047e\7#\2\2\u047d\u0479\3\2\2"+
		"\2\u047d\u047a\3\2\2\2\u047d\u047b\3\2\2\2\u047d\u047c\3\2\2\2\u047e\u00b5"+
		"\3\2\2\2\u047f\u0481\5\\/\2\u0480\u047f\3\2\2\2\u0480\u0481\3\2\2\2\u0481"+
		"\u0482\3\2\2\2\u0482\u0483\5\u00b8]\2\u0483\u0485\7;\2\2\u0484\u0486\5"+
		"\u009aN\2\u0485\u0484\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2\2"+
		"\u0487\u0488\7<\2\2\u0488\u00b7\3\2\2\2\u0489\u048a\7h\2\2\u048a\u00b9"+
		"\3\2\2\2\u048b\u048d\7=\2\2\u048c\u048e\5\u00bc_\2\u048d\u048c\3\2\2\2"+
		"\u048d\u048e\3\2\2\2\u048e\u0490\3\2\2\2\u048f\u0491\5\u0102\u0082\2\u0490"+
		"\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493\7>"+
		"\2\2\u0493\u00bb\3\2\2\2\u0494\u0496\5*\26\2\u0495\u0494\3\2\2\2\u0495"+
		"\u0496\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498\7-\2\2\u0498\u049a\7;\2"+
		"\2\u0499\u049b\5\u0192\u00ca\2\u049a\u0499\3\2\2\2\u049a\u049b\3\2\2\2"+
		"\u049b\u049c\3\2\2\2\u049c\u049d\7<\2\2\u049d\u04c3\7A\2\2\u049e\u04a0"+
		"\5*\26\2\u049f\u049e\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1"+
		"\u04a2\7*\2\2\u04a2\u04a4\7;\2\2\u04a3\u04a5\5\u0192\u00ca\2\u04a4\u04a3"+
		"\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7\7<\2\2\u04a7"+
		"\u04c3\7A\2\2\u04a8\u04a9\5:\36\2\u04a9\u04ab\7C\2\2\u04aa\u04ac\5*\26"+
		"\2\u04ab\u04aa\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ae"+
		"\7*\2\2\u04ae\u04b0\7;\2\2\u04af\u04b1\5\u0192\u00ca\2\u04b0\u04af\3\2"+
		"\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\7<\2\2\u04b3"+
		"\u04b4\7A\2\2\u04b4\u04c3\3\2\2\2\u04b5\u04b6\5\u0164\u00b3\2\u04b6\u04b8"+
		"\7C\2\2\u04b7\u04b9\5*\26\2\u04b8\u04b7\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9"+
		"\u04ba\3\2\2\2\u04ba\u04bb\7*\2\2\u04bb\u04bd\7;\2\2\u04bc\u04be\5\u0192"+
		"\u00ca\2\u04bd\u04bc\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf"+
		"\u04c0\7<\2\2\u04c0\u04c1\7A\2\2\u04c1\u04c3\3\2\2\2\u04c2\u0495\3\2\2"+
		"\2\u04c2\u049f\3\2\2\2\u04c2\u04a8\3\2\2\2\u04c2\u04b5\3\2\2\2\u04c3\u00bd"+
		"\3\2\2\2\u04c4\u04c6\5Z.\2\u04c5\u04c4\3\2\2\2\u04c6\u04c9\3\2\2\2\u04c7"+
		"\u04c5\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04ca\3\2\2\2\u04c9\u04c7\3\2"+
		"\2\2\u04ca\u04cb\7\22\2\2\u04cb\u04cd\7h\2\2\u04cc\u04ce\5b\62\2\u04cd"+
		"\u04cc\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d0\5\u00c0"+
		"a\2\u04d0\u00bf\3\2\2\2\u04d1\u04d3\7=\2\2\u04d2\u04d4\5\u00c2b\2\u04d3"+
		"\u04d2\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d6\3\2\2\2\u04d5\u04d7\7B"+
		"\2\2\u04d6\u04d5\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d9\3\2\2\2\u04d8"+
		"\u04da\5\u00c8e\2\u04d9\u04d8\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04db"+
		"\3\2\2\2\u04db\u04dc\7>\2\2\u04dc\u00c1\3\2\2\2\u04dd\u04e2\5\u00c4c\2"+
		"\u04de\u04df\7B\2\2\u04df\u04e1\5\u00c4c\2\u04e0\u04de\3\2\2\2\u04e1\u04e4"+
		"\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u00c3\3\2\2\2\u04e4"+
		"\u04e2\3\2\2\2\u04e5\u04e7\5\u00c6d\2\u04e6\u04e5\3\2\2\2\u04e7\u04ea"+
		"\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04eb\3\2\2\2\u04ea"+
		"\u04e8\3\2\2\2\u04eb\u04f1\7h\2\2\u04ec\u04ee\7;\2\2\u04ed\u04ef\5\u0192"+
		"\u00ca\2\u04ee\u04ed\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0"+
		"\u04f2\7<\2\2\u04f1\u04ec\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f4\3\2"+
		"\2\2\u04f3\u04f5\5f\64\2\u04f4\u04f3\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5"+
		"\u00c5\3\2\2\2\u04f6\u04f7\5\u00eav\2\u04f7\u00c7\3\2\2\2\u04f8\u04fc"+
		"\7A\2\2\u04f9\u04fb\5h\65\2\u04fa\u04f9\3\2\2\2\u04fb\u04fe\3\2\2\2\u04fc"+
		"\u04fa\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u00c9\3\2\2\2\u04fe\u04fc\3\2"+
		"\2\2\u04ff\u0502\5\u00ccg\2\u0500\u0502\5\u00dep\2\u0501\u04ff\3\2\2\2"+
		"\u0501\u0500\3\2\2\2\u0502\u00cb\3\2\2\2\u0503\u0505\5\u00ceh\2\u0504"+
		"\u0503\3\2\2\2\u0505\u0508\3\2\2\2\u0506\u0504\3\2\2\2\u0506\u0507\3\2"+
		"\2\2\u0507\u0509\3\2\2\2\u0508\u0506\3\2\2\2\u0509\u050a\7\36\2\2\u050a"+
		"\u050c\5V,\2\u050b\u050d\5\\/\2\u050c\u050b\3\2\2\2\u050c\u050d\3\2\2"+
		"\2\u050d\u050f\3\2\2\2\u050e\u0510\5\u00d0i\2\u050f\u050e\3\2\2\2\u050f"+
		"\u0510\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0512\5\u00d2j\2\u0512\u00cd"+
		"\3\2\2\2\u0513\u051b\5\u00eav\2\u0514\u051b\7%\2\2\u0515\u051b\7$\2\2"+
		"\u0516\u051b\7#\2\2\u0517\u051b\7\3\2\2\u0518\u051b\7(\2\2\u0519\u051b"+
		"\7)\2\2\u051a\u0513\3\2\2\2\u051a\u0514\3\2\2\2\u051a\u0515\3\2\2\2\u051a"+
		"\u0516\3\2\2\2\u051a\u0517\3\2\2\2\u051a\u0518\3\2\2\2\u051a\u0519\3\2"+
		"\2\2\u051b\u00cf\3\2\2\2\u051c\u051d\7\23\2\2\u051d\u051e\5d\63\2\u051e"+
		"\u00d1\3\2\2\2\u051f\u0523\7=\2\2\u0520\u0522\5\u00d4k\2\u0521\u0520\3"+
		"\2\2\2\u0522\u0525\3\2\2\2\u0523\u0521\3\2\2\2\u0523\u0524\3\2\2\2\u0524"+
		"\u0526\3\2\2\2\u0525\u0523\3\2\2\2\u0526\u0527\7>\2\2\u0527\u00d3\3\2"+
		"\2\2\u0528\u052e\5\u00d6l\2\u0529\u052e\5\u00dan\2\u052a\u052e\5R*\2\u052b"+
		"\u052e\5\u00caf\2\u052c\u052e\7A\2\2\u052d\u0528\3\2\2\2\u052d\u0529\3"+
		"\2\2\2\u052d\u052a\3\2\2\2\u052d\u052b\3\2\2\2\u052d\u052c\3\2\2\2\u052e"+
		"\u00d5\3\2\2\2\u052f\u0531\5\u00d8m\2\u0530\u052f\3\2\2\2\u0531\u0534"+
		"\3\2\2\2\u0532\u0530\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0535\3\2\2\2\u0534"+
		"\u0532\3\2\2\2\u0535\u0536\5x=\2\u0536\u0537\5p9\2\u0537\u0538\7A\2\2"+
		"\u0538\u00d7\3\2\2\2\u0539\u053e\5\u00eav\2\u053a\u053e\7%\2\2\u053b\u053e"+
		"\7(\2\2\u053c\u053e\7\24\2\2\u053d\u0539\3\2\2\2\u053d\u053a\3\2\2\2\u053d"+
		"\u053b\3\2\2\2\u053d\u053c\3\2\2\2\u053e\u00d9\3\2\2\2\u053f\u0541\5\u00dc"+
		"o\2\u0540\u053f\3\2\2\2\u0541\u0544\3\2\2\2\u0542\u0540\3\2\2\2\u0542"+
		"\u0543\3\2\2\2\u0543\u0545\3\2\2\2\u0544\u0542\3\2\2\2\u0545\u0546\5\u0094"+
		"K\2\u0546\u0547\5\u00acW\2\u0547\u00db\3\2\2\2\u0548\u054f\5\u00eav\2"+
		"\u0549\u054f\7%\2\2\u054a\u054f\7\3\2\2\u054b\u054f\7\16\2\2\u054c\u054f"+
		"\7(\2\2\u054d\u054f\7)\2\2\u054e\u0548\3\2\2\2\u054e\u0549\3\2\2\2\u054e"+
		"\u054a\3\2\2\2\u054e\u054b\3\2\2\2\u054e\u054c\3\2\2\2\u054e\u054d\3\2"+
		"\2\2\u054f\u00dd\3\2\2\2\u0550\u0552\5\u00ceh\2\u0551\u0550\3\2\2\2\u0552"+
		"\u0555\3\2\2\2\u0553\u0551\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0556\3\2"+
		"\2\2\u0555\u0553\3\2\2\2\u0556\u0557\7i\2\2\u0557\u0558\7\36\2\2\u0558"+
		"\u0559\7h\2\2\u0559\u055a\5\u00e0q\2\u055a\u00df\3\2\2\2\u055b\u055f\7"+
		"=\2\2\u055c\u055e\5\u00e2r\2\u055d\u055c\3\2\2\2\u055e\u0561\3\2\2\2\u055f"+
		"\u055d\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0562\3\2\2\2\u0561\u055f\3\2"+
		"\2\2\u0562\u0563\7>\2\2\u0563\u00e1\3\2\2\2\u0564\u056a\5\u00e4s\2\u0565"+
		"\u056a\5\u00d6l\2\u0566\u056a\5R*\2\u0567\u056a\5\u00caf\2\u0568\u056a"+
		"\7A\2\2\u0569\u0564\3\2\2\2\u0569\u0565\3\2\2\2\u0569\u0566\3\2\2\2\u0569"+
		"\u0567\3\2\2\2\u0569\u0568\3\2\2\2\u056a\u00e3\3\2\2\2\u056b\u056d\5\u00e6"+
		"t\2\u056c\u056b\3\2\2\2\u056d\u0570\3\2\2\2\u056e\u056c\3\2\2\2\u056e"+
		"\u056f\3\2\2\2\u056f\u0571\3\2\2\2\u0570\u056e\3\2\2\2\u0571\u0572\5x"+
		"=\2\u0572\u0573\7h\2\2\u0573\u0574\7;\2\2\u0574\u0576\7<\2\2\u0575\u0577"+
		"\5 \21\2\u0576\u0575\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0579\3\2\2\2\u0578"+
		"\u057a\5\u00e8u\2\u0579\u0578\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057b"+
		"\3\2\2\2\u057b\u057c\7A\2\2\u057c\u00e5\3\2\2\2\u057d\u0581\5\u00eav\2"+
		"\u057e\u0581\7%\2\2\u057f\u0581\7\3\2\2\u0580\u057d\3\2\2\2\u0580\u057e"+
		"\3\2\2\2\u0580\u057f\3\2\2\2\u0581\u00e7\3\2\2\2\u0582\u0583\7\16\2\2"+
		"\u0583\u0584\5\u00f2z\2\u0584\u00e9\3\2\2\2\u0585\u0589\5\u00ecw\2\u0586"+
		"\u0589\5\u00f8}\2\u0587\u0589\5\u00fa~\2\u0588\u0585\3\2\2\2\u0588\u0586"+
		"\3\2\2\2\u0588\u0587\3\2\2\2\u0589\u00eb\3\2\2\2\u058a\u058b\7i\2\2\u058b"+
		"\u058c\5\66\34\2\u058c\u058e\7;\2\2\u058d\u058f\5\u00eex\2\u058e\u058d"+
		"\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0591\7<\2\2\u0591"+
		"\u00ed\3\2\2\2\u0592\u0597\5\u00f0y\2\u0593\u0594\7B\2\2\u0594\u0596\5"+
		"\u00f0y\2\u0595\u0593\3\2\2\2\u0596\u0599\3\2\2\2\u0597\u0595\3\2\2\2"+
		"\u0597\u0598\3\2\2\2\u0598\u00ef\3\2\2\2\u0599\u0597\3\2\2\2\u059a\u059b"+
		"\7h\2\2\u059b\u059c\7D\2\2\u059c\u059d\5\u00f2z\2\u059d\u00f1\3\2\2\2"+
		"\u059e\u05a2\5\u01b4\u00db\2\u059f\u05a2\5\u00f4{\2\u05a0\u05a2\5\u00ea"+
		"v\2\u05a1\u059e\3\2\2\2\u05a1\u059f\3\2\2\2\u05a1\u05a0\3\2\2\2\u05a2"+
		"\u00f3\3\2\2\2\u05a3\u05a5\7=\2\2\u05a4\u05a6\5\u00f6|\2\u05a5\u05a4\3"+
		"\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a8\3\2\2\2\u05a7\u05a9\7B\2\2\u05a8"+
		"\u05a7\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ab\7>"+
		"\2\2\u05ab\u00f5\3\2\2\2\u05ac\u05b1\5\u00f2z\2\u05ad\u05ae\7B\2\2\u05ae"+
		"\u05b0\5\u00f2z\2\u05af\u05ad\3\2\2\2\u05b0\u05b3\3\2\2\2\u05b1\u05af"+
		"\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u00f7\3\2\2\2\u05b3\u05b1\3\2\2\2\u05b4"+
		"\u05b5\7i\2\2\u05b5\u05b6\5\66\34\2\u05b6\u00f9\3\2\2\2\u05b7\u05b8\7"+
		"i\2\2\u05b8\u05b9\5\66\34\2\u05b9\u05ba\7;\2\2\u05ba\u05bb\5\u00f2z\2"+
		"\u05bb\u05bc\7<\2\2\u05bc\u00fb\3\2\2\2\u05bd\u05bf\7=\2\2\u05be\u05c0"+
		"\5\u00fe\u0080\2\u05bf\u05be\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c2\3"+
		"\2\2\2\u05c1\u05c3\7B\2\2\u05c2\u05c1\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3"+
		"\u05c4\3\2\2\2\u05c4\u05c5\7>\2\2\u05c5\u00fd\3\2\2\2\u05c6\u05cb\5v<"+
		"\2\u05c7\u05c8\7B\2\2\u05c8\u05ca\5v<\2\u05c9\u05c7\3\2\2\2\u05ca\u05cd"+
		"\3\2\2\2\u05cb\u05c9\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u00ff\3\2\2\2\u05cd"+
		"\u05cb\3\2\2\2\u05ce\u05d0\7=\2\2\u05cf\u05d1\5\u0102\u0082\2\u05d0\u05cf"+
		"\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d3\7>\2\2\u05d3"+
		"\u0101\3\2\2\2\u05d4\u05d6\5\u0104\u0083\2\u05d5\u05d4\3\2\2\2\u05d6\u05d7"+
		"\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u0103\3\2\2\2\u05d9"+
		"\u05dd\5\u0106\u0084\2\u05da\u05dd\5R*\2\u05db\u05dd\5\u010a\u0086\2\u05dc"+
		"\u05d9\3\2\2\2\u05dc\u05da\3\2\2\2\u05dc\u05db\3\2\2\2\u05dd\u0105\3\2"+
		"\2\2\u05de\u05df\5\u0108\u0085\2\u05df\u05e0\7A\2\2\u05e0\u0107\3\2\2"+
		"\2\u05e1\u05e3\5\u00a0Q\2\u05e2\u05e1\3\2\2\2\u05e3\u05e6\3\2\2\2\u05e4"+
		"\u05e2\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e7\3\2\2\2\u05e6\u05e4\3\2"+
		"\2\2\u05e7\u05e8\5x=\2\u05e8\u05e9\5p9\2\u05e9\u0109\3\2\2\2\u05ea\u05f1"+
		"\5\u010e\u0088\2\u05eb\u05f1\5\u0112\u008a\2\u05ec\u05f1\5\u011a\u008e"+
		"\2\u05ed\u05f1\5\u011c\u008f\2\u05ee\u05f1\5\u012e\u0098\2\u05ef\u05f1"+
		"\5\u0134\u009b\2\u05f0\u05ea\3\2\2\2\u05f0\u05eb\3\2\2\2\u05f0\u05ec\3"+
		"\2\2\2\u05f0\u05ed\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f0\u05ef\3\2\2\2\u05f1"+
		"\u010b\3\2\2\2\u05f2\u05f8\5\u010e\u0088\2\u05f3\u05f8\5\u0114\u008b\2"+
		"\u05f4\u05f8\5\u011e\u0090\2\u05f5\u05f8\5\u0130\u0099\2\u05f6\u05f8\5"+
		"\u0136\u009c\2\u05f7\u05f2\3\2\2\2\u05f7\u05f3\3\2\2\2\u05f7\u05f4\3\2"+
		"\2\2\u05f7\u05f5\3\2\2\2\u05f7\u05f6\3\2\2\2\u05f8\u010d\3\2\2\2\u05f9"+
		"\u0606\5\u0100\u0081\2\u05fa\u0606\5\u0110\u0089\2\u05fb\u0606\5\u0116"+
		"\u008c\2\u05fc\u0606\5\u0120\u0091\2\u05fd\u0606\5\u0122\u0092\2\u05fe"+
		"\u0606\5\u0132\u009a\2\u05ff\u0606\5\u0146\u00a4\2\u0600\u0606\5\u0148"+
		"\u00a5\2\u0601\u0606\5\u014a\u00a6\2\u0602\u0606\5\u014e\u00a8\2\u0603"+
		"\u0606\5\u014c\u00a7\2\u0604\u0606\5\u0150\u00a9\2\u0605\u05f9\3\2\2\2"+
		"\u0605\u05fa\3\2\2\2\u0605\u05fb\3\2\2\2\u0605\u05fc\3\2\2\2\u0605\u05fd"+
		"\3\2\2\2\u0605\u05fe\3\2\2\2\u0605\u05ff\3\2\2\2\u0605\u0600\3\2\2\2\u0605"+
		"\u0601\3\2\2\2\u0605\u0602\3\2\2\2\u0605\u0603\3\2\2\2\u0605\u0604\3\2"+
		"\2\2\u0606\u010f\3\2\2\2\u0607\u0608\7A\2\2\u0608\u0111\3\2\2\2\u0609"+
		"\u060a\7h\2\2\u060a\u060b\7J\2\2\u060b\u060c\5\u010a\u0086\2\u060c\u0113"+
		"\3\2\2\2\u060d\u060e\7h\2\2\u060e\u060f\7J\2\2\u060f\u0610\5\u010c\u0087"+
		"\2\u0610\u0115\3\2\2\2\u0611\u0612\5\u0118\u008d\2\u0612\u0613\7A\2\2"+
		"\u0613\u0117\3\2\2\2\u0614\u061c\5\u01ae\u00d8\2\u0615\u061c\5\u01cc\u00e7"+
		"\2\u0616\u061c\5\u01ce\u00e8\2\u0617\u061c\5\u01d4\u00eb\2\u0618\u061c"+
		"\5\u01d8\u00ed\2\u0619\u061c\5\u018c\u00c7\2\u061a\u061c\5\u0178\u00bd"+
		"\2\u061b\u0614\3\2\2\2\u061b\u0615\3\2\2\2\u061b\u0616\3\2\2\2\u061b\u0617"+
		"\3\2\2\2\u061b\u0618\3\2\2\2\u061b\u0619\3\2\2\2\u061b\u061a\3\2\2\2\u061c"+
		"\u0119\3\2\2\2\u061d\u061e\7\30\2\2\u061e\u061f\7;\2\2\u061f\u0620\5\u01a2"+
		"\u00d2\2\u0620\u0621\7<\2\2\u0621\u0622\5\u010a\u0086\2\u0622\u011b\3"+
		"\2\2\2\u0623\u0624\7\30\2\2\u0624\u0625\7;\2\2\u0625\u0626\5\u01a2\u00d2"+
		"\2\u0626\u0627\7<\2\2\u0627\u0628\5\u010c\u0087\2\u0628\u0629\7\21\2\2"+
		"\u0629\u062a\5\u010a\u0086\2\u062a\u011d\3\2\2\2\u062b\u062c\7\30\2\2"+
		"\u062c\u062d\7;\2\2\u062d\u062e\5\u01a2\u00d2\2\u062e\u062f\7<\2\2\u062f"+
		"\u0630\5\u010c\u0087\2\u0630\u0631\7\21\2\2\u0631\u0632\5\u010c\u0087"+
		"\2\u0632\u011f\3\2\2\2\u0633\u0634\7\4\2\2\u0634\u0635\5\u01a2\u00d2\2"+
		"\u0635\u0636\7A\2\2\u0636\u063e\3\2\2\2\u0637\u0638\7\4\2\2\u0638\u0639"+
		"\5\u01a2\u00d2\2\u0639\u063a\7J\2\2\u063a\u063b\5\u01a2\u00d2\2\u063b"+
		"\u063c\7A\2\2\u063c\u063e\3\2\2\2\u063d\u0633\3\2\2\2\u063d\u0637\3\2"+
		"\2\2\u063e\u0121\3\2\2\2\u063f\u0640\7+\2\2\u0640\u0641\7;\2\2\u0641\u0642"+
		"\5\u01a2\u00d2\2\u0642\u0643\7<\2\2\u0643\u0644\5\u0124\u0093\2\u0644"+
		"\u0123\3\2\2\2\u0645\u0649\7=\2\2\u0646\u0648\5\u0126\u0094\2\u0647\u0646"+
		"\3\2\2\2\u0648\u064b\3\2\2\2\u0649\u0647\3\2\2\2\u0649\u064a\3\2\2\2\u064a"+
		"\u064f\3\2\2\2\u064b\u0649\3\2\2\2\u064c\u064e\5\u012a\u0096\2\u064d\u064c"+
		"\3\2\2\2\u064e\u0651\3\2\2\2\u064f\u064d\3\2\2\2\u064f\u0650\3\2\2\2\u0650"+
		"\u0652\3\2\2\2\u0651\u064f\3\2\2\2\u0652\u0653\7>\2\2\u0653\u0125\3\2"+
		"\2\2\u0654\u0655\5\u0128\u0095\2\u0655\u0656\5\u0102\u0082\2\u0656\u0127"+
		"\3\2\2\2\u0657\u065b\5\u012a\u0096\2\u0658\u065a\5\u012a\u0096\2\u0659"+
		"\u0658\3\2\2\2\u065a\u065d\3\2\2\2\u065b\u0659\3\2\2\2\u065b\u065c\3\2"+
		"\2\2\u065c\u0129\3\2\2\2\u065d\u065b\3\2\2\2\u065e\u065f\7\b\2\2\u065f"+
		"\u0660\5\u01a0\u00d1\2\u0660\u0661\7J\2\2\u0661\u0669\3\2\2\2\u0662\u0663"+
		"\7\b\2\2\u0663\u0664\5\u012c\u0097\2\u0664\u0665\7J\2\2\u0665\u0669\3"+
		"\2\2\2\u0666\u0667\7\16\2\2\u0667\u0669\7J\2\2\u0668\u065e\3\2\2\2\u0668"+
		"\u0662\3\2\2\2\u0668\u0666\3\2\2\2\u0669\u012b\3\2\2\2\u066a\u066b\7h"+
		"\2\2\u066b\u012d\3\2\2\2\u066c\u066d\7\64\2\2\u066d\u066e\7;\2\2\u066e"+
		"\u066f\5\u01a2\u00d2\2\u066f\u0670\7<\2\2\u0670\u0671\5\u010a\u0086\2"+
		"\u0671\u012f\3\2\2\2\u0672\u0673\7\64\2\2\u0673\u0674\7;\2\2\u0674\u0675"+
		"\5\u01a2\u00d2\2\u0675\u0676\7<\2\2\u0676\u0677\5\u010c\u0087\2\u0677"+
		"\u0131\3\2\2\2\u0678\u0679\7\17\2\2\u0679\u067a\5\u010a\u0086\2\u067a"+
		"\u067b\7\64\2\2\u067b\u067c\7;\2\2\u067c\u067d\5\u01a2\u00d2\2\u067d\u067e"+
		"\7<\2\2\u067e\u067f\7A\2\2\u067f\u0133\3\2\2\2\u0680\u0683\5\u0138\u009d"+
		"\2\u0681\u0683\5\u0142\u00a2\2\u0682\u0680\3\2\2\2\u0682\u0681\3\2\2\2"+
		"\u0683\u0135\3\2\2\2\u0684\u0687\5\u013a\u009e\2\u0685\u0687\5\u0144\u00a3"+
		"\2\u0686\u0684\3\2\2\2\u0686\u0685\3\2\2\2\u0687\u0137\3\2\2\2\u0688\u0689"+
		"\7\27\2\2\u0689\u068b\7;\2\2\u068a\u068c\5\u013c\u009f\2\u068b\u068a\3"+
		"\2\2\2\u068b\u068c\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068f\7A\2\2\u068e"+
		"\u0690\5\u01a2\u00d2\2\u068f\u068e\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u0691"+
		"\3\2\2\2\u0691\u0693\7A\2\2\u0692\u0694\5\u013e\u00a0\2\u0693\u0692\3"+
		"\2\2\2\u0693\u0694\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0696\7<\2\2\u0696"+
		"\u0697\5\u010a\u0086\2\u0697\u0139\3\2\2\2\u0698\u0699\7\27\2\2\u0699"+
		"\u069b\7;\2\2\u069a\u069c\5\u013c\u009f\2\u069b\u069a\3\2\2\2\u069b\u069c"+
		"\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069f\7A\2\2\u069e\u06a0\5\u01a2\u00d2"+
		"\2\u069f\u069e\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a3"+
		"\7A\2\2\u06a2\u06a4\5\u013e\u00a0\2\u06a3\u06a2\3\2\2\2\u06a3\u06a4\3"+
		"\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a6\7<\2\2\u06a6\u06a7\5\u010c\u0087"+
		"\2\u06a7\u013b\3\2\2\2\u06a8\u06ab\5\u0140\u00a1\2\u06a9\u06ab\5\u0108"+
		"\u0085\2\u06aa\u06a8\3\2\2\2\u06aa\u06a9\3\2\2\2\u06ab\u013d\3\2\2\2\u06ac"+
		"\u06ad\5\u0140\u00a1\2\u06ad\u013f\3\2\2\2\u06ae\u06b3\5\u0118\u008d\2"+
		"\u06af\u06b0\7B\2\2\u06b0\u06b2\5\u0118\u008d\2\u06b1\u06af\3\2\2\2\u06b2"+
		"\u06b5\3\2\2\2\u06b3\u06b1\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4\u0141\3\2"+
		"\2\2\u06b5\u06b3\3\2\2\2\u06b6\u06b7\7\27\2\2\u06b7\u06bb\7;\2\2\u06b8"+
		"\u06ba\5\u00a0Q\2\u06b9\u06b8\3\2\2\2\u06ba\u06bd\3\2\2\2\u06bb\u06b9"+
		"\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06be\3\2\2\2\u06bd\u06bb\3\2\2\2\u06be"+
		"\u06bf\5x=\2\u06bf\u06c0\5t;\2\u06c0\u06c1\7J\2\2\u06c1\u06c2\5\u01a2"+
		"\u00d2\2\u06c2\u06c3\7<\2\2\u06c3\u06c4\5\u010a\u0086\2\u06c4\u0143\3"+
		"\2\2\2\u06c5\u06c6\7\27\2\2\u06c6\u06ca\7;\2\2\u06c7\u06c9\5\u00a0Q\2"+
		"\u06c8\u06c7\3\2\2\2\u06c9\u06cc\3\2\2\2\u06ca\u06c8\3\2\2\2\u06ca\u06cb"+
		"\3\2\2\2\u06cb\u06cd\3\2\2\2\u06cc\u06ca\3\2\2\2\u06cd\u06ce\5x=\2\u06ce"+
		"\u06cf\5t;\2\u06cf\u06d0\7J\2\2\u06d0\u06d1\5\u01a2\u00d2\2\u06d1\u06d2"+
		"\7<\2\2\u06d2\u06d3\5\u010c\u0087\2\u06d3\u0145\3\2\2\2\u06d4\u06d6\7"+
		"\6\2\2\u06d5\u06d7\7h\2\2\u06d6\u06d5\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7"+
		"\u06d8\3\2\2\2\u06d8\u06d9\7A\2\2\u06d9\u0147\3\2\2\2\u06da\u06dc\7\r"+
		"\2\2\u06db\u06dd\7h\2\2\u06dc\u06db\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd"+
		"\u06de\3\2\2\2\u06de\u06df\7A\2\2\u06df\u0149\3\2\2\2\u06e0\u06e2\7&\2"+
		"\2\u06e1\u06e3\5\u01a2\u00d2\2\u06e2\u06e1\3\2\2\2\u06e2\u06e3\3\2\2\2"+
		"\u06e3\u06e4\3\2\2\2\u06e4\u06e5\7A\2\2\u06e5\u014b\3\2\2\2\u06e6\u06e7"+
		"\7.\2\2\u06e7\u06e8\5\u01a2\u00d2\2\u06e8\u06e9\7A\2\2\u06e9\u014d\3\2"+
		"\2\2\u06ea\u06eb\7,\2\2\u06eb\u06ec\7;\2\2\u06ec\u06ed\5\u01a2\u00d2\2"+
		"\u06ed\u06ee\7<\2\2\u06ee\u06ef\5\u0100\u0081\2\u06ef\u014f\3\2\2\2\u06f0"+
		"\u06f1\7\61\2\2\u06f1\u06f2\5\u0100\u0081\2\u06f2\u06f3\5\u0152\u00aa"+
		"\2\u06f3\u06fd\3\2\2\2\u06f4\u06f5\7\61\2\2\u06f5\u06f7\5\u0100\u0081"+
		"\2\u06f6\u06f8\5\u0152\u00aa\2\u06f7\u06f6\3\2\2\2\u06f7\u06f8\3\2\2\2"+
		"\u06f8\u06f9\3\2\2\2\u06f9\u06fa\5\u015a\u00ae\2\u06fa\u06fd\3\2\2\2\u06fb"+
		"\u06fd\5\u015c\u00af\2\u06fc\u06f0\3\2\2\2\u06fc\u06f4\3\2\2\2\u06fc\u06fb"+
		"\3\2\2\2\u06fd\u0151\3\2\2\2\u06fe\u0702\5\u0154\u00ab\2\u06ff\u0701\5"+
		"\u0154\u00ab\2\u0700\u06ff\3\2\2\2\u0701\u0704\3\2\2\2\u0702\u0700\3\2"+
		"\2\2\u0702\u0703\3\2\2\2\u0703\u0153\3\2\2\2\u0704\u0702\3\2\2\2\u0705"+
		"\u0706\7\t\2\2\u0706\u0707\7;\2\2\u0707\u0708\5\u0156\u00ac\2\u0708\u0709"+
		"\7<\2\2\u0709\u070a\5\u0100\u0081\2\u070a\u0155\3\2\2\2\u070b\u070d\5"+
		"\u00a0Q\2\u070c\u070b\3\2\2\2\u070d\u0710\3\2\2\2\u070e\u070c\3\2\2\2"+
		"\u070e\u070f\3\2\2\2\u070f\u0711\3\2\2\2\u0710\u070e\3\2\2\2\u0711\u0712"+
		"\5\u0158\u00ad\2\u0712\u0713\5t;\2\u0713\u0157\3\2\2\2\u0714\u0719\5\u0080"+
		"A\2\u0715\u0716\7X\2\2\u0716\u0718\5\20\t\2\u0717\u0715\3\2\2\2\u0718"+
		"\u071b\3\2\2\2\u0719\u0717\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u0159\3\2"+
		"\2\2\u071b\u0719\3\2\2\2\u071c\u071d\7\25\2\2\u071d\u071e\5\u0100\u0081"+
		"\2\u071e\u015b\3\2\2\2\u071f\u0720\7\61\2\2\u0720\u0721\5\u015e\u00b0"+
		"\2\u0721\u0723\5\u0100\u0081\2\u0722\u0724\5\u0152\u00aa\2\u0723\u0722"+
		"\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u0726\3\2\2\2\u0725\u0727\5\u015a\u00ae"+
		"\2\u0726\u0725\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u015d\3\2\2\2\u0728\u0729"+
		"\7;\2\2\u0729\u072b\5\u0160\u00b1\2\u072a\u072c\7A\2\2\u072b\u072a\3\2"+
		"\2\2\u072b\u072c\3\2\2\2\u072c\u072d\3\2\2\2\u072d\u072e\7<\2\2\u072e"+
		"\u015f\3\2\2\2\u072f\u0734\5\u0162\u00b2\2\u0730\u0731\7A\2\2\u0731\u0733"+
		"\5\u0162\u00b2\2\u0732\u0730\3\2\2\2\u0733\u0736\3\2\2\2\u0734\u0732\3"+
		"\2\2\2\u0734\u0735\3\2\2\2\u0735\u0161\3\2\2\2\u0736\u0734\3\2\2\2\u0737"+
		"\u0739\5\u00a0Q\2\u0738\u0737\3\2\2\2\u0739\u073c\3\2\2\2\u073a\u0738"+
		"\3\2\2\2\u073a\u073b\3\2\2\2\u073b\u073d\3\2\2\2\u073c\u073a\3\2\2\2\u073d"+
		"\u073e\5x=\2\u073e\u073f\5t;\2\u073f\u0740\7D\2\2\u0740\u0741\5\u01a2"+
		"\u00d2\2\u0741\u0163\3\2\2\2\u0742\u0745\5\u0172\u00ba\2\u0743\u0745\5"+
		"\u019a\u00ce\2\u0744\u0742\3\2\2\2\u0744\u0743\3\2\2\2\u0745\u0749\3\2"+
		"\2\2\u0746\u0748\5\u016c\u00b7\2\u0747\u0746\3\2\2\2\u0748\u074b\3\2\2"+
		"\2\u0749\u0747\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u0165\3\2\2\2\u074b\u0749"+
		"\3\2\2\2\u074c\u076a\5\2\2\2\u074d\u0752\5\66\34\2\u074e\u074f\7?\2\2"+
		"\u074f\u0751\7@\2\2\u0750\u074e\3\2\2\2\u0751\u0754\3\2\2\2\u0752\u0750"+
		"\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0755\3\2\2\2\u0754\u0752\3\2\2\2\u0755"+
		"\u0756\7C\2\2\u0756\u0757\7\13\2\2\u0757\u076a\3\2\2\2\u0758\u0759\7\62"+
		"\2\2\u0759\u075a\7C\2\2\u075a\u076a\7\13\2\2\u075b\u076a\7-\2\2\u075c"+
		"\u075d\5\66\34\2\u075d\u075e\7C\2\2\u075e\u075f\7-\2\2\u075f\u076a\3\2"+
		"\2\2\u0760\u0761\7;\2\2\u0761\u0762\5\u01a2\u00d2\2\u0762\u0763\7<\2\2"+
		"\u0763\u076a\3\2\2\2\u0764\u076a\5\u0178\u00bd\2\u0765\u076a\5\u0180\u00c1"+
		"\2\u0766\u076a\5\u0186\u00c4\2\u0767\u076a\5\u018c\u00c7\2\u0768\u076a"+
		"\5\u0194\u00cb\2\u0769\u074c\3\2\2\2\u0769\u074d\3\2\2\2\u0769\u0758\3"+
		"\2\2\2\u0769\u075b\3\2\2\2\u0769\u075c\3\2\2\2\u0769\u0760\3\2\2\2\u0769"+
		"\u0764\3\2\2\2\u0769\u0765\3\2\2\2\u0769\u0766\3\2\2\2\u0769\u0767\3\2"+
		"\2\2\u0769\u0768\3\2\2\2\u076a\u0167\3\2\2\2\u076b\u076c\3\2\2\2\u076c"+
		"\u0169\3\2\2\2\u076d\u078a\5\2\2\2\u076e\u0773\5\66\34\2\u076f\u0770\7"+
		"?\2\2\u0770\u0772\7@\2\2\u0771\u076f\3\2\2\2\u0772\u0775\3\2\2\2\u0773"+
		"\u0771\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0776\3\2\2\2\u0775\u0773\3\2"+
		"\2\2\u0776\u0777\7C\2\2\u0777\u0778\7\13\2\2\u0778\u078a\3\2\2\2\u0779"+
		"\u077a\7\62\2\2\u077a\u077b\7C\2\2\u077b\u078a\7\13\2\2\u077c\u078a\7"+
		"-\2\2\u077d\u077e\5\66\34\2\u077e\u077f\7C\2\2\u077f\u0780\7-\2\2\u0780"+
		"\u078a\3\2\2\2\u0781\u0782\7;\2\2\u0782\u0783\5\u01a2\u00d2\2\u0783\u0784"+
		"\7<\2\2\u0784\u078a\3\2\2\2\u0785\u078a\5\u0178\u00bd\2\u0786\u078a\5"+
		"\u0180\u00c1\2\u0787\u078a\5\u018c\u00c7\2\u0788\u078a\5\u0194\u00cb\2"+
		"\u0789\u076d\3\2\2\2\u0789\u076e\3\2\2\2\u0789\u0779\3\2\2\2\u0789\u077c"+
		"\3\2\2\2\u0789\u077d\3\2\2\2\u0789\u0781\3\2\2\2\u0789\u0785\3\2\2\2\u0789"+
		"\u0786\3\2\2\2\u0789\u0787\3\2\2\2\u0789\u0788\3\2\2\2\u078a\u016b\3\2"+
		"\2\2\u078b\u0791\5\u017a\u00be\2\u078c\u0791\5\u0182\u00c2\2\u078d\u0791"+
		"\5\u0188\u00c5\2\u078e\u0791\5\u018e\u00c8\2\u078f\u0791\5\u0196\u00cc"+
		"\2\u0790\u078b\3\2\2\2\u0790\u078c\3\2\2\2\u0790\u078d\3\2\2\2\u0790\u078e"+
		"\3\2\2\2\u0790\u078f\3\2\2\2\u0791\u016d\3\2\2\2\u0792\u0793\3\2\2\2\u0793"+
		"\u016f\3\2\2\2\u0794\u0799\5\u017a\u00be\2\u0795\u0799\5\u0182\u00c2\2"+
		"\u0796\u0799\5\u018e\u00c8\2\u0797\u0799\5\u0196\u00cc\2\u0798\u0794\3"+
		"\2\2\2\u0798\u0795\3\2\2\2\u0798\u0796\3\2\2\2\u0798\u0797\3\2\2\2\u0799"+
		"\u0171\3\2\2\2\u079a\u07c3\5\2\2\2\u079b\u07a0\5\66\34\2\u079c\u079d\7"+
		"?\2\2\u079d\u079f\7@\2\2\u079e\u079c\3\2\2\2\u079f\u07a2\3\2\2\2\u07a0"+
		"\u079e\3\2\2\2\u07a0\u07a1\3\2\2\2\u07a1\u07a3\3\2\2\2\u07a2\u07a0\3\2"+
		"\2\2\u07a3\u07a4\7C\2\2\u07a4\u07a5\7\13\2\2\u07a5\u07c3\3\2\2\2\u07a6"+
		"\u07ab\5z>\2\u07a7\u07a8\7?\2\2\u07a8\u07aa\7@\2\2\u07a9\u07a7\3\2\2\2"+
		"\u07aa\u07ad\3\2\2\2\u07ab\u07a9\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac\u07ae"+
		"\3\2\2\2\u07ad\u07ab\3\2\2\2\u07ae\u07af\7C\2\2\u07af\u07b0\7\13\2\2\u07b0"+
		"\u07c3\3\2\2\2\u07b1\u07b2\7\62\2\2\u07b2\u07b3\7C\2\2\u07b3\u07c3\7\13"+
		"\2\2\u07b4\u07c3\7-\2\2\u07b5\u07b6\5\66\34\2\u07b6\u07b7\7C\2\2\u07b7"+
		"\u07b8\7-\2\2\u07b8\u07c3\3\2\2\2\u07b9\u07ba\7;\2\2\u07ba\u07bb\5\u01a2"+
		"\u00d2\2\u07bb\u07bc\7<\2\2\u07bc\u07c3\3\2\2\2\u07bd\u07c3\5\u017c\u00bf"+
		"\2\u07be\u07c3\5\u0184\u00c3\2\u07bf\u07c3\5\u018a\u00c6\2\u07c0\u07c3"+
		"\5\u0190\u00c9\2\u07c1\u07c3\5\u0198\u00cd\2\u07c2\u079a\3\2\2\2\u07c2"+
		"\u079b\3\2\2\2\u07c2\u07a6\3\2\2\2\u07c2\u07b1\3\2\2\2\u07c2\u07b4\3\2"+
		"\2\2\u07c2\u07b5\3\2\2\2\u07c2\u07b9\3\2\2\2\u07c2\u07bd\3\2\2\2\u07c2"+
		"\u07be\3\2\2\2\u07c2\u07bf\3\2\2\2\u07c2\u07c0\3\2\2\2\u07c2\u07c1\3\2"+
		"\2\2\u07c3\u0173\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5\u0175\3\2\2\2\u07c6"+
		"\u07ee\5\2\2\2\u07c7\u07cc\5\66\34\2\u07c8\u07c9\7?\2\2\u07c9\u07cb\7"+
		"@\2\2\u07ca\u07c8\3\2\2\2\u07cb\u07ce\3\2\2\2\u07cc\u07ca\3\2\2\2\u07cc"+
		"\u07cd\3\2\2\2\u07cd\u07cf\3\2\2\2\u07ce\u07cc\3\2\2\2\u07cf\u07d0\7C"+
		"\2\2\u07d0\u07d1\7\13\2\2\u07d1\u07ee\3\2\2\2\u07d2\u07d7\5z>\2\u07d3"+
		"\u07d4\7?\2\2\u07d4\u07d6\7@\2\2\u07d5\u07d3\3\2\2\2\u07d6\u07d9\3\2\2"+
		"\2\u07d7\u07d5\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u07da\3\2\2\2\u07d9\u07d7"+
		"\3\2\2\2\u07da\u07db\7C\2\2\u07db\u07dc\7\13\2\2\u07dc\u07ee\3\2\2\2\u07dd"+
		"\u07de\7\62\2\2\u07de\u07df\7C\2\2\u07df\u07ee\7\13\2\2\u07e0\u07ee\7"+
		"-\2\2\u07e1\u07e2\5\66\34\2\u07e2\u07e3\7C\2\2\u07e3\u07e4\7-\2\2\u07e4"+
		"\u07ee\3\2\2\2\u07e5\u07e6\7;\2\2\u07e6\u07e7\5\u01a2\u00d2\2\u07e7\u07e8"+
		"\7<\2\2\u07e8\u07ee\3\2\2\2\u07e9\u07ee\5\u017c\u00bf\2\u07ea\u07ee\5"+
		"\u0184\u00c3\2\u07eb\u07ee\5\u0190\u00c9\2\u07ec\u07ee\5\u0198\u00cd\2"+
		"\u07ed\u07c6\3\2\2\2\u07ed\u07c7\3\2\2\2\u07ed\u07d2\3\2\2\2\u07ed\u07dd"+
		"\3\2\2\2\u07ed\u07e0\3\2\2\2\u07ed\u07e1\3\2\2\2\u07ed\u07e5\3\2\2\2\u07ed"+
		"\u07e9\3\2\2\2\u07ed\u07ea\3\2\2\2\u07ed\u07eb\3\2\2\2\u07ed\u07ec\3\2"+
		"\2\2\u07ee\u0177\3\2\2\2\u07ef\u07f1\7!\2\2\u07f0\u07f2\5*\26\2\u07f1"+
		"\u07f0\3\2\2\2\u07f1\u07f2\3\2\2\2\u07f2\u07f6\3\2\2\2\u07f3\u07f5\5\u00ea"+
		"v\2\u07f4\u07f3\3\2\2\2\u07f5\u07f8\3\2\2\2\u07f6\u07f4\3\2\2\2\u07f6"+
		"\u07f7\3\2\2\2\u07f7\u07f9\3\2\2\2\u07f8\u07f6\3\2\2\2\u07f9\u0804\7h"+
		"\2\2\u07fa\u07fe\7C\2\2\u07fb\u07fd\5\u00eav\2\u07fc\u07fb\3\2\2\2\u07fd"+
		"\u0800\3\2\2\2\u07fe\u07fc\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0801\3\2"+
		"\2\2\u0800\u07fe\3\2\2\2\u0801\u0803\7h\2\2\u0802\u07fa\3\2\2\2\u0803"+
		"\u0806\3\2\2\2\u0804\u0802\3\2\2\2\u0804\u0805\3\2\2\2\u0805\u0808\3\2"+
		"\2\2\u0806\u0804\3\2\2\2\u0807\u0809\5\u017e\u00c0\2\u0808\u0807\3\2\2"+
		"\2\u0808\u0809\3\2\2\2\u0809\u080a\3\2\2\2\u080a\u080c\7;\2\2\u080b\u080d"+
		"\5\u0192\u00ca\2\u080c\u080b\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u080e\3"+
		"\2\2\2\u080e\u0810\7<\2\2\u080f\u0811\5f\64\2\u0810\u080f\3\2\2\2\u0810"+
		"\u0811\3\2\2\2\u0811\u0843\3\2\2\2\u0812\u0813\5:\36\2\u0813\u0814\7C"+
		"\2\2\u0814\u0816\7!\2\2\u0815\u0817\5*\26\2\u0816\u0815\3\2\2\2\u0816"+
		"\u0817\3\2\2\2\u0817\u081b\3\2\2\2\u0818\u081a\5\u00eav\2\u0819\u0818"+
		"\3\2\2\2\u081a\u081d\3\2\2\2\u081b\u0819\3\2\2\2\u081b\u081c\3\2\2\2\u081c"+
		"\u081e\3\2\2\2\u081d\u081b\3\2\2\2\u081e\u0820\7h\2\2\u081f\u0821\5\u017e"+
		"\u00c0\2\u0820\u081f\3\2\2\2\u0820\u0821\3\2\2\2\u0821\u0822\3\2\2\2\u0822"+
		"\u0824\7;\2\2\u0823\u0825\5\u0192\u00ca\2\u0824\u0823\3\2\2\2\u0824\u0825"+
		"\3\2\2\2\u0825\u0826\3\2\2\2\u0826\u0828\7<\2\2\u0827\u0829\5f\64\2\u0828"+
		"\u0827\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u0843\3\2\2\2\u082a\u082b\5\u0164"+
		"\u00b3\2\u082b\u082c\7C\2\2\u082c\u082e\7!\2\2\u082d\u082f\5*\26\2\u082e"+
		"\u082d\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0833\3\2\2\2\u0830\u0832\5\u00ea"+
		"v\2\u0831\u0830\3\2\2\2\u0832\u0835\3\2\2\2\u0833\u0831\3\2\2\2\u0833"+
		"\u0834\3\2\2\2\u0834\u0836\3\2\2\2\u0835\u0833\3\2\2\2\u0836\u0838\7h"+
		"\2\2\u0837\u0839\5\u017e\u00c0\2\u0838\u0837\3\2\2\2\u0838\u0839\3\2\2"+
		"\2\u0839\u083a\3\2\2\2\u083a\u083c\7;\2\2\u083b\u083d\5\u0192\u00ca\2"+
		"\u083c\u083b\3\2\2\2\u083c\u083d\3\2\2\2\u083d\u083e\3\2\2\2\u083e\u0840"+
		"\7<\2\2\u083f\u0841\5f\64\2\u0840\u083f\3\2\2\2\u0840\u0841\3\2\2\2\u0841"+
		"\u0843\3\2\2\2\u0842\u07ef\3\2\2\2\u0842\u0812\3\2\2\2\u0842\u082a\3\2"+
		"\2\2\u0843\u0179\3\2\2\2\u0844\u0845\7C\2\2\u0845\u0847\7!\2\2\u0846\u0848"+
		"\5*\26\2\u0847\u0846\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u084c\3\2\2\2\u0849"+
		"\u084b\5\u00eav\2\u084a\u0849\3\2\2\2\u084b\u084e\3\2\2\2\u084c\u084a"+
		"\3\2\2\2\u084c\u084d\3\2\2\2\u084d\u084f\3\2\2\2\u084e\u084c\3\2\2\2\u084f"+
		"\u0851\7h\2\2\u0850\u0852\5\u017e\u00c0\2\u0851\u0850\3\2\2\2\u0851\u0852"+
		"\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u0855\7;\2\2\u0854\u0856\5\u0192\u00ca"+
		"\2\u0855\u0854\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u0859"+
		"\7<\2\2\u0858\u085a\5f\64\2\u0859\u0858\3\2\2\2\u0859\u085a\3\2\2\2\u085a"+
		"\u017b\3\2\2\2\u085b\u085d\7!\2\2\u085c\u085e\5*\26\2\u085d\u085c\3\2"+
		"\2\2\u085d\u085e\3\2\2\2\u085e\u0862\3\2\2\2\u085f\u0861\5\u00eav\2\u0860"+
		"\u085f\3\2\2\2\u0861\u0864\3\2\2\2\u0862\u0860\3\2\2\2\u0862\u0863\3\2"+
		"\2\2\u0863\u0865\3\2\2\2\u0864\u0862\3\2\2\2\u0865\u0870\7h\2\2\u0866"+
		"\u086a\7C\2\2\u0867\u0869\5\u00eav\2\u0868\u0867\3\2\2\2\u0869\u086c\3"+
		"\2\2\2\u086a\u0868\3\2\2\2\u086a\u086b\3\2\2\2\u086b\u086d\3\2\2\2\u086c"+
		"\u086a\3\2\2\2\u086d\u086f\7h\2\2\u086e\u0866\3\2\2\2\u086f\u0872\3\2"+
		"\2\2\u0870\u086e\3\2\2\2\u0870\u0871\3\2\2\2\u0871\u0874\3\2\2\2\u0872"+
		"\u0870\3\2\2\2\u0873\u0875\5\u017e\u00c0\2\u0874\u0873\3\2\2\2\u0874\u0875"+
		"\3\2\2\2\u0875\u0876\3\2\2\2\u0876\u0878\7;\2\2\u0877\u0879\5\u0192\u00ca"+
		"\2\u0878\u0877\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u087a\3\2\2\2\u087a\u087c"+
		"\7<\2\2\u087b\u087d\5f\64\2\u087c\u087b\3\2\2\2\u087c\u087d\3\2\2\2\u087d"+
		"\u0897\3\2\2\2\u087e\u087f\5:\36\2\u087f\u0880\7C\2\2\u0880\u0882\7!\2"+
		"\2\u0881\u0883\5*\26\2\u0882\u0881\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u0887"+
		"\3\2\2\2\u0884\u0886\5\u00eav\2\u0885\u0884\3\2\2\2\u0886\u0889\3\2\2"+
		"\2\u0887\u0885\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u088a\3\2\2\2\u0889\u0887"+
		"\3\2\2\2\u088a\u088c\7h\2\2\u088b\u088d\5\u017e\u00c0\2\u088c\u088b\3"+
		"\2\2\2\u088c\u088d\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u0890\7;\2\2\u088f"+
		"\u0891\5\u0192\u00ca\2\u0890\u088f\3\2\2\2\u0890\u0891\3\2\2\2\u0891\u0892"+
		"\3\2\2\2\u0892\u0894\7<\2\2\u0893\u0895\5f\64\2\u0894\u0893\3\2\2\2\u0894"+
		"\u0895\3\2\2\2\u0895\u0897\3\2\2\2\u0896\u085b\3\2\2\2\u0896\u087e\3\2"+
		"\2\2\u0897\u017d\3\2\2\2\u0898\u089c\5*\26\2\u0899\u089a\7F\2\2\u089a"+
		"\u089c\7E\2\2\u089b\u0898\3\2\2\2\u089b\u0899\3\2\2\2\u089c\u017f\3\2"+
		"\2\2\u089d\u089e\5\u0164\u00b3\2\u089e\u089f\7C\2\2\u089f\u08a0\7h\2\2"+
		"\u08a0\u08ab\3\2\2\2\u08a1\u08a2\7*\2\2\u08a2\u08a3\7C\2\2\u08a3\u08ab"+
		"\7h\2\2\u08a4\u08a5\5\66\34\2\u08a5\u08a6\7C\2\2\u08a6\u08a7\7*\2\2\u08a7"+
		"\u08a8\7C\2\2\u08a8\u08a9\7h\2\2\u08a9\u08ab\3\2\2\2\u08aa\u089d\3\2\2"+
		"\2\u08aa\u08a1\3\2\2\2\u08aa\u08a4\3\2\2\2\u08ab\u0181\3\2\2\2\u08ac\u08ad"+
		"\7C\2\2\u08ad\u08ae\7h\2\2\u08ae\u0183\3\2\2\2\u08af\u08b0\7*\2\2\u08b0"+
		"\u08b1\7C\2\2\u08b1\u08b9\7h\2\2\u08b2\u08b3\5\66\34\2\u08b3\u08b4\7C"+
		"\2\2\u08b4\u08b5\7*\2\2\u08b5\u08b6\7C\2\2\u08b6\u08b7\7h\2\2\u08b7\u08b9"+
		"\3\2\2\2\u08b8\u08af\3\2\2\2\u08b8\u08b2\3\2\2\2\u08b9\u0185\3\2\2\2\u08ba"+
		"\u08bb\5:\36\2\u08bb\u08bc\7?\2\2\u08bc\u08bd\5\u01a2\u00d2\2\u08bd\u08be"+
		"\7@\2\2\u08be\u08c5\3\2\2\2\u08bf\u08c0\5\u016a\u00b6\2\u08c0\u08c1\7"+
		"?\2\2\u08c1\u08c2\5\u01a2\u00d2\2\u08c2\u08c3\7@\2\2\u08c3\u08c5\3\2\2"+
		"\2\u08c4\u08ba\3\2\2\2\u08c4\u08bf\3\2\2\2\u08c5\u08cd\3\2\2\2\u08c6\u08c7"+
		"\5\u0168\u00b5\2\u08c7\u08c8\7?\2\2\u08c8\u08c9\5\u01a2\u00d2\2\u08c9"+
		"\u08ca\7@\2\2\u08ca\u08cc\3\2\2\2\u08cb\u08c6\3\2\2\2\u08cc\u08cf\3\2"+
		"\2\2\u08cd\u08cb\3\2\2\2\u08cd\u08ce\3\2\2\2\u08ce\u0187\3\2\2\2\u08cf"+
		"\u08cd\3\2\2\2\u08d0\u08d1\5\u0170\u00b9\2\u08d1\u08d2\7?\2\2\u08d2\u08d3"+
		"\5\u01a2\u00d2\2\u08d3\u08d4\7@\2\2\u08d4\u08dc\3\2\2\2\u08d5\u08d6\5"+
		"\u016e\u00b8\2\u08d6\u08d7\7?\2\2\u08d7\u08d8\5\u01a2\u00d2\2\u08d8\u08d9"+
		"\7@\2\2\u08d9\u08db\3\2\2\2\u08da\u08d5\3\2\2\2\u08db\u08de\3\2\2\2\u08dc"+
		"\u08da\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u0189\3\2\2\2\u08de\u08dc\3\2"+
		"\2\2\u08df\u08e0\5:\36\2\u08e0\u08e1\7?\2\2\u08e1\u08e2\5\u01a2\u00d2"+
		"\2\u08e2\u08e3\7@\2\2\u08e3\u08ea\3\2\2\2\u08e4\u08e5\5\u0176\u00bc\2"+
		"\u08e5\u08e6\7?\2\2\u08e6\u08e7\5\u01a2\u00d2\2\u08e7\u08e8\7@\2\2\u08e8"+
		"\u08ea\3\2\2\2\u08e9\u08df\3\2\2\2\u08e9\u08e4\3\2\2\2\u08ea\u08f2\3\2"+
		"\2\2\u08eb\u08ec\5\u0174\u00bb\2\u08ec\u08ed\7?\2\2\u08ed\u08ee\5\u01a2"+
		"\u00d2\2\u08ee\u08ef\7@\2\2\u08ef\u08f1\3\2\2\2\u08f0\u08eb\3\2\2\2\u08f1"+
		"\u08f4\3\2\2\2\u08f2\u08f0\3\2\2\2\u08f2\u08f3\3\2\2\2\u08f3\u018b\3\2"+
		"\2\2\u08f4\u08f2\3\2\2\2\u08f5\u08f6\5<\37\2\u08f6\u08f8\7;\2\2\u08f7"+
		"\u08f9\5\u0192\u00ca\2\u08f8\u08f7\3\2\2\2\u08f8\u08f9\3\2\2\2\u08f9\u08fa"+
		"\3\2\2\2\u08fa\u08fb\7<\2\2\u08fb\u093a\3\2\2\2\u08fc\u08fd\5\66\34\2"+
		"\u08fd\u08ff\7C\2\2\u08fe\u0900\5*\26\2\u08ff\u08fe\3\2\2\2\u08ff\u0900"+
		"\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0902\7h\2\2\u0902\u0904\7;\2\2\u0903"+
		"\u0905\5\u0192\u00ca\2\u0904\u0903\3\2\2\2\u0904\u0905\3\2\2\2\u0905\u0906"+
		"\3\2\2\2\u0906\u0907\7<\2\2\u0907\u093a\3\2\2\2\u0908\u0909\5:\36\2\u0909"+
		"\u090b\7C\2\2\u090a\u090c\5*\26\2\u090b\u090a\3\2\2\2\u090b\u090c\3\2"+
		"\2\2\u090c\u090d\3\2\2\2\u090d\u090e\7h\2\2\u090e\u0910\7;\2\2\u090f\u0911"+
		"\5\u0192\u00ca\2\u0910\u090f\3\2\2\2\u0910\u0911\3\2\2\2\u0911\u0912\3"+
		"\2\2\2\u0912\u0913\7<\2\2\u0913\u093a\3\2\2\2\u0914\u0915\5\u0164\u00b3"+
		"\2\u0915\u0917\7C\2\2\u0916\u0918\5*\26\2\u0917\u0916\3\2\2\2\u0917\u0918"+
		"\3\2\2\2\u0918\u0919\3\2\2\2\u0919\u091a\7h\2\2\u091a\u091c\7;\2\2\u091b"+
		"\u091d\5\u0192\u00ca\2\u091c\u091b\3\2\2\2\u091c\u091d\3\2\2\2\u091d\u091e"+
		"\3\2\2\2\u091e\u091f\7<\2\2\u091f\u093a\3\2\2\2\u0920\u0921\7*\2\2\u0921"+
		"\u0923\7C\2\2\u0922\u0924\5*\26\2\u0923\u0922\3\2\2\2\u0923\u0924\3\2"+
		"\2\2\u0924\u0925\3\2\2\2\u0925\u0926\7h\2\2\u0926\u0928\7;\2\2\u0927\u0929"+
		"\5\u0192\u00ca\2\u0928\u0927\3\2\2\2\u0928\u0929\3\2\2\2\u0929\u092a\3"+
		"\2\2\2\u092a\u093a\7<\2\2\u092b\u092c\5\66\34\2\u092c\u092d\7C\2\2\u092d"+
		"\u092e\7*\2\2\u092e\u0930\7C\2\2\u092f\u0931\5*\26\2\u0930\u092f\3\2\2"+
		"\2\u0930\u0931\3\2\2\2\u0931\u0932\3\2\2\2\u0932\u0933\7h\2\2\u0933\u0935"+
		"\7;\2\2\u0934\u0936\5\u0192\u00ca\2\u0935\u0934\3\2\2\2\u0935\u0936\3"+
		"\2\2\2\u0936\u0937\3\2\2\2\u0937\u0938\7<\2\2\u0938\u093a\3\2\2\2\u0939"+
		"\u08f5\3\2\2\2\u0939\u08fc\3\2\2\2\u0939\u0908\3\2\2\2\u0939\u0914\3\2"+
		"\2\2\u0939\u0920\3\2\2\2\u0939\u092b\3\2\2\2\u093a\u018d\3\2\2\2\u093b"+
		"\u093d\7C\2\2\u093c\u093e\5*\26\2\u093d\u093c\3\2\2\2\u093d\u093e\3\2"+
		"\2\2\u093e\u093f\3\2\2\2\u093f\u0940\7h\2\2\u0940\u0942\7;\2\2\u0941\u0943"+
		"\5\u0192\u00ca\2\u0942\u0941\3\2\2\2\u0942\u0943\3\2\2\2\u0943\u0944\3"+
		"\2\2\2\u0944\u0945\7<\2\2\u0945\u018f\3\2\2\2\u0946\u0947\5<\37\2\u0947"+
		"\u0949\7;\2\2\u0948\u094a\5\u0192\u00ca\2\u0949\u0948\3\2\2\2\u0949\u094a"+
		"\3\2\2\2\u094a\u094b\3\2\2\2\u094b\u094c\7<\2\2\u094c\u097f\3\2\2\2\u094d"+
		"\u094e\5\66\34\2\u094e\u0950\7C\2\2\u094f\u0951\5*\26\2\u0950\u094f\3"+
		"\2\2\2\u0950\u0951\3\2\2\2\u0951\u0952\3\2\2\2\u0952\u0953\7h\2\2\u0953"+
		"\u0955\7;\2\2\u0954\u0956\5\u0192\u00ca\2\u0955\u0954\3\2\2\2\u0955\u0956"+
		"\3\2\2\2\u0956\u0957\3\2\2\2\u0957\u0958\7<\2\2\u0958\u097f\3\2\2\2\u0959"+
		"\u095a\5:\36\2\u095a\u095c\7C\2\2\u095b\u095d\5*\26\2\u095c\u095b\3\2"+
		"\2\2\u095c\u095d\3\2\2\2\u095d\u095e\3\2\2\2\u095e\u095f\7h\2\2\u095f"+
		"\u0961\7;\2\2\u0960\u0962\5\u0192\u00ca\2\u0961\u0960\3\2\2\2\u0961\u0962"+
		"\3\2\2\2\u0962\u0963\3\2\2\2\u0963\u0964\7<\2\2\u0964\u097f\3\2\2\2\u0965"+
		"\u0966\7*\2\2\u0966\u0968\7C\2\2\u0967\u0969\5*\26\2\u0968\u0967\3\2\2"+
		"\2\u0968\u0969\3\2\2\2\u0969\u096a\3\2\2\2\u096a\u096b\7h\2\2\u096b\u096d"+
		"\7;\2\2\u096c\u096e\5\u0192\u00ca\2\u096d\u096c\3\2\2\2\u096d\u096e\3"+
		"\2\2";
	private static final String _serializedATNSegment1 =
		"\2\u096e\u096f\3\2\2\2\u096f\u097f\7<\2\2\u0970\u0971\5\66\34\2\u0971"+
		"\u0972\7C\2\2\u0972\u0973\7*\2\2\u0973\u0975\7C\2\2\u0974\u0976\5*\26"+
		"\2\u0975\u0974\3\2\2\2\u0975\u0976\3\2\2\2\u0976\u0977\3\2\2\2\u0977\u0978"+
		"\7h\2\2\u0978\u097a\7;\2\2\u0979\u097b\5\u0192\u00ca\2\u097a\u0979\3\2"+
		"\2\2\u097a\u097b\3\2\2\2\u097b\u097c\3\2\2\2\u097c\u097d\7<\2\2\u097d"+
		"\u097f\3\2\2\2\u097e\u0946\3\2\2\2\u097e\u094d\3\2\2\2\u097e\u0959\3\2"+
		"\2\2\u097e\u0965\3\2\2\2\u097e\u0970\3\2\2\2\u097f\u0191\3\2\2\2\u0980"+
		"\u0985\5\u01a2\u00d2\2\u0981\u0982\7B\2\2\u0982\u0984\5\u01a2\u00d2\2"+
		"\u0983\u0981\3\2\2\2\u0984\u0987\3\2\2\2\u0985\u0983\3\2\2\2\u0985\u0986"+
		"\3\2\2\2\u0986\u0193\3\2\2\2\u0987\u0985\3\2\2\2\u0988\u0989\5:\36\2\u0989"+
		"\u098b\7\\\2\2\u098a\u098c\5*\26\2\u098b\u098a\3\2\2\2\u098b\u098c\3\2"+
		"\2\2\u098c\u098d\3\2\2\2\u098d\u098e\7h\2\2\u098e\u09b8\3\2\2\2\u098f"+
		"\u0990\5\f\7\2\u0990\u0992\7\\\2\2\u0991\u0993\5*\26\2\u0992\u0991\3\2"+
		"\2\2\u0992\u0993\3\2\2\2\u0993\u0994\3\2\2\2\u0994\u0995\7h\2\2\u0995"+
		"\u09b8\3\2\2\2\u0996\u0997\5\u0164\u00b3\2\u0997\u0999\7\\\2\2\u0998\u099a"+
		"\5*\26\2\u0999\u0998\3\2\2\2\u0999\u099a\3\2\2\2\u099a\u099b\3\2\2\2\u099b"+
		"\u099c\7h\2\2\u099c\u09b8\3\2\2\2\u099d\u099e\7*\2\2\u099e\u09a0\7\\\2"+
		"\2\u099f\u09a1\5*\26\2\u09a0\u099f\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1\u09a2"+
		"\3\2\2\2\u09a2\u09b8\7h\2\2\u09a3\u09a4\5\66\34\2\u09a4\u09a5\7C\2\2\u09a5"+
		"\u09a6\7*\2\2\u09a6\u09a8\7\\\2\2\u09a7\u09a9\5*\26\2\u09a8\u09a7\3\2"+
		"\2\2\u09a8\u09a9\3\2\2\2\u09a9\u09aa\3\2\2\2\u09aa\u09ab\7h\2\2\u09ab"+
		"\u09b8\3\2\2\2\u09ac\u09ad\5\20\t\2\u09ad\u09af\7\\\2\2\u09ae\u09b0\5"+
		"*\26\2\u09af\u09ae\3\2\2\2\u09af\u09b0\3\2\2\2\u09b0\u09b1\3\2\2\2\u09b1"+
		"\u09b2\7!\2\2\u09b2\u09b8\3\2\2\2\u09b3\u09b4\5\36\20\2\u09b4\u09b5\7"+
		"\\\2\2\u09b5\u09b6\7!\2\2\u09b6\u09b8\3\2\2\2\u09b7\u0988\3\2\2\2\u09b7"+
		"\u098f\3\2\2\2\u09b7\u0996\3\2\2\2\u09b7\u099d\3\2\2\2\u09b7\u09a3\3\2"+
		"\2\2\u09b7\u09ac\3\2\2\2\u09b7\u09b3\3\2\2\2\u09b8\u0195\3\2\2\2\u09b9"+
		"\u09bb\7\\\2\2\u09ba\u09bc\5*\26\2\u09bb\u09ba\3\2\2\2\u09bb\u09bc\3\2"+
		"\2\2\u09bc\u09bd\3\2\2\2\u09bd\u09be\7h\2\2\u09be\u0197\3\2\2\2\u09bf"+
		"\u09c0\5:\36\2\u09c0\u09c2\7\\\2\2\u09c1\u09c3\5*\26\2\u09c2\u09c1\3\2"+
		"\2\2\u09c2\u09c3\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u09c5\7h\2\2\u09c5"+
		"\u09e8\3\2\2\2\u09c6\u09c7\5\f\7\2\u09c7\u09c9\7\\\2\2\u09c8\u09ca\5*"+
		"\26\2\u09c9\u09c8\3\2\2\2\u09c9\u09ca\3\2\2\2\u09ca\u09cb\3\2\2\2\u09cb"+
		"\u09cc\7h\2\2\u09cc\u09e8\3\2\2\2\u09cd\u09ce\7*\2\2\u09ce\u09d0\7\\\2"+
		"\2\u09cf\u09d1\5*\26\2\u09d0\u09cf\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1\u09d2"+
		"\3\2\2\2\u09d2\u09e8\7h\2\2\u09d3\u09d4\5\66\34\2\u09d4\u09d5\7C\2\2\u09d5"+
		"\u09d6\7*\2\2\u09d6\u09d8\7\\\2\2\u09d7\u09d9\5*\26\2\u09d8\u09d7\3\2"+
		"\2\2\u09d8\u09d9\3\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09db\7h\2\2\u09db"+
		"\u09e8\3\2\2\2\u09dc\u09dd\5\20\t\2\u09dd\u09df\7\\\2\2\u09de\u09e0\5"+
		"*\26\2\u09df\u09de\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u09e1\3\2\2\2\u09e1"+
		"\u09e2\7!\2\2\u09e2\u09e8\3\2\2\2\u09e3\u09e4\5\36\20\2\u09e4\u09e5\7"+
		"\\\2\2\u09e5\u09e6\7!\2\2\u09e6\u09e8\3\2\2\2\u09e7\u09bf\3\2\2\2\u09e7"+
		"\u09c6\3\2\2\2\u09e7\u09cd\3\2\2\2\u09e7\u09d3\3\2\2\2\u09e7\u09dc\3\2"+
		"\2\2\u09e7\u09e3\3\2\2\2\u09e8\u0199\3\2\2\2\u09e9\u09ea\7!\2\2\u09ea"+
		"\u09eb\5\4\3\2\u09eb\u09ed\5\u019c\u00cf\2\u09ec\u09ee\5 \21\2\u09ed\u09ec"+
		"\3\2\2\2\u09ed\u09ee\3\2\2\2\u09ee\u0a00\3\2\2\2\u09ef\u09f0\7!\2\2\u09f0"+
		"\u09f1\5\16\b\2\u09f1\u09f3\5\u019c\u00cf\2\u09f2\u09f4\5 \21\2\u09f3"+
		"\u09f2\3\2\2\2\u09f3\u09f4\3\2\2\2\u09f4\u0a00\3\2\2\2\u09f5\u09f6\7!"+
		"\2\2\u09f6\u09f7\5\4\3\2\u09f7\u09f8\5 \21\2\u09f8\u09f9\5\u00fc\177\2"+
		"\u09f9\u0a00\3\2\2\2\u09fa\u09fb\7!\2\2\u09fb\u09fc\5\16\b\2\u09fc\u09fd"+
		"\5 \21\2\u09fd\u09fe\5\u00fc\177\2\u09fe\u0a00\3\2\2\2\u09ff\u09e9\3\2"+
		"\2\2\u09ff\u09ef\3\2\2\2\u09ff\u09f5\3\2\2\2\u09ff\u09fa\3\2\2\2\u0a00"+
		"\u019b\3\2\2\2\u0a01\u0a05\5\u019e\u00d0\2\u0a02\u0a04\5\u019e\u00d0\2"+
		"\u0a03\u0a02\3\2\2\2\u0a04\u0a07\3\2\2\2\u0a05\u0a03\3\2\2\2\u0a05\u0a06"+
		"\3\2\2\2\u0a06\u019d\3\2\2\2\u0a07\u0a05\3\2\2\2\u0a08\u0a0a\5\u00eav"+
		"\2\u0a09\u0a08\3\2\2\2\u0a0a\u0a0d\3\2\2\2\u0a0b\u0a09\3\2\2\2\u0a0b\u0a0c"+
		"\3\2\2\2\u0a0c\u0a0e\3\2\2\2\u0a0d\u0a0b\3\2\2\2\u0a0e\u0a0f\7?\2\2\u0a0f"+
		"\u0a10\5\u01a2\u00d2\2\u0a10\u0a11\7@\2\2\u0a11\u019f\3\2\2\2\u0a12\u0a13"+
		"\5\u01a2\u00d2\2\u0a13\u01a1\3\2\2\2\u0a14\u0a17\5\u01a4\u00d3\2\u0a15"+
		"\u0a17\5\u01ac\u00d7\2\u0a16\u0a14\3\2\2\2\u0a16\u0a15\3\2\2\2\u0a17\u01a3"+
		"\3\2\2\2\u0a18\u0a19\5\u01a6\u00d4\2\u0a19\u0a1a\7[\2\2\u0a1a\u0a1b\5"+
		"\u01aa\u00d6\2\u0a1b\u01a5\3\2\2\2\u0a1c\u0a27\7h\2\2\u0a1d\u0a1f\7;\2"+
		"\2\u0a1e\u0a20\5\u009aN\2\u0a1f\u0a1e\3\2\2\2\u0a1f\u0a20\3\2\2\2\u0a20"+
		"\u0a21\3\2\2\2\u0a21\u0a27\7<\2\2\u0a22\u0a23\7;\2\2\u0a23\u0a24\5\u01a8"+
		"\u00d5\2\u0a24\u0a25\7<\2\2\u0a25\u0a27\3\2\2\2\u0a26\u0a1c\3\2\2\2\u0a26"+
		"\u0a1d\3\2\2\2\u0a26\u0a22\3\2\2\2\u0a27\u01a7\3\2\2\2\u0a28\u0a2d\7h"+
		"\2\2\u0a29\u0a2a\7B\2\2\u0a2a\u0a2c\7h\2\2\u0a2b\u0a29\3\2\2\2\u0a2c\u0a2f"+
		"\3\2\2\2\u0a2d\u0a2b\3\2\2\2\u0a2d\u0a2e\3\2\2\2\u0a2e\u01a9\3\2\2\2\u0a2f"+
		"\u0a2d\3\2\2\2\u0a30\u0a33\5\u01a2\u00d2\2\u0a31\u0a33\5\u0100\u0081\2"+
		"\u0a32\u0a30\3\2\2\2\u0a32\u0a31\3\2\2\2\u0a33\u01ab\3\2\2\2\u0a34\u0a37"+
		"\5\u01b4\u00db\2\u0a35\u0a37\5\u01ae\u00d8\2\u0a36\u0a34\3\2\2\2\u0a36"+
		"\u0a35\3\2\2\2\u0a37\u01ad\3\2\2\2\u0a38\u0a39\5\u01b0\u00d9\2\u0a39\u0a3a"+
		"\5\u01b2\u00da\2\u0a3a\u0a3b\5\u01a2\u00d2\2\u0a3b\u01af\3\2\2\2\u0a3c"+
		"\u0a40\5:\36\2\u0a3d\u0a40\5\u0180\u00c1\2\u0a3e\u0a40\5\u0186\u00c4\2"+
		"\u0a3f\u0a3c\3\2\2\2\u0a3f\u0a3d\3\2\2\2\u0a3f\u0a3e\3\2\2\2\u0a40\u01b1"+
		"\3\2\2\2\u0a41\u0a42\t\5\2\2\u0a42\u01b3\3\2\2\2\u0a43\u0a4b\5\u01b6\u00dc"+
		"\2\u0a44\u0a45\5\u01b6\u00dc\2\u0a45\u0a46\7I\2\2\u0a46\u0a47\5\u01a2"+
		"\u00d2\2\u0a47\u0a48\7J\2\2\u0a48\u0a49\5\u01b4\u00db\2\u0a49\u0a4b\3"+
		"\2\2\2\u0a4a\u0a43\3\2\2\2\u0a4a\u0a44\3\2\2\2\u0a4b\u01b5\3\2\2\2\u0a4c"+
		"\u0a4d\b\u00dc\1\2\u0a4d\u0a4e\5\u01b8\u00dd\2\u0a4e\u0a54\3\2\2\2\u0a4f"+
		"\u0a50\f\3\2\2\u0a50\u0a51\7P\2\2\u0a51\u0a53\5\u01b8\u00dd\2\u0a52\u0a4f"+
		"\3\2\2\2\u0a53\u0a56\3\2\2\2\u0a54\u0a52\3\2\2\2\u0a54\u0a55\3\2\2\2\u0a55"+
		"\u01b7\3\2\2\2\u0a56\u0a54\3\2\2\2\u0a57\u0a58\b\u00dd\1\2\u0a58\u0a59"+
		"\5\u01ba\u00de\2\u0a59\u0a5f\3\2\2\2\u0a5a\u0a5b\f\3\2\2\u0a5b\u0a5c\7"+
		"O\2\2\u0a5c\u0a5e\5\u01ba\u00de\2\u0a5d\u0a5a\3\2\2\2\u0a5e\u0a61\3\2"+
		"\2\2\u0a5f\u0a5d\3\2\2\2\u0a5f\u0a60\3\2\2\2\u0a60\u01b9\3\2\2\2\u0a61"+
		"\u0a5f\3\2\2\2\u0a62\u0a63\b\u00de\1\2\u0a63\u0a64\5\u01bc\u00df\2\u0a64"+
		"\u0a6a\3\2\2\2\u0a65\u0a66\f\3\2\2\u0a66\u0a67\7X\2\2\u0a67\u0a69\5\u01bc"+
		"\u00df\2\u0a68\u0a65\3\2\2\2\u0a69\u0a6c\3\2\2\2\u0a6a\u0a68\3\2\2\2\u0a6a"+
		"\u0a6b\3\2\2\2\u0a6b\u01bb\3\2\2\2\u0a6c\u0a6a\3\2\2\2\u0a6d\u0a6e\b\u00df"+
		"\1\2\u0a6e\u0a6f\5\u01be\u00e0\2\u0a6f\u0a75\3\2\2\2\u0a70\u0a71\f\3\2"+
		"\2\u0a71\u0a72\7Y\2\2\u0a72\u0a74\5\u01be\u00e0\2\u0a73\u0a70\3\2\2\2"+
		"\u0a74\u0a77\3\2\2\2\u0a75\u0a73\3\2\2\2\u0a75\u0a76\3\2\2\2\u0a76\u01bd"+
		"\3\2\2\2\u0a77\u0a75\3\2\2\2\u0a78\u0a79\b\u00e0\1\2\u0a79\u0a7a\5\u01c0"+
		"\u00e1\2\u0a7a\u0a80\3\2\2\2\u0a7b\u0a7c\f\3\2\2\u0a7c\u0a7d\7W\2\2\u0a7d"+
		"\u0a7f\5\u01c0\u00e1\2\u0a7e\u0a7b\3\2\2\2\u0a7f\u0a82\3\2\2\2\u0a80\u0a7e"+
		"\3\2\2\2\u0a80\u0a81\3\2\2\2\u0a81\u01bf\3\2\2\2\u0a82\u0a80\3\2\2\2\u0a83"+
		"\u0a84\b\u00e1\1\2\u0a84\u0a85\5\u01c2\u00e2\2\u0a85\u0a8e\3\2\2\2\u0a86"+
		"\u0a87\f\4\2\2\u0a87\u0a88\7K\2\2\u0a88\u0a8d\5\u01c2\u00e2\2\u0a89\u0a8a"+
		"\f\3\2\2\u0a8a\u0a8b\7N\2\2\u0a8b\u0a8d\5\u01c2\u00e2\2\u0a8c\u0a86\3"+
		"\2\2\2\u0a8c\u0a89\3\2\2\2\u0a8d\u0a90\3\2\2\2\u0a8e\u0a8c\3\2\2\2\u0a8e"+
		"\u0a8f\3\2\2\2\u0a8f\u01c1\3\2\2\2\u0a90\u0a8e\3\2\2\2\u0a91\u0a92\b\u00e2"+
		"\1\2\u0a92\u0a93\5\u01c4\u00e3\2\u0a93\u0aa5\3\2\2\2\u0a94\u0a95\f\7\2"+
		"\2\u0a95\u0a96\7F\2\2\u0a96\u0aa4\5\u01c4\u00e3\2\u0a97\u0a98\f\6\2\2"+
		"\u0a98\u0a99\7E\2\2\u0a99\u0aa4\5\u01c4\u00e3\2\u0a9a\u0a9b\f\5\2\2\u0a9b"+
		"\u0a9c\7L\2\2\u0a9c\u0aa4\5\u01c4\u00e3\2\u0a9d\u0a9e\f\4\2\2\u0a9e\u0a9f"+
		"\7M\2\2\u0a9f\u0aa4\5\u01c4\u00e3\2\u0aa0\u0aa1\f\3\2\2\u0aa1\u0aa2\7"+
		"\34\2\2\u0aa2\u0aa4\5\f\7\2\u0aa3\u0a94\3\2\2\2\u0aa3\u0a97\3\2\2\2\u0aa3"+
		"\u0a9a\3\2\2\2\u0aa3\u0a9d\3\2\2\2\u0aa3\u0aa0\3\2\2\2\u0aa4\u0aa7\3\2"+
		"\2\2\u0aa5\u0aa3\3\2\2\2\u0aa5\u0aa6\3\2\2\2\u0aa6\u01c3\3\2\2\2\u0aa7"+
		"\u0aa5\3\2\2\2\u0aa8\u0aa9\b\u00e3\1\2\u0aa9\u0aaa\5\u01c6\u00e4\2\u0aaa"+
		"\u0aba\3\2\2\2\u0aab\u0aac\f\5\2\2\u0aac\u0aad\7F\2\2\u0aad\u0aae\7F\2"+
		"\2\u0aae\u0ab9\5\u01c6\u00e4\2\u0aaf\u0ab0\f\4\2\2\u0ab0\u0ab1\7E\2\2"+
		"\u0ab1\u0ab2\7E\2\2\u0ab2\u0ab9\5\u01c6\u00e4\2\u0ab3\u0ab4\f\3\2\2\u0ab4"+
		"\u0ab5\7E\2\2\u0ab5\u0ab6\7E\2\2\u0ab6\u0ab7\7E\2\2\u0ab7\u0ab9\5\u01c6"+
		"\u00e4\2\u0ab8\u0aab\3\2\2\2\u0ab8\u0aaf\3\2\2\2\u0ab8\u0ab3\3\2\2\2\u0ab9"+
		"\u0abc\3\2\2\2\u0aba\u0ab8\3\2\2\2\u0aba\u0abb\3\2\2\2\u0abb\u01c5\3\2"+
		"\2\2\u0abc\u0aba\3\2\2\2\u0abd\u0abe\b\u00e4\1\2\u0abe\u0abf\5\u01c8\u00e5"+
		"\2\u0abf\u0ac8\3\2\2\2\u0ac0\u0ac1\f\4\2\2\u0ac1\u0ac2\7S\2\2\u0ac2\u0ac7"+
		"\5\u01c8\u00e5\2\u0ac3\u0ac4\f\3\2\2\u0ac4\u0ac5\7T\2\2\u0ac5\u0ac7\5"+
		"\u01c8\u00e5\2\u0ac6\u0ac0\3\2\2\2\u0ac6\u0ac3\3\2\2\2\u0ac7\u0aca\3\2"+
		"\2\2\u0ac8\u0ac6\3\2\2\2\u0ac8\u0ac9\3\2\2\2\u0ac9\u01c7\3\2\2\2\u0aca"+
		"\u0ac8\3\2\2\2\u0acb\u0acc\b\u00e5\1\2\u0acc\u0acd\5\u01ca\u00e6\2\u0acd"+
		"\u0ad9\3\2\2\2\u0ace\u0acf\f\5\2\2\u0acf\u0ad0\7U\2\2\u0ad0\u0ad8\5\u01ca"+
		"\u00e6\2\u0ad1\u0ad2\f\4\2\2\u0ad2\u0ad3\7V\2\2\u0ad3\u0ad8\5\u01ca\u00e6"+
		"\2\u0ad4\u0ad5\f\3\2\2\u0ad5\u0ad6\7Z\2\2\u0ad6\u0ad8\5\u01ca\u00e6\2"+
		"\u0ad7\u0ace\3\2\2\2\u0ad7\u0ad1\3\2\2\2\u0ad7\u0ad4\3\2\2\2\u0ad8\u0adb"+
		"\3\2\2\2\u0ad9\u0ad7\3\2\2\2\u0ad9\u0ada\3\2\2\2\u0ada\u01c9\3\2\2\2\u0adb"+
		"\u0ad9\3\2\2\2\u0adc\u0ae4\5\u01cc\u00e7\2\u0add\u0ae4\5\u01ce\u00e8\2"+
		"\u0ade\u0adf\7S\2\2\u0adf\u0ae4\5\u01ca\u00e6\2\u0ae0\u0ae1\7T\2\2\u0ae1"+
		"\u0ae4\5\u01ca\u00e6\2\u0ae2\u0ae4\5\u01d0\u00e9\2\u0ae3\u0adc\3\2\2\2"+
		"\u0ae3\u0add\3\2\2\2\u0ae3\u0ade\3\2\2\2\u0ae3\u0ae0\3\2\2\2\u0ae3\u0ae2"+
		"\3\2\2\2\u0ae4\u01cb\3\2\2\2\u0ae5\u0ae6\7Q\2\2\u0ae6\u0ae7\5\u01ca\u00e6"+
		"\2\u0ae7\u01cd\3\2\2\2\u0ae8\u0ae9\7R\2\2\u0ae9\u0aea\5\u01ca\u00e6\2"+
		"\u0aea\u01cf\3\2\2\2\u0aeb\u0af2\5\u01d2\u00ea\2\u0aec\u0aed\7H\2\2\u0aed"+
		"\u0af2\5\u01ca\u00e6\2\u0aee\u0aef\7G\2\2\u0aef\u0af2\5\u01ca\u00e6\2"+
		"\u0af0\u0af2\5\u01dc\u00ef\2\u0af1\u0aeb\3\2\2\2\u0af1\u0aec\3\2\2\2\u0af1"+
		"\u0aee\3\2\2\2\u0af1\u0af0\3\2\2\2\u0af2\u01d1\3\2\2\2\u0af3\u0af6\5\u0164"+
		"\u00b3\2\u0af4\u0af6\5:\36\2\u0af5\u0af3\3\2\2\2\u0af5\u0af4\3\2\2\2\u0af6"+
		"\u0afb\3\2\2\2\u0af7\u0afa\5\u01d6\u00ec\2\u0af8\u0afa\5\u01da\u00ee\2"+
		"\u0af9\u0af7\3\2\2\2\u0af9\u0af8\3\2\2\2\u0afa\u0afd\3\2\2\2\u0afb\u0af9"+
		"\3\2\2\2\u0afb\u0afc\3\2\2\2\u0afc\u01d3\3\2\2\2\u0afd\u0afb\3\2\2\2\u0afe"+
		"\u0aff\5\u01d2\u00ea\2\u0aff\u0b00\7Q\2\2\u0b00\u01d5\3\2\2\2\u0b01\u0b02"+
		"\7Q\2\2\u0b02\u01d7\3\2\2\2\u0b03\u0b04\5\u01d2\u00ea\2\u0b04\u0b05\7"+
		"R\2\2\u0b05\u01d9\3\2\2\2\u0b06\u0b07\7R\2\2\u0b07\u01db\3\2\2\2\u0b08"+
		"\u0b09\7;\2\2\u0b09\u0b0a\5\4\3\2\u0b0a\u0b0b\7<\2\2\u0b0b\u0b0c\5\u01ca"+
		"\u00e6\2\u0b0c\u0b24\3\2\2\2\u0b0d\u0b0e\7;\2\2\u0b0e\u0b12\5\f\7\2\u0b0f"+
		"\u0b11\5(\25\2\u0b10\u0b0f\3\2\2\2\u0b11\u0b14\3\2\2\2\u0b12\u0b10\3\2"+
		"\2\2\u0b12\u0b13\3\2\2\2\u0b13\u0b15\3\2\2\2\u0b14\u0b12\3\2\2\2\u0b15"+
		"\u0b16\7<\2\2\u0b16\u0b17\5\u01d0\u00e9\2\u0b17\u0b24\3\2\2\2\u0b18\u0b19"+
		"\7;\2\2\u0b19\u0b1d\5\f\7\2\u0b1a\u0b1c\5(\25\2\u0b1b\u0b1a\3\2\2\2\u0b1c"+
		"\u0b1f\3\2\2\2\u0b1d\u0b1b\3\2\2\2\u0b1d\u0b1e\3\2\2\2\u0b1e\u0b20\3\2"+
		"\2\2\u0b1f\u0b1d\3\2\2\2\u0b20\u0b21\7<\2\2\u0b21\u0b22\5\u01a4\u00d3"+
		"\2\u0b22\u0b24\3\2\2\2\u0b23\u0b08\3\2\2\2\u0b23\u0b0d\3\2\2\2\u0b23\u0b18"+
		"\3\2\2\2\u0b24\u01dd\3\2\2\2\u0144\u01e3\u01ea\u01ee\u01f2\u01fb\u01ff"+
		"\u0203\u0205\u020b\u0210\u0217\u021c\u021e\u0224\u0229\u022e\u0233\u023e"+
		"\u024c\u0251\u0259\u0260\u0266\u026b\u0276\u0279\u0287\u028c\u0291\u0296"+
		"\u029c\u02a6\u02ae\u02b8\u02c0\u02cc\u02d0\u02d5\u02db\u02e3\u02f0\u030d"+
		"\u0311\u031a\u0320\u0323\u0326\u0332\u033d\u034b\u0352\u035b\u0362\u0367"+
		"\u0376\u037d\u0383\u0387\u038b\u038f\u0393\u0398\u039c\u03a0\u03a2\u03a7"+
		"\u03ae\u03b3\u03b5\u03bb\u03c0\u03c4\u03d7\u03dc\u03ec\u03f1\u03f7\u03fd"+
		"\u03ff\u0403\u0408\u040c\u0414\u041b\u0423\u0426\u042b\u0433\u0438\u043f"+
		"\u0446\u044b\u0451\u045d\u0462\u0466\u0470\u0475\u047d\u0480\u0485\u048d"+
		"\u0490\u0495\u049a\u049f\u04a4\u04ab\u04b0\u04b8\u04bd\u04c2\u04c7\u04cd"+
		"\u04d3\u04d6\u04d9\u04e2\u04e8\u04ee\u04f1\u04f4\u04fc\u0501\u0506\u050c"+
		"\u050f\u051a\u0523\u052d\u0532\u053d\u0542\u054e\u0553\u055f\u0569\u056e"+
		"\u0576\u0579\u0580\u0588\u058e\u0597\u05a1\u05a5\u05a8\u05b1\u05bf\u05c2"+
		"\u05cb\u05d0\u05d7\u05dc\u05e4\u05f0\u05f7\u0605\u061b\u063d\u0649\u064f"+
		"\u065b\u0668\u0682\u0686\u068b\u068f\u0693\u069b\u069f\u06a3\u06aa\u06b3"+
		"\u06bb\u06ca\u06d6\u06dc\u06e2\u06f7\u06fc\u0702\u070e\u0719\u0723\u0726"+
		"\u072b\u0734\u073a\u0744\u0749\u0752\u0769\u0773\u0789\u0790\u0798\u07a0"+
		"\u07ab\u07c2\u07cc\u07d7\u07ed\u07f1\u07f6\u07fe\u0804\u0808\u080c\u0810"+
		"\u0816\u081b\u0820\u0824\u0828\u082e\u0833\u0838\u083c\u0840\u0842\u0847"+
		"\u084c\u0851\u0855\u0859\u085d\u0862\u086a\u0870\u0874\u0878\u087c\u0882"+
		"\u0887\u088c\u0890\u0894\u0896\u089b\u08aa\u08b8\u08c4\u08cd\u08dc\u08e9"+
		"\u08f2\u08f8\u08ff\u0904\u090b\u0910\u0917\u091c\u0923\u0928\u0930\u0935"+
		"\u0939\u093d\u0942\u0949\u0950\u0955\u095c\u0961\u0968\u096d\u0975\u097a"+
		"\u097e\u0985\u098b\u0992\u0999\u09a0\u09a8\u09af\u09b7\u09bb\u09c2\u09c9"+
		"\u09d0\u09d8\u09df\u09e7\u09ed\u09f3\u09ff\u0a05\u0a0b\u0a16\u0a1f\u0a26"+
		"\u0a2d\u0a32\u0a36\u0a3f\u0a4a\u0a54\u0a5f\u0a6a\u0a75\u0a80\u0a8c\u0a8e"+
		"\u0aa3\u0aa5\u0ab8\u0aba\u0ac6\u0ac8\u0ad7\u0ad9\u0ae3\u0af1\u0af5\u0af9"+
		"\u0afb\u0b12\u0b1d\u0b23";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
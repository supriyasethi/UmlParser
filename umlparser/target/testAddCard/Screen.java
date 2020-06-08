/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

package starbucks ;

import java.util.* ;

/**
 * Base Class for Screens.
 * 
 * Provides Common Functionality
 * For Setting Up the Composite and 
 * Chain of Responsibility Patterns.
 * 
 */
public class Screen implements IScreen, IDisplayComponent
{
    /** Display Components */
    private ArrayList<IDisplayComponent> components = new ArrayList<IDisplayComponent>() ;

    /** Front of Event Chain */
    private ITouchEventHandler chain ;

    /** Constructor */
    public Screen()
    {
    }

    /**
     * Send Touch Events to the Chain
     * @param x Touch X Coord.
     * @param y Touch Y Coord.
     */
    public void touch(int x, int y) {
        System.err.println("In Screen touch");
        chain.touch(x, y) ;
    }
    
    /** Next Screen - Not Used */
    public void next() {
        // add code here
    }
    
    /** Previous Screen - Not Used */
    public void prev()  {
        // add code here
    }
        
    /**
     * Set Next Screen - Not Used 
     * @param s Next Screen Object
     * @param n Next Screen Label
     */
    public void setNext(IScreen s, String n )  {
        // add code here
    }
    
    /**
     * Send Previous Screen - Not Used
     * @param s Previous Screen Object
     * @param n Previous Screen Label
     */
    public void setPrev(IScreen s, String n )  {
        // add code here
    }

    /**
     * Set Frame
     * @param frame Frame
     */
    @Override
    public void setFrame(IFrame frame) {

    }

    /**
     * Set Card Screen
     * @param addcard AddCard
     */
    @Override
    public void setCardScrn(AddCard addcard) {

    }

    /** update card balance
     * @param v - used to send the card balance
     * @param cardkey - used to send cardkey as parameter
     **/
    @Override
    public void setCardBal(String cardkey, double v) {

    }

    /** initialize card balance
     * @param cardkey - used to send cardkey as parameter
     * @param v - send the card balance
     */
    @Override
    public void initializeCard(String cardkey, double v) {

    }

    /**
     * Set screen with screen name
     * @param screen Screen
     */
    @Override
    public void setScreen(IScreen screen) {

    }

    /**
     * Add Display Component to Screen
     * @param c Display Component
     */
    public void addSubComponent( IDisplayComponent c )
    {
        //System.err.println("In Screen addSubcomponents");
        components.add( c ) ;
        if (components.size() == 1 )
        {
            chain = (ITouchEventHandler) c ;
        }
        else
        {
            ITouchEventHandler prev = (ITouchEventHandler) components.get(components.size()-2) ;
            prev.setNext( (ITouchEventHandler) c ) ;
        }
    }
    
    /**
     * Get Display Contents
     * @return value
     */
    public String display() {
        //System.err.println("In Screen display");
        String value = "" ;
        StringBuffer sb = new StringBuffer();
        for (IDisplayComponent c : components )
        {
            System.err.println( "Screen: " + c.getClass().getName() ) ;
            sb.append(value);
            sb.append(c.display());
            sb.append("\n");
            //value = value + c.display() + "\n" ;
        }
        value = sb.toString();
        return value ; 
    }

    /**
     * Get Class Name of Current Screen
     * @return Class Name of Current Screen
     */
    public String name() {
        //System.err.println("In Screen name");
        return (this.getClass().getName()).split("\\.")[1] ;
    }

}

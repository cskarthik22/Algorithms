package com.studycs.Algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Learning Algorithms!" );
        Vector v = new Vector();
        BackTracking h = new BackTracking();
       
        h.printSumofDices(3,7, v);
        System.out.println( "Number of function calls : " + h.calls );
        h.calls =0;
        Vector s = new Vector();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        h.permute(s, new Vector());
        System.out.println( "Number of function calls : " + h.calls );
        
        
    }
}

package com.studycs.Algorithms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintAllBinaries {
	 public static void main( String[] args )
	    {
		 BackTracking h = new BackTracking();
	        System.out.println( "Welcome to BackTracking!" );
	        Scanner in = new Scanner(System.in);
	        try {
	            
	            while(true) {
	         	   System.out.print("Enter the choices (1-2): \n 1: Print Binaries : \n 2: Quit \n");
	                int choice;
	                choice = in.nextInt();
	         	   switch (choice) {
	                case 1:  
	                   System.out.print("Enter a digit : ");
	             	   int digits = in.nextInt();
	                   h.printBinaries(digits, "");
	                   break;
	       
	                default: System.out.print("Exit from the program \n");
	             	        return;      
	                } 
	            }
	            }
	            catch (InputMismatchException e) {
	         		System.out.println("ERROR! Entered choice is not between 1 - 2 ... exit!\"");
	         		System.exit(0);
	         	} 
	            catch (Exception e) {
	         		System.out.println(e.getMessage());
	         	}
	        
	    }
}

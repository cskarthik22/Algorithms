package com.studycs.Algorithms;

import java.util.List;
import java.util.Vector;

public class BackTracking {
     int calls = 0;
	 void printBinaries(int digits, String finalresult) {
	    	//String val = finalresult;
	    	//String val2 = finalresult;
	    	if(digits==0){ 
	    		// BASE CONDITION
	    		System.out.println( finalresult );
	    	}
	    	else {
	    		
	    		// EXPLORE OTHER DIGITS FOLLOWED BY "0"
	    		//val = val + "0";
	    		printBinaries(digits-1,  finalresult + "0");
	    		
	    		// EXPLORE OTHER DIGITS FOLLOWED BY "1"
	    		//val2 = val2 + "1";
	    		printBinaries(digits-1,  finalresult + "1");
	    	}
		 }
	 
	 void printSumofDices(int numofdices, int desiredsum, Vector result) {
		 calls++;
		 if(numofdices == 0) {  // BASE CONDITION
			 if(desiredsum == 0) {
			 System.out.println( " " + result );
			 }
		 } else if (desiredsum >= numofdices * 1 && desiredsum <= numofdices * 6 ){
			 
			 for(int i=1;i<=6;i++) {
				 //1: CHOOSE 2: EXPLORE  3: UNCHOOSE
				 result.add(i);
				 printSumofDices(numofdices-1, desiredsum -i, result);
				 result.remove(result.size()-1);
			 }
		 }
	 }
	 
	 void permute(Vector s , Vector chosen) {
		 calls++;
		 if(s.isEmpty()) {  // BASE CONDITION
			
			 System.out.println( " " + chosen );
			
		 } else {
			 
			 for(int i=0;i<s.size();i++) {
				 //1: CHOOSE 2: EXPLORE  3: UNCHOOSE
				 // STEP1 : CHOOSE
				 String element = s.get(i).toString();
				 s.remove(i);
				 chosen.add(element);
				 // STEP2 : EXPLORE / RECURSIVE FUNCTION
				 permute(s, chosen);
				 //STEP3: UNCHOSE
				 chosen.remove(chosen.size()-1);
				 s.add(i, element);
				 
			 }
		 }
	 }
}

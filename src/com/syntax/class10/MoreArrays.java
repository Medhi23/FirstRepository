package com.syntax.class10;

public class MoreArrays {

	public static void main(String[] args) {
		
		char[] grade= {'A','B','C','D','E','F'};
		char sendValue=grade[1];
	    
	    String[] names = {"Mike", "Burju", "Jack", "Danilo", "Bryan"};
	    String secondVal=names[1];
	    
	    for(int a=0; a<grade.length; a++) {
	    	
	    	char valueFromArray=grade[a];
	    	System.out.println(valueFromArray);
	    }

	}

}

package com.syntax.class09;

public class PrintingPatterns {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			System.out.print("+");
		}
		System.out.println();
		for(int i=1; i<=5; i++) {
			System.out.print("+");
	    }
		System.out.println();
	    for(int i=1; i<=5; i++) {
			System.out.print("+");
        }
	    
	    
	    System.out.println("Printing patterns best way");
	    for(int r=1; r<=6; r++) {
	    	for(int c=1; c<=12; c++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	   System.out.println("------square of numbers");
	   
	    for(int b=1; b<=5; b++) {//how many rows 5
	    	for(int f=7; f>=1; f--) {//print 7-1
	    		System.out.print(f);
	    	}
	    	System.out.println();
	    }
	    
	    
	    
	    
}
}

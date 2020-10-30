package com.syntax.class11;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
	//create an array on double using scanner
	//and calculate the sum of all elements that was stored in an array
	Scanner scan=new Scanner(System.in);
	double[] num;
	double sum=0;
	int size;
	System.out.println("How many number would you like to add up?");
	size=scan.nextInt();
	
	num = new double[size];
	//store values into array
	for(int i=0; i<size; i++) {
		System.out.println("please enter double numbers");
		num[i]=scan.nextDouble();
	}
	// loop through created array
    //	for(int i=0; i<num.length; i++) {
    //sum=sum+num[i];
	for(double numbers:num) {// advanced for loop
		sum=numbers;
	}
	
	System.out.println(sum);
	
		
	
		  
		  }
		
		    
	}



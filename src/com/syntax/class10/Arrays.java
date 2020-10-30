package com.syntax.class10;

public class Arrays {

	public static void main(String[] args) {
	
//arrarys in java
//arrays are container that store data/values of same type
//i have 5 students in class and i need to calculate the average score
		int[] grades=new int[5];
		grades[0]=98;
		grades[1]=80;
		grades[2]=89;
		grades[3]=67;
		grades[4]=77;
		int average=(grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;
		System.out.println(average);
		
		int a=10;
		int b;
		b=10;
		double[]array;
		array=new double[3];
		array[0]=12.99;
		array[1]=10.89;
		array[2]=5.55;
		System.out.println(array[2]);
		
	//	array[3]=7;
	//	System.out.println(array[3]);
		String[] liquid=new String[4];
		liquid[2]="Water";
		liquid[1]="Tea";
		System.out.println(liquid[0]);//null
		
		
		}

	}



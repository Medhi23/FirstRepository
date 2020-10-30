package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] num= new int[5];    
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		//to access element from an array
		System.out.println(num[2]);
		System.out.println(num[1]+num[4]);
		
		int[] array1=new int[2];
		//array[0]=10.99; CE: type of value must be integer
		String[] array= new String[4];
		array[0]="Hello";
		array[1]="Hi";
		array[2]="wassup";
		array[3]="bye";
		System.out.println(array[2]);
		

	}

}

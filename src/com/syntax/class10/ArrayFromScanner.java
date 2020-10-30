package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		//lets ask user how many names you like to store
		//and then store those names
		Scanner scan=new Scanner(System.in);
		String[] names;
		int size;
		
		System.out.println("How many names would you like to store");
		size=scan.nextInt();
		
		 names=new String[size];
		 //we are storing values into an array
		for(int i=0; i<size; i++) {
			System.out.println("Please enter any name");
			names[i]=scan.next();
		}
		// we are retrieving values from an array
		for(int a=0; a<names.length; a++) {
			System.out.println(names[a] +" ");
		}
		
	}

}

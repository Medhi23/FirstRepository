package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// create a program that will keep asking user to apply
		// for a credit card. As soon you get yes from a user
		// program should stop asking.
		Scanner scan=new Scanner(System.in);
		String response;
		 do {
			 System.out.println("do you want to apply for credit card");
			 response=scan.nextLine();
			 
		 }while (!response.equalsIgnoreCase("yes"));
		 System.out.println("You are selected");
		 //write a program that reads a range of integers
		 //(start and end point)
		 //provided by a user and then from that range prints the sum
		 //of the even and odd integers
		 
		 System.out.println("please enter start point number");
		 int startPoint=scan.nextInt();
		 
		 System.out.println("please enter end point number");
		 int endPoint=scan.nextInt();
		 
		 int sumE=0, sumO=0;
		 
		 for(int i =startPoint; i<=endPoint; i++) {
			 if(i%2 == 0) {
				 sumE += i;
			 }
			 if (i%2 !=0) {
				 sumO +=i;
				 
			 }
		 }
		 System.out.println("sumE is "+sumE);
		 System.out.println("sumO is "+sumO);

		 
		 
	}

}

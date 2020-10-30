package com.syntax.class08;

public class OddAndEvenSum {

	public static void main(String[] args) {
	int sumO=0;
	int sumE=0;
	for( int n=1; n<51; n++) {
		if(n%2 == 0) {
			sumE+=n;
		}else {
			sumO+=n;
		}
	}
	System.out.println("The sum of even numbers"+sumE);
	System.out.println("The sum of odd numbers"+sumO);

	// i want to create a multiplication table
	// 1x1=1
	//1x2=2
	//1x3=3
	//1x10=10
	
	int num1=1;
	int mult;
	for(int i=1; i<=10; i++) {
		mult=num1*i;
		System.out.println(num1+"x"+i+"="+mult);
	}
	}

}

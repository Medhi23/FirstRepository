package com.syntax.class09;

public class NestedLoops {

	public static void main(String[] args) {
	for(int i=1; i<3; i++) {
		System.out.println("I am an outer loop");
		for(int y=1; y<=3; y++) {
			System.out.println("I am an inner loop");//prints three times
			
		}
	}

	}

}

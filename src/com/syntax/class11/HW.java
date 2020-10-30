package com.syntax.class11;

public class HW {

	public static void main(String[] args) {
	
	//create an array of animals and store 6 elements into it
	//using 2 different loops print all elements from the array
		String[] animals= {"lion","tiger","panther","gorilla"};
		for(int a=0; a<animals.length; a++) {
			System.out.println(animals[a]+" ");
			
		}
		
		System.out.println("--------");
		for(String animal:animals) {
			System.out.println(animal+" ");
		}
	}

}

package com.syntax.class10;

public class ArrarysAnotherWay {

	public static void main(String[] args) {
		String[] names= {"Mike", "Burju", "Jack", "Danilo", "Bryan"};
		System.out.println(names[3]);
		//how do i know how many elements i have in array?
		
		int size=names.length;
		System.out.println("Size of names array="+size);
		
		System.out.println(names[names.length-2]);//danilo
		
		int i=2;
		System.out.println(names[i]);//jack
		
		i+=2;//increase by 2
		System.out.println(names[i]);//bryan
		
		for(int a=0; a<=names.length-1; a++) {
			System.out.print(names[a]+" ");
		}
		
          
	}

}

package com.syntax.class10;

public class AllValuesFromArray {

	public static void main(String[] args) {
		
		String[] cars = {"Maserati", "Lambo", "Lexus", "Mercedes", "Infiniti"};
		
		for(int a=0; a<cars.length; a++) {
			System.out.println(cars[a]+" ");
		}

		System.out.println();
		System.out.println("getting values form array using enhanced for loop");
		//enhanced for loop works only with arrays
		//for (: name of array
		
		for(String car:cars) {
			System.out.print(car +" ");
		}
		int[] numbers= {10, 10, 90, 600, 89};
		for(int num:numbers) {
			System.out.print(num+ " ");
		}
		
		boolean[] arrayOfBoolean= {true, true, false, true};
		for(boolean boo:arrayOfBoolean) {
			System.out.println(boo);
		}
	}

}

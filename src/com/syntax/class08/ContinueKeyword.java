package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
	
		//i want to print numbers from 1 to 5 except 3
		
		for(int i=1; i<=5; i++) {
			
			if(i==3) {
				continue;// skips the iteration 
			}
			System.out.println(i);
			
		}

		//i want to print numbers form 1to10 except 3and7
		for (int i=1; i<=10; i++) {
			if(i==3 || i==7) {
				continue;
			}
				System.out.println(i);
			}
		}
	}



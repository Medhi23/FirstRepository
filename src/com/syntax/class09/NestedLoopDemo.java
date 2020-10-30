package com.syntax.class09;

public class NestedLoopDemo {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println("Hello");
			for(int y=0; y<3; y++) {
				System.out.println("Bye");
			}
			System.out.println("---");
		}

		System.out.println("how i print numbers form 10 to 99");
		
		//for(int i=10; i<=99; i++) {
	//		System.out.println(i+" ");
//		}
		for(int i=1; i<=9; i++) {
			for(int j=0; j<=9; j++) {
				System.out.print(i+ "" +j);
			}
		}
		System.out.println("----how can i print clock");
		for(int h=0; h<24; h++) {
			
			for(int m=0; m<60; m++) {
				if(m<10) {
					System.out.println("0"+h + ":0"+m);
				}else {
				System.out.println("0"+h + ":"+m);
			}
		}
		
	}

		System.out.println("-----how can i print odometer---");
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				for(int c=0; c<10; c++) {
					for(int d=0; d<10; d++) {
							System.out.println(i+""+j+""+c+""+d);
						}
					}
				}
			}
		}
}


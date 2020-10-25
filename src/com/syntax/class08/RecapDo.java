package com.syntax.class08;

import java.util.Scanner;

public class RecapDo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int money;
		int waterPrice=5;
		
		System.out.println("Please pay for your water!");
		
		do {
			
			money=input.nextInt();
			
			if(money>waterPrice) {
				System.out.println("This is to much, you need less money");
				money =input.nextInt();
			}else if (money<waterPrice) {
				System.out.println("Insert more money");
			//	money =input.nextInt();
			}	
			}while(money!=waterPrice);		
			System.out.println("enjoy your water");
		
		}
		
	}



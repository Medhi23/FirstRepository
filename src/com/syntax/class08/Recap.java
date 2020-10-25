package com.syntax.class08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		/* ask user to pay for a water
		 * water price is 5
		 * once user enters money then we need to tell if we need more or less
		 * once user gives us exact 5 then-->enjoy your water!
		 */
		
		Scanner input=new Scanner(System.in);
		int money;
		int waterPrice=5;
		
		System.out.println("Please pay for your water!");
		money=input.nextInt();
		while(money!=waterPrice) {
			if(money>waterPrice) {
				System.out.println("This is to much, you need less money");
				money =input.nextInt();
			}else {
				System.out.println("Insert more money");
				money =input.nextInt();
			}
		}
		
         System.out.println("Enjoy your water");
	}

}

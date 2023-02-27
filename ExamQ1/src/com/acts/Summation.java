package com.acts;

import java.util.Scanner;

public class Summation {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("please add 1st no");
			int num=sc.nextInt();
			System.out.println("please add 2nd no");
			int num2 =sc.nextInt();
			int num3=0;
			 System.out.println("summation of two no is :-"+(num3=num+num2));
			
		}

	}

}

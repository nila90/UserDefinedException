package com.userdefinedException.test;

import java.util.Scanner;

public class Class_Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Voting");
		int age = sc.nextInt();
		
		try {
		if(age<18) {
			
			throw new Class_YoungerAgeException("You are not eligible for the voting");
			//String test = "";

		}
		else {
			
			System.out.println("You have been voted successfully");
		}
		}
		catch(Class_YoungerAgeException e) {
			
			e.printStackTrace();
			
		}
		finally{
			
			System.out.println("Check the finally block is exectued or not");
			
		}
		
		System.out.println("Check the execution is proper or not");
		
	}

}

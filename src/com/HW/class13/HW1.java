package com.HW.class13;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		/*Write a program that reads two people's first
			names and if they expecting boy or girl? 
		Based on the input suggests a name for a baby:
		
		Example Output:
		Mom’s first name? Mary
		Dad’s first name? Daniel
		Boy or Girl? boy
		
		Suggested baby name: DANRY
		Example Output:
		Mom’s first name? Mary
		Dad’s first name? Daniel
		Boy or Girl? girl
		Suggested baby name: MAIEL
		 */
		String MomsFName="Mary";
		String DadsFName="Daniel";
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter Mom's Name");
		
		MomsFName=scan.next();
		System.out.println("Please enter Dad's name");
		DadsFName=scan.next();
		System.out.println("Please enter baby's gender. Boy or Girl");
		String gender=scan.next();
		
		if (gender.equalsIgnoreCase("Boy")) {
			System.out.println("Suggested baby name is:"+DadsFName.toUpperCase().substring(0,3)+MomsFName.toUpperCase().substring(2));
		}else {
			System.out.println("Suggested baby name is:"+MomsFName.toUpperCase().substring(0,2)+DadsFName.toUpperCase().substring(3));
		}
		
	}

}

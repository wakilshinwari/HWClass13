package com.HW.class13;

public class HW2Class12 {

	public static void main(String[] args) {
		/*
		 * Create a String and if the String is not empty perform the following: 
			if the String has an odd number of characters and has 3 or more characters,
			print the character in the middle of the String.
		 */

		String name="Shinwari";
		
		if (!name.isEmpty()) {
			if (name.length()%2==0 && name.length()>=3) {
				System.out.println("middle charater of"+name+" is :"+name.charAt(4));
			}else {
				System.out.println("no odd numbers");
			}
		}
	}

}

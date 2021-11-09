package com.HW.class13;

public class HW3Class13 {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS).
		
		String day = "Sunday";
		String revers= "";
		
		for (int i=day.length()-1;i>0;i--) {
			revers=revers + day.substring(i,i +1);
			
		}
		System.out.print(revers);

	}
}

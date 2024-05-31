/* print first char from your name  */

package com.Codetech.Assignment_2;

import java.util.Scanner;

public class Second_Program {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter your name : ");
		
		String name=sc.nextLine();
		char c[]=name.toCharArray(); //converting sting into array char.
		System.out.print(c[0]); // if we want to print first letter from one word
		for (int i = 1; i < c.length; i++) { // if we want to print first letter each word
			
			if (c[i] ==' ') {
				System.out.print(c[i+1]);
			}
			
		}
		
	}

}

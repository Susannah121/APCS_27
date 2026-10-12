/*
 *	Author:  Susannah Lebsock
 *  Date: 10/7/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// Your code goes below here

		System.out.println("What is your name?");
		String name = sc.nextLine();

		System.out.println("How many times should your name be printed?");
		int numberName = sc.nextInt();
		
		

		while (numberName > 0){
			System.out.println("Your name is " + name);
			numberName = numberName - 1;
			
			
		}



		
	}
}

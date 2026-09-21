/*
 *	Author:  Susannah Lebsock
 *  Date: 9/17
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("A number between 0 - 9: ");
		int random = (int)(Math.random()*9)+1; 
		System.out.println(random);
		System.out.print("A number between 1 - 10: ");
		int random1 = (int)(Math.random()*10)+1;
		System.out.println(random1);
		System.out.print("A number between 2.5 and 3.5: ");
		double randomone = (double)(Math.random()*1+2.5);
		System.out.print(randomone);
		System.out.println();
		System.out.print("A double between 14 and 589: ");
		double randomtwo = (double)(Math.random()*575+14);
		System.out.print(randomtwo);
	}
}

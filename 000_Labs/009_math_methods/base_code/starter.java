/*
 *	Author:  Susannah Lebsock
 *  Date: 9/16
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Please enter a double"); 
		double numberfirst = sc.nextDouble();
		System.out.println("Please enter another double");
		double numbersecond = sc.nextDouble();
		System.out.println();
		System.out.println("Maximum of x and y is: " + Math.max(numberfirst, numbersecond));
		System.out.println("Square root of y is: " + Math.sqrt(numberfirst));
		System.out.println("Power of x and y is: " + Math.pow(numberfirst,numbersecond));
		int x = (int)Math.max (numberfirst,numbersecond);
	}
}

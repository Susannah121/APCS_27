/*
 *	Author:Susannah Lebsock
 *  Date:9/17
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.println("Please enter an integer: "); 
		int number = sc.nextInt ();
		System.out.println("Please enter another integer (bigger than the first): ");
		int numbersecond = sc.nextInt ();
		System.out.println("Your range is " + (numbersecond - number));
		System.out.println("Here are 5 numbers generated in that range." );
		int x =(int)(Math.random()*(numbersecond - number)+number);
		System.out.print(x);
		System.out.print(" ");
		x =(int)(Math.random()*(numbersecond - number)+number);
		System.out.print(x);
		System.out.print(" ");
		x =(int)(Math.random()*(numbersecond - number)+number);
		System.out.print(x);
		System.out.print(" ");
		x =(int)(Math.random()*(numbersecond - number)+number);
		System.out.print(x);
		System.out.print(" ");
		x =(int)(Math.random()*(numbersecond - number)+number);
		System.out.print(x);



		

	}
}

/*
 *	Author:  Susannah Lebsock
 *  Date: 9/9/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is you're name?"); 
		String text = sc.nextLine();
		System.out.println("How old are you?");
		int age = sc.nextInt();
		System.out.println("What month were you born? (1-12)");
		int month = sc.nextInt();
		System.out.println("What day were you born? (1-31)");
		int day = sc.nextInt();
		System.out.println("What year were you born?");
		int year = sc.nextInt();
		System.out.println("If I have a dollar and two quarters, how much money do I have? (0.0-#)");
		double money = sc.nextDouble();

		System.out.println("Your name is " + text + " and you were born on " + month + "/" + day + "/" + year + ".");
		System.out.println("You are " + age + " years old!!!");
		System.out.println("You have $" + money + " in your wallet.");
	}
}

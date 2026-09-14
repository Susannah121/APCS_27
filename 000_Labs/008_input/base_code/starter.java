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
		System.out.println("What is you're birthday month?");
		int month = sc.nextInt();
		System.out.println("What is you're birthday day?");
		int day = sc.nextInt();
		System.out.println("What is you're birthday year?");
		int year = sc.nextInt();
		System.out.println("How much is a buck fifty?");
		double money = sc.nextDouble();

		System.out.println(text);
		System.out.println(age);
		System.out.println(month);
		System.out.println(day);
		System.out.println(year);
		System.out.println(money);
	}
}

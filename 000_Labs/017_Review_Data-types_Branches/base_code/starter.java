/*
 *	Author:  Susannah Lebsock
 *  Date: 9/28/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("What is your name? ");
		String name = sc.nextLine();
		System.out.println("What would you like to go by? Ex: Slayer of Dragons");
		String identity = sc.nextLine();


		 System.out.print("Would you like to be a Wizard, Warrior, or Rogue? "); 
		String choice = sc.nextLine();
		boolean first = choice.equalsIgnoreCase("Wizard");
		boolean second = choice.equalsIgnoreCase("Warrior");
		boolean third = choice.equalsIgnoreCase("Rogue");
		if (first){
			System.out.println("You choose the Wizard! Excelsior!");
		}
		if (second){
			System.out.println("You choose the Wizard! For honor!");
		}
		if (third){
			System.out.println("You choose the Rogue! How cunning! ");
		}
		System.out.println();
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		System.out.println();
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		int firstRemainder = 20 - strength;
		System.out.println("You have " + firstRemainder + " left to spend.");

		System.out.print("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		int secondRemainder = firstRemainder - dexterity;
		System.out.println("You have " + secondRemainder + " left to spend.");

		System.out.print("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		int thirdRemainder = secondRemainder - intelligence;
		System.out.println("You have " + thirdRemainder + " to spend.");

		System.out.print("Charisma (1-10): ");
		int charisma = sc.nextInt();
		int fourthRemainder = thirdRemainder - charisma;
		System.out.println();

		System.out.println("----------------------------");
		System.out.println();
		System.out.println("You are " + name + " the " + identity + " of CVHS.");
		System.out.println("You're a " + choice + " with the following stats!");
		System.out.println("Strength - " + firstRemainder);
		System.out.println("Dexterity - " + secondRemainder);
		System.out.println("Intelligence - " + thirdRemainder);
		System.out.println("Charisma - " + fourthRemainder);
		System.out.println();
		System.out.println("Good luck on your quest " + name + "!");
		

	}
}

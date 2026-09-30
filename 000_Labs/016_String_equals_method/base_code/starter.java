/*
 *	Author:  Susannah Lebsock
 *  Date: 9/28
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
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
	}
}

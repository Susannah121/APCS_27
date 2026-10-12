/*
 *	Author: Susannah Lebsock
 *  Date: 10/8/26
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.

		int initial = 100;

		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100."); 
		System.out.println("2.Input a wager less than your total amount of money"); 
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money.");  
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println("	c. If none match, you lose your money.");
		System.out.println("---------------------------------------------------------");   
		System.out.println(""); 
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : "); 
		String choice = sc.nextLine();
		boolean yesYes = choice.equalsIgnoreCase("yes");
		boolean yY = choice.equalsIgnoreCase("y");
		while (yesYes || yY){
			System.out.print("You have $"  + initial + ". How much would you like to wager? ");
			int firstWager = sc.nextInt();
			sc.nextLine();
			System.out.println();
			System.out.println("Great! Let's play!!!");  

			System.out.println("Your rolls are: ");
			System.out.println("----------------------");
			int roll = (int)(Math.random()*9+1);
			int rollSecond = (int)(Math.random()*9+1);
			int rollThird = (int)(Math.random()*9+1);
			System.out.println("| " + roll + " | " + rollSecond + " | " + rollThird + " |");
			System.out.println("----------------------");
			
			if (roll == rollSecond || rollSecond == rollThird || rollThird == roll){
				System.out.println("You won! You're wager has now been doubled!");
				initial = firstWager + initial;
				System.out.println("You now have $" + initial);
				System.out.println("-------------------------------");
				System.out.println("Would you like to play the slots? (Yes/yes/Y/y) : ");
				choice = sc.nextLine();
				//sc.nextLine(); 
				yesYes = choice.equalsIgnoreCase("yes");
				yY = choice.equalsIgnoreCase("y");
			}
			
			else if (roll == rollSecond && rollSecond == rollThird){
				System.out.println("You won! You're wager has now been tripled!");
				initial = initial + (firstWager) * 3;
				System.out.println("You now have $" + initial);
				System.out.println("-------------------------------");
				System.out.println("Would you like to play the slots? (Yes/yes/Y/y) : ");

				choice = sc.nextLine();
				//sc.nextLine(); 
				yesYes = choice.equalsIgnoreCase("yes");
				yY = choice.equalsIgnoreCase("y");
			}

			else if (roll != rollSecond || rollSecond != rollThird || rollThird != roll){
				System.out.println("You didn't win this time, better luck next time!");
				initial = initial - firstWager;
				System.out.println("You now have $" + initial);
				System.out.println("-------------------------------");
				System.out.println("Would you like to play the slots? (Yes/yes/Y/y) : ");

				choice = sc.nextLine();
				//sc.nextLine(); 
				yesYes = choice.equalsIgnoreCase("yes");
				yY = choice.equalsIgnoreCase("y");

			}	

		}
		

		
		System.out.println("Sad to you go! You left with " + initial + ". Come again soon! Thanks!");
		
		
	}

}



			


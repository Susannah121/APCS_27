/*
 *	Author:  Susannah Lebsock
 *  Date: 10/8/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// Your code goes below here

		int myInt = 214;
		System.out.println("Welcome to the guessing game, guess my number (0-1000)");
		int firstGuess = sc.nextInt();

		while (myInt != firstGuess){
			if (myInt < firstGuess){
				System.out.println("Guess lower!");
				firstGuess = sc.nextInt();
			
			}
			
			if (myInt > firstGuess){
				System.out.println("Guess higher!");
			firstGuess = sc.nextInt();
			}
			
			
			}
			

			
			
			 
	
				System.out.println("You guessed correctly!");
			
			

		


}
		
	
}


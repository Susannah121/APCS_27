/*
 *	Author:Susannah Lebsock
 *  Date:9/26/26
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("The goal of the game is to guess a word with two hints!");
		System.out.println();
		String word0 = "fruit";
		String word1 = "animal";
		int randomQuestion = (int)(Math.random()*3);
		String myFruit = "mango";
		String myAnimal = "shark";
		String myVegetable = "cucumber";
		//boolean isCorrect = true;
		//boolean isWrong = false;

		System.out.println("the random number = " + randomQuestion);
		if(0==randomQuestion){
			System.out.println("It's a fruit!");
			System.out.print("What is your guess? ");
			String guess = sc.nextLine();
			System.out.println();
			boolean isCorrect = (guess.equalsIgnoreCase(myFruit));
			if(isCorrect){
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("It is an orange fruit!");
				String secondGuess = sc.nextLine();
				boolean isCorrectSecond = (secondGuess.equalsIgnoreCase(myFruit));
				if(isCorrectSecond){
					System.out.println("You got it! Woo!");
				}
				else{
					System.out.println("The answer was " + myFruit + " better luck next time!");
				}
			}
		}

	
	if(1==randomQuestion){
			System.out.println("It's a animal!");
			System.out.print("What is your guess? ");
			String guessThird = sc.nextLine();
			System.out.println();
			boolean isCorrectThird = (guessThird.equalsIgnoreCase(myAnimal));
			if(isCorrectThird){
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("It is a sea animal");
				String fourthGuess = sc.nextLine();
				boolean isCorrectFourth = (fourthGuess.equalsIgnoreCase(myAnimal));
				if(isCorrectFourth){
					System.out.println("You got it! Woo!");
				}
				else{
					System.out.println("The answer was " + myAnimal + " better luck next time!");
				}
			}
		}


		if(2==randomQuestion){
			System.out.println("It's a vegetable!");
			System.out.print("What is your guess? ");
			String guessVegetable = sc.nextLine();
			System.out.println();
			boolean isCorrectVegetable = (guessVegetable.equalsIgnoreCase(myVegetable));
			if(isCorrectVegetable){
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("It is very refreshing!");
				String nextGuess = sc.nextLine();
				boolean finalGuess = (nextGuess.equalsIgnoreCase(myVegetable));
				if(finalGuess){
					System.out.println("You got it! Woo!");
				}
				else{
					System.out.println("The answer was " + myVegetable + " better luck next time!");
				}
			}
		}


		

		
	}
}

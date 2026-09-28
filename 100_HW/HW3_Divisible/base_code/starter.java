/*
 *	Author:Susannah Lebsock
 *  Date: 9/16
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.

		System.out.print("Please enter an integer: ");
		int intFirst = sc.nextInt();

		System.out.print("Please enter another integer: ");
		int intSecond = sc.nextInt();
		System.out.println();

		boolean test = (intFirst % 2 == 0);
		if (test){
			System.out.println(intFirst + " is divisible by 2! Your integer is even!");
		}
		else{
			System.out.println(intFirst + " is not divisible by 2! Your integer is odd!");
		}
		boolean firstThree = (intFirst % 3 ==0);
		boolean firstFour = (intFirst % 4 == 0);
		boolean firstFive = (intFirst % 5 == 0);

	if ((firstThree == false)&&(firstFour == false)&&(firstFive == false)){
		System.out.println(intFirst + " is not divisible by 3,4, and 5");
	}
	if (firstThree){
		System.out.println(intFirst + " is divisible by 3!");
	}
	if (firstFour){
		System.out.println(intFirst + " is divisible by 4!");
	}
	if (firstFive){
		System.out.println(intFirst + " is divisible by 5!");
	}


		System.out.println();

		boolean secondTwo = (intSecond % 2 == 0);
		if (secondTwo){
			System.out.println(intSecond + " is divisible by 2, your integer is even!");
		}
		else{
			System.out.println(intSecond + " is not divisible by 2, your integer is odd.");
		}
		
		boolean secondThree = (intSecond % 3 == 0);
		boolean secondFour = (intSecond % 4 == 0);
		boolean secondFive = (intSecond % 5 == 0);

	if ((secondThree == false)&&(secondFour == false)&&(secondFive == false)){
		System.out.println(intSecond + " is not divisible by 3,4, and 5");
	}
	boolean testSecondThree = secondThree;
	if (testSecondThree){
		System.out.println(intSecond + " is divisible by 3!");
	}
	if (secondFour){
		System.out.println(intSecond + " is divisible by 4!");
	}
	if (secondFive){
		System.out.println(intSecond + " is divisible by 5!");
	}
		



	}
}

/*
 *	Author:Susannah Lebsock
 *  Date:9/30/26
 * 	Collaborator:
 */

import java.util.*;

public class starter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to The best resturant! My name is Susannah, and I will be your waiters tonight!");
        System.out.println("What appetizer would you like to start with tonight?");
        System.out.println("Our starters are: ");
        System.out.println("Chicken fingers - nachos - french fries");
        System.out.println();
        String starterChoice = sc.nextLine();
        boolean chickenFingers = starterChoice.equalsIgnoreCase("chicken Fingers");
        double starterPrice = 0.0;


        
        if (chickenFingers){
            System.out.println("Your choose chicken fingers! That will be $8!");
             starterPrice = 8.0;
        }
        
        boolean nachos = starterChoice.equalsIgnoreCase("nachos");
        if (nachos){
            System.out.println("Your choose nachos! That will be $9!");
         starterPrice = 9.0;
        }
        boolean frenchFries = starterChoice.equalsIgnoreCase("French Fries");
        if (frenchFries){
            System.out.println("Your choose French fries! That will be $5!");
            starterPrice = 5.0;
        }
        

        System.out.println();
        System.out.println("What would you like to eat as your main?");
        System.out.println("Here are our main courses:");
        System.out.println("Pizza - Pasta - Salad");
        System.out.println("What would you like for your main course?");
        String mainCourseChoice = sc.nextLine();
        double mainPrice = 0.0;

        boolean pizza = mainCourseChoice.equalsIgnoreCase("pizza");
        if (pizza){
            System.out.println("You choose pizza! That will be $15");
             mainPrice = 15.0;
        }
        boolean pasta = mainCourseChoice.equalsIgnoreCase("pasta");
        if (pasta){
            System.out.println("You choos pasta! That will be $20");
             mainPrice = 20.0;
        }
        boolean salad = mainCourseChoice.equalsIgnoreCase("salad");
        if (salad){
            System.out.println("You choose salad! That will be $12");
             mainPrice = 12.0;
        }

        System.out.println();
        System.out.println("What would you like for desssert?");
        System.out.println("Here are our desserts:");
        System.out.println("Tiramisu - Pizookie - Gelato");
        System.out.println("We also have creme brulee as our specialty dessert tonight.");
        String dessertChoice = sc.nextLine();
        double dessertPrice = 0.0;
        
        boolean tiramisuDessert = dessertChoice.equalsIgnoreCase("Tiramisu");
        if (tiramisuDessert){
            System.out.println("Great choice, that will be $9, Your tiramisu is coming right up!");
             dessertPrice = 9.0;
        }
        boolean pizookieDessert = dessertChoice.equalsIgnoreCase("pizookie");
        if (pizookieDessert){
            System.out.println("Great choice, that will be $5, Your pizookie is comimg right up!");
            dessertPrice = 5.0;
        }
        boolean gelatoDessert = dessertChoice.equalsIgnoreCase("gelato");
        if (gelatoDessert){
            System.out.println("Great choice, that will be $6, Your gelato is coming right up!");
            dessertPrice = 6.0;
        }
        boolean cremebruleeDessert = dessertChoice.equalsIgnoreCase("Creme Brulee");
        if (cremebruleeDessert){
            System.out.println("Amazing choice, this is my faborite, it will be $10, Your creme brulee is coming right up!");
            dessertPrice = 10.0;
        }
        System.out.println("- - - - - - - - - - - - - - - -");
        System.out.println("What percentage would you like to tip?");
        double tipAmount = sc.nextDouble();
        sc.nextLine();
        System.out.println("Are you paying cash or card today?");
        double finalAnswer = (starterPrice + mainPrice + dessertPrice) * (tipAmount / 100);
        double nowFinal = starterPrice + mainPrice + dessertPrice +finalAnswer;
        System.out.println("Alright your total will come out to " + nowFinal);
        String payMethod = sc.nextLine();
        System.out.println("Thank you for visiting Susannah's restaunt, come again soon, it was a pleasure to be your waiter tonight!");
        System.out.println("Please leave a review on yelp!");




}
}

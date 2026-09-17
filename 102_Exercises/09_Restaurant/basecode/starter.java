/*
 *	Author:  Susannah Lebsock
 *  Date: 9-14
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// Your code goes below here
System.out.println("=============================");
System.out.println("WELCOME RESTURANT OWNER!");
System.out.println("=============================");
System.out.println("What is the name of your resturant");
String resturant  = sc.nextLine();
System.out.println("What is your name?");
String name = sc.nextLine();
System.out.println("Great to see you, " + name + "! Let's set up a menu for " + resturant + "!");
System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");
System.out.println("- - - Item #1 - - -");
System.out.println("Item name: ");
String first = sc.nextLine();
System.out.println("Price of " + first + " ($): ");
double price = sc.nextDouble();
System.out.println("How many  " + first + "  would you like?");
int number = sc.nextInt();
sc.nextLine();
System.out.println("Added " + number + "x " + first + " to your order! " + "$" + (price * number));
System.out.println("- - - Item #2 - - -");
System.out.println("Item name: ");
String second = sc.nextLine();
System.out.println("Price of " + second + " ($): ");
double secondprice = sc.nextDouble();
System.out.println("How many " + second + " would you like?");
double amountsecond = sc.nextDouble();
sc.nextLine();
System.out.println("Added " + amountsecond +"x " + second + " to your order! " + "$" + amountsecond * secondprice);
System.out.println("- - - Item #3 - - -");
System.out.println("Item name: ");
String third = sc.nextLine();
System.out.println("Price of " + third + "($): ");
double thirdPrice = sc.nextDouble();
System.out.println("How many " + third + " would you like?");
int amount = sc.nextInt();
sc.nextLine();
System.out.println("Added " + amount + "x " + third + " to your order! " + "$" + thirdPrice * amount);
System.out.println("Nice choices! What tip percentage would you like to leave? (ex: 15, 18, 20):");
int tip = sc.nextInt ();
System.out.println();
System.out.println("========================");
System.out.println(name + "- Menu For Today");
System.out.println("========================");
System.out.println("Owner:" + name);
System.out.println("- - - - - - - - - - - - - - ");
System.out.println("Item       Qty      price");
System.out.println(first + "    " +  number  + "  " + price );
System.out.println(second + "    " + amountsecond + "   " + secondprice);
System.out.println(third  + "    " + amount  + "  " + thirdPrice);
System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
double subtotal = number * price + amountsecond * secondprice + amount * thirdPrice;
System.out.println("Subtotal: " +          subtotal);
System.out.println("Tax " + "(" + tip + ")");
System.out.println("Tip Amount: " + subtotal * tip/100);
System.out.println("========================================");
double total = subtotal + subtotal * tip/100;
System.out.println("TOTAL: " +     "$" + total);
System.out.println("==========================================");
System.out.println();
System.out.println("Thanks for eating at " + resturant + "!");
System.out.print("Come back soon - - we'll always have a byte for you!");

	}
}

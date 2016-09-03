package nyc.c4q.josegonzalez;
import java.util.Scanner;
import java.lang.Math;

/**Your friends just came up with a great new start-up idea: it's like Uber for ice cream! They've asked you to write a
 * prototype Java program that will accept ice cream orders for delivery. The program should use a Scanner object to
 * read user input and should:
 *
 * Greet the user and ask them for a name.
 * Ask the user what flavor of ice cream they would like.
 * One-by-one, offer three toppings of your choice which the user will select by inputting 'yes'.
 * Calculate the total price of the order: the base ice cream costs $2.33 and each topping is an additional $0.33 cents.
 * Calculate a delivery wait time estimate, which should be a random number of minutes between 1 and 60.
 * Print an order confirmation to the console that contains the following details: the user's name, ice cream flavor, number of toppings, total price, and delivery wait time.
 * Created by mathcore on 9/1/16.
 */
public class ProblemThirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Okay " + name + " which flavor of ice cream would you like?");
        String flavor = scanner.next();
        System.out.println("Would you like sprinkles? (yes or no)");
        String toppingOne = scanner.next();
        System.out.println("Would you like strawberries? (yes or no)");
        String toppingTwo = scanner.next();
        System.out.println("Would you like gummy bears? (yes or no)");
        String toppingThree = scanner.next();
        int toppingCount = 0;
        if (toppingOne.equals("yes") || toppingOne.equals("YES")){
            toppingCount = toppingCount + 1;
        }
        if (toppingTwo.equals("yes") || toppingTwo.equals("YES")){
            toppingCount = toppingCount + 1;
        }
        if (toppingThree.equals("yes") || toppingThree.equals("YES")){
            toppingCount = toppingCount + 1;
        }
        double totalCost;
        if (toppingCount == 1) {
            totalCost = 2.66;
        }else if (toppingCount == 2){
            totalCost = 2.99;
        }else if (toppingCount == 3){
            totalCost = 3.32;
        }else {
            totalCost = 2.33;
        }
        double time = Math.random() * 60;
        int timeRounded = (int)Math.ceil(time);

        System.out.println("Okay, A " + flavor + " ice cream with " + toppingCount + " toppings. Your total is $" + totalCost + " and your ice cream will arrive in " + timeRounded + " minutes");

    }
}


package nyc.c4q.josegonzalez;
import java.util.Scanner;

/** Hippos only like to eat foods that begin with the letter 'h'. In an effort to reduce food waste, the local zoo has
 *  hired you to write a Java program that can predict whether or not the hippos will eat a given food.
 * While running, your program should prompt the user to enter a food. If the food is one that hippos like to eat, the
 * program should print "Yum!" -- otherwise, it should print "Yuck!".
 * Created by mathcore on 8/29/16.
 */
public class ProblemSix {

    public static void main(String[] args) {
        promptUser("Enter a food:");
        String food = readString();
        String foodLowerCase = food.toLowerCase();
        int lengthOfString = food.length();
        String beginningOfWord = foodLowerCase.substring(0,1);

        if (beginningOfWord.equals("h")){
            System.out.println("Yum!");
        }else{
            System.out.println("Yuck!");
        }

    }
    public static void promptUser(String prompt){
        System.out.println(prompt);
    }
    public static String readString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();

    }

}

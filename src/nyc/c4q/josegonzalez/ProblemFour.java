package nyc.c4q.josegonzalez;

/**Write a Java method that takes a string as a parameter and returns true if it ends in "ly".
 * Created by mathcore on 8/28/16.
 */
public class ProblemFour {

    public static void main(String[] args) {
        System.out.println(endsInLY("reallys"));

    }
    public static boolean endsInLY(String input){
       return input.endsWith("ly");

    }
}

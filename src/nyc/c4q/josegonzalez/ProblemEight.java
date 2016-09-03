package nyc.c4q.josegonzalez;

/**Write a loop that will print the following triangle to the console:
 * #
 * ##
 * ###
 * ####
 * #####
 * ######
 * #######
 * Created by mathcore on 9/1/16.
 */
public class ProblemEight {
    public static void main(String[] args) {
        String original = "#";
        StringBuilder result = new StringBuilder("#");
        int counter = 0;
        while (counter < 7 ){
            System.out.println(result);
            result.insert(counter + 1, original.charAt(0));
            counter = counter + 1;
        }
    }
}

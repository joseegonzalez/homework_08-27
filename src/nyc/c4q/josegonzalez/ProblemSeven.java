package nyc.c4q.josegonzalez;

/** Write a method that takes a string parameter. For longer strings, the method returns a new string constructed out of
 *  the first three letters of the argument, followed by three periods ("..."), followed by the last letter of the
 *  argument. However, if the resulting string is not shorter than the argument, the method should return the argument
 *  instead.
 * Created by mathcore on 9/1/16.
 */
public class ProblemSeven {
    public static void main(String[] args) {
        elide("Hello!");
        elide("Hello, world!");
        elide("That's not my name.");

    }
    public static void elide(String newString) {
        int length = newString.length();
        if (length < 7) {
            System.out.println(newString);
        } else {
            System.out.println(newString.substring(0, 2) + "..." + newString.substring(length - 1, length));
        }
    }

}

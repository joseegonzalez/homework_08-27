package nyc.c4q.josegonzalez;

/**Write a function to return a part of string after a specified character. The function should take two arguments,
 * the first being the string, and the second being the character. The function should return only the part of the
 * string that comes AFTER the specified character. In other words, the function should chop the string into two parts
 * and return only the part that comes after the specified character.
 * Created by mathcore on 9/1/16.
 */
public class ProblemEleven {
    public static void main(String[] args) {
        cutStringAtSpecificPoint("I hate homework", 'h');
    }

    public static void cutStringAtSpecificPoint(String newString, char cutPoint){
        int length = newString.length();
        int newStart = 0;
        for(int i = 0; i < length; i++){
            if (newString.charAt(i) == cutPoint){
                newStart = i;
                i = length;
            }
        }
        System.out.println(newString.substring(newStart + 1, length));
    }
}

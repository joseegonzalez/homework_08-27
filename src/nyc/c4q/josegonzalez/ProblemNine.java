package nyc.c4q.josegonzalez;

/**Write a Java method that takes a string parameter and returns the number of times that the string "code" appears
 * anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
 *
 * Created by mathcore on 9/1/16.
 */

public class ProblemNine {
    public static void main(String[] args) {
        codeReturn("cofecorecone");
    }

    public static void codeReturn(String newString){
        int length = newString.length();
        int codeCount = 0;
        for (int i =0; i < length; i++){
            if (newString.charAt(i) == 'c'){
                if (newString.charAt(i+1) == 'o'){
                    if(newString.charAt(i+3) == 'e'){
                        codeCount = codeCount + 1;
                    }
                }
            }
        }

        System.out.println(codeCount);
    }
}

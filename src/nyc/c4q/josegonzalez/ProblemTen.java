package nyc.c4q.josegonzalez;

/**Write a function that accepts a string as a parameter and counts the number of vowels within the string
 * (vowels include a, e, i, o , u - don't count 'y'). The function should return the number of vowels in the string.
 *
 * Created by mathcore on 9/1/16.
 */

public class ProblemTen {
    public static void main(String[] args) {
        String comment = "I am trying to find all the vowels";
        System.out.println(howManyVowels(comment));
    }
    public static int howManyVowels(String newString){
        String newLowerCase = newString.toLowerCase();
        int len = newString.length();
        int vowelCount = 0;
        for (int i = 0; i < len; i++){
            if (newLowerCase.charAt(i) == 'a'){
                vowelCount = vowelCount + 1;
            }else if (newLowerCase.charAt(i) == 'e'){
                vowelCount = vowelCount + 1;
            }else if (newLowerCase.charAt(i) == 'i'){
                vowelCount = vowelCount + 1;
            }else if (newLowerCase.charAt(i) == 'o'){
                vowelCount = vowelCount + 1;
            }else if (newLowerCase.charAt(i) == 'u'){
                vowelCount = vowelCount + 1;
            }
        }
        return vowelCount;
    }

}

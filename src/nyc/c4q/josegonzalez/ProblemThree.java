package nyc.c4q.josegonzalez;

/** Check to see if a string has the same count of 'x's and 'o's. The method must return a boolean and be case
 * insensitive. The string may contain any Unicode character -- not just 'x's and 'o's -- and may be of any length.
 * Created by mathcore on 8/28/16.
 */
public class ProblemThree {

    public static void main(String[] args) {
        System.out.println(sameXO("ooxx"));
        System.out.println(sameXO("xooxx"));
        System.out.println(sameXO("ooxXm"));
        System.out.println(sameXO("zpzpzpp"));
        System.out.println(sameXO("zzoo"));
    }
    public static boolean sameXO (String xo) {
        boolean isSameCount = false;
        int totalX = 0;
        int totalO = 0;
        for(int i = 0; i < xo.length(); i++){
            if (Character.toLowerCase(xo.charAt(i)) == 'x'){
                totalX++;
            }
            if (Character.toLowerCase(xo.charAt(i)) == 'o'){
                totalO++;
            }

        }
        if (totalX == totalO){
            isSameCount = true;
        }

        return isSameCount;
    }

    }

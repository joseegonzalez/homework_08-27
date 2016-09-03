package nyc.c4q.josegonzalez;

/**Print "The Twelve Days of Christmas", an English carol with a lot of repetition!
 * Use variables to store bits of repeated data and print the full lyrics.
 * Created by mathcore on 9/1/16.
 */
public class ProblemTwelve {
    public static void main(String[] args) {
        String firstDay = "partridge in a pear tree";
        String secondDay = " Two Turtle Doves";
        String thirdDay = " Three French Hens";
        String fourthDay = " Four Calling Birds";
        String fifthDay = " Five Golden Rings";
        String sixthDay = " Six Geese-a-laying";
        String seventhDay = " Seven Swans a Swimming";
        String eighthDay = " Eight Maids a Milkng";
        String ninthDay = " Nine Ladies Dancing";
        String tenthDay = " Ten Lords-a-Leaping";
        String eleventhDay = " Elevn Pipers Piping";
        String twelfthDay = " Twelve Drummers Drumming";
        for (int i = 1; i <= 12; i++){
            if (i == 1){
                System.out.println("On the first day of Christmas my true love gave to me a " + firstDay +"\n");
            }else if (i == 2){
                System.out.println("On the second day of Christmas my true love gave to me " + secondDay + " and a "+ firstDay +"\n");

            }else if (i == 3){
                System.out.println("On the third day of Christmas my true love gave to me " +thirdDay + secondDay + " and a "+ firstDay +"\n" );

            }else if (i == 4){
                System.out.println("On the fourth day of Christmas my true love gave to me " +fourthDay + thirdDay + secondDay + " and a "+ firstDay +"\n");

            }else if (i == 5){
                System.out.println("On the fifth day of Christmas my true love gave to me " + fifthDay + fourthDay + thirdDay + secondDay + " and a "+ firstDay +"\n");

            }else if (i == 6){
                System.out.println("On the sixth day of Christmas my true love gave to me " + sixthDay + fifthDay + fourthDay + thirdDay + secondDay + " and a "+ firstDay +"\n");

            }else if (i == 7){
                System.out.println("On the seventh day of Christmas my true love gave to me " + seventhDay + sixthDay + fifthDay + fourthDay + thirdDay + secondDay + " and a "+ firstDay +"\n");

            }else if (i == 8){
                System.out.println("On the eighth day of Christmas my true love gave to me " + eighthDay + seventhDay + sixthDay + fifthDay + fourthDay + thirdDay + secondDay + " and a "+ firstDay + "\n");

            }else if (i == 9){
                System.out.println("On the ninth day of Christmas my true love gave to me " + ninthDay + eighthDay + seventhDay + sixthDay + fifthDay + fourthDay + thirdDay + secondDay + " and a "+ firstDay + "\n");

            }else if (i == 10){
                System.out.println("On the tenth day of Christmas my true love gave to me " + tenthDay + ninthDay + eighthDay + seventhDay + sixthDay + fifthDay + fourthDay + thirdDay + secondDay + " and a "+ firstDay +"\n");

            }else if (i == 11){
                System.out.println("On the eleventh day of Christmas my true love gave to me " + eleventhDay + tenthDay + ninthDay + eighthDay + seventhDay + sixthDay + fifthDay + fourthDay + thirdDay + secondDay + " and a "+ firstDay +"\n");

            }else if (i == 12){
                System.out.println("On the twelfth day of Christmas my true love gave to me " + twelfthDay + eleventhDay + tenthDay + ninthDay + eighthDay + seventhDay + sixthDay + fifthDay + fourthDay + thirdDay + secondDay + " and a "+ firstDay +"\n");

            }


        }
    }

}

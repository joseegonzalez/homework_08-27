package nyc.c4q.josegonzalez;

/**
 * Created by mathcore on 8/28/16.
 */
public class ProblemTwo {
    public static void main(String[] args) {
        System.out.println(calculateAge(1987,2016));

    }
    public static String calculateAge(int birthYear, int currentYear){
        int age = currentYear - birthYear;
        int ageTwo = age - 1;
        String ageDecleration = "You are either " + ageTwo + " or " + age + ".";
        return ageDecleration;
    }

    }

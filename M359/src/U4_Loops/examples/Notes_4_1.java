package U4_Loops.examples;

import java.util.Scanner;

public class Notes_4_1 {
    public static void main(String[] args) {
        // create a scanner object to get user data
        Scanner input = new Scanner(System.in);

        // goal is to find the average of an unknown number of scores
        int sum = 0, count = 0, score;
        double avg;
        String reply = "y";

        // while loop dependant on user data
        while (reply.equalsIgnoreCase("y")) {
            System.out.println("Enter an int score: ");
            score = input.nextInt();
            input.nextLine();   // "dummy read" to clear the input stream
                                // this removes the end of line char so we can
                                // read in the String data next
            sum += score;
            count++;
            System.out.println("Do you want to continue? (Y or N)");
            reply = input.nextLine();
        }
        avg = (double)sum/count;
        System.out.println("The average is: " + avg);
    }
}

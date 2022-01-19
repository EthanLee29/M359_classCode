package U7_ArrayLists.lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("\t\t\t\t\t**** Welcome to the Ticket Master Kiosk ****");
        System.out.println("You may search our shows by city as well as sort the shows by " +
                "performer and ticket price");
        System.out.println("\t\t\tSimply select the correct option corresponding with your choice");
        System.out.println();
        System.out.println("1. Search by City");
        System.out.println("2. Sort by Performer (A-Z)");
        System.out.println("3. Sort by Performer (Z-A)");
        System.out.println("4. Sort by Price (low - high");
        System.out.println("5. Sort by Price (high - low)");
        System.out.println("6. Quit");

        Scanner i = new Scanner(System.in);
        System.out.println("Enter a value (1-6)");
        getUserChoice(i);
    }
    public static int getUserChoice(Scanner input) {
        /*
        ask the user for their choice
        use try block to read their choice
            if the choice is an int, then make sure its in the right range
            if its not an int, and goes to catch, then give user a message

         after you have a good choice, in desired range, return this value
         */
        try {
            System.out.println(input);
            if(input.nextInt() > 6 || input.nextInt() < 1)
                System.out.println("Enter a value within the range 1-6");
        }
        catch (InputMismatchException e) {
            System.out.println("Enter an integer 1-6");
        }

        return input.nextInt();
    }
}

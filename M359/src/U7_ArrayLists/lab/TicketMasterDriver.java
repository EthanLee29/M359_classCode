package U7_ArrayLists.lab;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static final int CITY = 1;
    public static final int PERF_A_Z = 2;
    public static final int PERF_Z_A = 3;
    public static final int PRICE_L_H = 4;
    public static final int PRICE_H_L = 5;
    public static final int QUIT = 6;

    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster tMaster = new TicketMaster();
        tMaster.readData();
        System.out.println("\t\t\t\t\t**** Welcome to the Ticket Master Kiosk ****");
        tMaster.display();

        Scanner in = new Scanner(System.in);
        choices(in, tMaster);

        in.close();
    }

    /**
     * This method gets the user's choice and returns it if the input is valid
     * @param input user input
     * @return int
     */
    public static int getUserChoice(Scanner input) {
        /*
        ask the user for their choice
        use try block to read their choice
            if the choice is an int, then make sure its in the right range
            if its not an int, and goes to catch, then give user a message

         after you have a good choice, in desired range, return this value
         */
        //when quit say input.close
        int choice = -1;
        boolean tryAgain = true;

        System.out.println("Enter a value (1-6)");
        while(tryAgain) {
            try {
                choice = input.nextInt();
                if(choice > 6 || choice < 1) {
                    System.out.println("Enter a value within the range 1-6");
                }else {
                    tryAgain = false;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter an integer 1-6");
                input.nextLine();
            }
            catch (Exception e) {
                System.out.println("Enter an integer 1-6");
                input.nextLine();
            }
        }
        return choice;
    }

    /**
     * This method uses getUserChoice and executes the corresponding method
     * @param s Scanner input
     * @param tM TicketMaster object
     */
    public static void choices(Scanner s, TicketMaster tM) {
        int choice = getUserChoice(s);
        while (choice != QUIT) {
            s.nextLine();

            if (choice == CITY) {
                System.out.println("Input city of choice");
                tM.byCity(s.nextLine());
            } else if (choice == PERF_A_Z) {
                tM.aToZ(tM.getShowList());
                System.out.println(tM);
            } else if (choice == PERF_Z_A) {
                tM.zToA(tM.getShowList());
                System.out.println(tM);
            }else if (choice == PRICE_L_H) {
                tM.byPriceLow(tM.getShowList());
                System.out.println(tM);
            } else if (choice == PRICE_H_L) {
                tM.byPriceHigh(tM.getShowList());
                System.out.println(tM);
            }

            System.out.println();
            tM.display();
            choice = getUserChoice(s);
        }
        System.out.println("Thank you! Come again soon!");
    }
}

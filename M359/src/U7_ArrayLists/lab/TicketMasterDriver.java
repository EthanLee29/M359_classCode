package U7_ArrayLists.lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketMasterDriver {
    public final int CITY = 1;
    public final int PERF_A_Z = 2;
    public final int PERF_Z_A = 3;
    public final int PRICE_L_H = 4;
    public final int PRICE_H_L = 5;
    public final int QUIT = 6;

    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster tMaster = new TicketMaster();
        tMaster.readData();
        //System.out.println(tMaster);
        tMaster.display();

//        Scanner i = new Scanner(System.in);
//        getUserChoice(i);

//        tMaster.byCity("Chicago");
//        tMaster.byCity("Chucagah");
//        tMaster.aToZ(tMaster.getShowList());
//        tMaster.zToA(tMaster.getShowList());
//        tMaster.byPriceLow(tMaster.getShowList());
//        tMaster.byPriceHigh(tMaster.getShowList());

        System.out.println(tMaster);
    }
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
        while(tryAgain) {
            try {
                System.out.println("Enter a value (1-6)");
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
}

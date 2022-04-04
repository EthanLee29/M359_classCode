package Unit9.Lab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkoutDriver {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("*** Welcome to your customized workout plan! ***");
        System.out.println("************************************************\n");
        Scanner input = new Scanner(System.in);
        int num = getUserChoice(input);
        WorkoutPlan wP = new WorkoutPlan(num);
        System.out.println("Great, let's take a look at your " + num + " week schedule!");
        System.out.println();
        System.out.println(wP);

        wP.workoutNextWeek();
        System.out.println();
        input.close();
    }

    /**
     * Gets user input for how many weeks they would
     * like to work out for
     * @param input scanner
     * @return int
     */
    public static int getUserChoice(Scanner input) {
        String in;
        int choice = -1;
        boolean tryAgain = true;

        System.out.println("How many weeks would you like to schedule?");
        while(tryAgain) {
            try {
                in = input.nextLine();
                choice = Integer.parseInt(in);
                if(choice < 0) {
                    System.out.println("You can do more!");
                    System.out.println("How many weeks would you like to schedule?");
                }else {
                    tryAgain = false;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Please try again, enter a valid integer:");
                System.out.println("How many weeks would you like to schedule?");
                input.nextLine();
            }
            catch (Exception e){
                System.out.println("Please try again, enter a valid integer:");
                System.out.println("How many weeks would you like to schedule?");
                input.nextLine();
            }
        }
        return choice;
    }
}

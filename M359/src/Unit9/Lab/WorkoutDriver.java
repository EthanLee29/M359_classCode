package Unit9.Lab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkoutDriver {
    public static void main(String[] args) {
        System.out.println("*** Welcome to your customized workout plan! ***");
        Scanner input = new Scanner(System.in);
        int num = getUserChoice(input);
        WorkoutPlan wP = new WorkoutPlan(num);
        System.out.println("Great, let's take a look at your " + wP.getWorkouts() + "week schedule!");
        System.out.println(wP);

    }

    public static int getUserChoice(Scanner input) {
        int choice = -1;
        boolean tryAgain = true;

        System.out.println("How many weeks would you like to schedule?");
        while(tryAgain) {
            try {
                choice = input.nextInt();
                if(choice < 1) {
                    System.out.println("How many weeks would you like to schedule?");
                }else {
                    tryAgain = false;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("How many weeks would you like to schedule?");
                input.nextLine();
            }
            catch (Exception e) {
                System.out.println("How many weeks would you like to schedule?");
                input.nextLine();
            }
        }
        return choice;
    }
}

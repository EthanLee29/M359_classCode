package Unit9.Lab;

import java.util.Scanner;

public class WorkoutPlan {
    private int numComplete, numSkipped, currWeek, nextWO, totalBurned, totalMin;
    private Workout[][] workouts;
    private final int CARDIO = 0;
    private final int STRENGTH = 1;
    private final int WELLNESS = 2;

    public WorkoutPlan(int numWeeks) {
        numComplete = 0;
        numSkipped = 0;
        currWeek = 0;
        nextWO = 1;
        totalBurned = 0;
        totalMin = 0;

        workouts = new Workout[numWeeks][7];
        fill();
    }

    /**
     * Fills workout arrayList with Cardio, Strength, and Wellness
     * workout objects. Each object has an equal chance of getting picked
     */
    public void fill() {
        for (int i = 0; i < workouts.length; i++) {
            for (int j = 0; j < workouts[i].length; j++) {
                int rand = (int)(Math.random() * 3);

                if(rand == CARDIO) {
                    int time = (int)(Math.random() * 30) + 10;
                    int speed = (int)(Math.random() * 6) + 1;
                    workouts[i][j] = new Cardio("Running", i * 7 + (j + 1), time, speed);

                }else if(rand == STRENGTH) {
                    int time = (int)(Math.random() * 45) + 15;
                    int weight = (int)(Math.random() * 130) + 95;
                    workouts[i][j] = new Strength("Lifting", i * 7 + (j + 1), time, weight);

                }else if(rand == WELLNESS) {
                    int time = (int)(Math.random() * 30) + 30;
                    int numStretches = (int)(Math.random() * 4) + 8;
                    workouts[i][j] = new Wellness("Stretching", i * 7 + (j + 1), time, numStretches);
                }
            }
        }
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < workouts.length; i++) {
            str += "*** WEEK #" + (i + 1) + " ***\n";
            str += "WORKOUT NUM\t\tNAME\t\tMINUTES\n";
            for (int j = 0; j < workouts[i].length; j++) {
                str += workouts[i][j].toString() + "\n";
            }
            str += "\n";
        }

        return str;
    }

    /**
     * completes the next week of workouts
     * shows which workouts the user skipped
     * and the stats
     */
    public void workoutNextWeek() {
        Scanner s = new Scanner(System.in);

        System.out.println("Time to start working out!");
        System.out.println("You got this!");

        while(currWeek != workouts.length) {
            System.out.println("Type \"Start\" to complete one week of workouts");

            String input = s.nextLine();

            while(!input.equalsIgnoreCase("start")) {
                if(input.equalsIgnoreCase("start")) {
                    break;
                }else{
                    System.out.println("Not ready? Don't worry, you've got this!");
                    System.out.println("Type \"Start\" to complete one week of workouts");
                    input = s.nextLine();
                }
            }

            System.out.println();
            System.out.println("Skipped workouts:");
            boolean noSkip = true;
            for (int i = 0; i < workouts[currWeek].length; i++) {
                int skip = (int)(Math.random() * 10) + 1;
                if (skip <= 2) {
                    numSkipped++;
                    noSkip = false;
                    System.out.println("You skipped workout #" + nextWO);
                }else {
                    totalMin += workouts[currWeek][i].getDur();
                    totalBurned += workouts[currWeek][i].startExercise();
                    numComplete++;
                }
                nextWO++;
            }
            if (noSkip)
                System.out.println("No workouts skipped");
            currWeek++;
            System.out.println();
            printProgress();
            System.out.println();
        }
        s.close();
    }

    /**
     * prints current progress stats
     */
    public void printProgress() {
        if(currWeek == workouts.length) {
            System.out.println("*** CONGRATULATIONS ***");
            System.out.println("You have completed your " + workouts.length + " week program!");
            System.out.println("Here is a summary of your entire plan:");
            System.out.println();
        } else {
            System.out.println("*** CURRENT PROGRESS ***");
        }
        System.out.println("Number of workouts completed:\t" + numComplete);
        System.out.println("Number of workouts skipped:\t\t" + numSkipped);
        System.out.println("Total minutes of exercise:\t\t" + totalMin);
        System.out.println("Total calories burned:\t\t\t" + totalBurned);

        if(currWeek == workouts.length)
            System.out.println();
            System.out.println("We hope you continue to progress towards your fitness goals :)");
    }
}
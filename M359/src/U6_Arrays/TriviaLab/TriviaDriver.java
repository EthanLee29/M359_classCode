package U6_Arrays.TriviaLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {

        TriviaGame newGame = new TriviaGame();

        newGame.readQuestion();

        Scanner input = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println("Welcome " + name + "!\n This is an aquatic animal trivia game where" +
                " each correct answer will add \nto your score, and each" +
                " incorrect answer will subtract from your score." +
                "\nEnter the single character corresponding with the answer choice.");

        System.out.println();

        newGame.play();

        String playAgain;
        System.out.println("Would you like to continue?(Type yes or no)");
        playAgain = input.nextLine();

        while(playAgain.equalsIgnoreCase("yes")) {
            System.out.println();
            newGame.play();

            if(newGame.getCount() == 12) {
                System.out.println("Congratulations! You have reached the end of the game!");
                System.out.println();
                break;
            }

            System.out.println("Would you like to continue?(Type yes or no)");
            playAgain = input.nextLine();
        }

        System.out.println("Game Over!\nStats:");
        System.out.println("\tScore: " + newGame.getCurrScore());
        System.out.println("\tQuestions answered correctly: " + newGame.getAmtCorr());
        double per = ((double) newGame.amtCorr / newGame.getCount()) * 100;
        System.out.println("\tPercentage of questions answered correctly: " + per + "%");
    }
}

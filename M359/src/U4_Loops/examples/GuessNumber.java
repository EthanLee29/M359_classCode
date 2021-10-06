package U4_Loops.examples;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randNum = (int) (Math.random() * 10) + 1;
        int guess, guesses = 1;

        System.out.println("Guess a number 1-10:");
        guess = input.nextInt();

        while (guess != randNum) {
            guesses++;
            if(guess < randNum) {
                System.out.println("Your guess is too low");
            }else {
                System.out.println("Your guess is too high");
            }
            System.out.println("Guess a number 1-10:");
            input.nextLine();
            guess = input.nextInt();
        }

        System.out.println("Congrats! You guessed the number " + randNum + " in " + guesses);
    }
}

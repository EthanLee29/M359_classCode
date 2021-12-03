package U6_Arrays.TriviaLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner labFile = new Scanner(new File("lab.txt"));

        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println("Welcome " + name + "!\nThis is an aquatic animal trivia game where you will be ");
    }
}

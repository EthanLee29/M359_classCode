package U6_Arrays.TriviaLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner labFile = new Scanner(new File("lab.txt"));

        TriviaGame newGame = new TriviaGame();

        //newGame.readQuestion();

        Scanner input = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println("Welcome " + name + "!\n This is an aquatic animal trivia game where" +
                " each correct answer will add \nto your score, and each" +
                " incorrect answer will subtract from your score." +
                "\nEnter the single character corresponding with the answer choice. " +
                "\nTo win you need at least 30 points.");

        System.out.println();

        String que = labFile.nextLine();
        String mcA = labFile.nextLine();
        String mcB = labFile.nextLine();
        String mcC = labFile.nextLine();
        String mcD = labFile.nextLine();
        String ans = labFile.nextLine();
        int pts = labFile.nextInt();

        Question q = new Question(que, mcA, mcB, mcC, mcD, ans, pts);

        System.out.println(q);

        String answer = input.nextLine();
        newGame.readAnswer(answer, q);
    }
}

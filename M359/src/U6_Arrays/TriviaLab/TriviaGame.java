package U6_Arrays.TriviaLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    private Question[] questions;
    private int currScore;
    private boolean correct;
    int streak = 0;
    int[] used = {13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13};
    int count = 0;
    int amtCorr = 0;


    public TriviaGame() {
        currScore = 0;
        questions = new Question[12];
    }

    public void readQuestion() throws FileNotFoundException {
        Scanner labFile = new Scanner(new File("lab.txt"));

        for (int i = 0; i < 12; i++) {
            String que = labFile.nextLine();
            String mcA = labFile.nextLine();
            String mcB = labFile.nextLine();
            String mcC = labFile.nextLine();
            String mcD = labFile.nextLine();
            String ans = labFile.nextLine();
            int pts = labFile.nextInt();

            if(labFile.hasNextLine()) {
                labFile.nextLine();
            }

            Question q = new Question(que, mcA, mcB, mcC, mcD, ans, pts);
            questions[i] = q;
        }
    }

    public void readAnswer(String answer, Question q) {
        correct = answer.equalsIgnoreCase(q.getCorrectAns());
        if(correct) {
            currScore += q.getValue();
            System.out.println("Correct!");
            System.out.println("Points gained: " + q.getValue());
            System.out.println("Current score: " + currScore);

            streak++;
            System.out.println("Current streak: " + streak);
            System.out.println();

            amtCorr++;
        }else {
            currScore -= q.getValue();
            System.out.println("Incorrect. Correct answer: " + q.getCorrectAns());
            System.out.println("Points lost: " + q.getValue());
            System.out.println("Current score: " + currScore);

            streak = 0;
            System.out.println("Current streak: " + streak);
            System.out.println();
        }
    }

    public void play() {
        int rand;
        boolean isUsed;

        for (int i = 0; i < 12; i++) {
            isUsed = false;
            rand = (int)(Math.random() * 11);

            for (int j = 0; j < 12; j++) {
                if (rand == used[j]) {
                    isUsed = true;
                }
            }
            if (isUsed == false) {
                System.out.println(questions[rand]);

                Scanner input = new Scanner(System.in);
                String answer = input.nextLine();
                readAnswer(answer, questions[rand]);

                used[count] = rand;
                count++;
                break;
            }
        }
    }

    public int getAmtCorr() {
        return amtCorr;
    }

    public int getCurrScore() {
        return currScore;
    }

    public int getCount() {
        return count;
    }
}

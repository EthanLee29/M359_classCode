package U6_Arrays.TriviaLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    private Question[] questions;
    private int currScore;
    private boolean correct;

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
            System.out.println("Correct! Current score: " + currScore);
        }else {
            currScore -= q.getValue();
            System.out.println("Incorrect. Current score: " + currScore);
        }
    }

    public Question[] getQuestions() {
        return questions;
    }

    public int getCurrScore() {
        return currScore;
    }
}

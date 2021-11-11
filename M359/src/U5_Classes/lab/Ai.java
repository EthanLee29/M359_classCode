package U5_Classes.lab;

public class Ai {
    private VideoGame vG;
    private String difficulty; // easy, medium, hard
    public static int numAIRounds = 0;
    public static int numAiWins= 0;

    public Ai (VideoGame vG, String difficulty) {
        this.vG = vG;
        this.difficulty = difficulty;
    }

    /**
     * This method returns the average wins of all the Ais
     * @return
     */
    public static double getAverageWins () {
        return (double) numAiWins / numAIRounds;
    }

    public VideoGame getvG() {
        return vG;
    }

    public void setvG(VideoGame vG) {
        this.vG = vG;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public static int getNumAIRounds() {
        return numAIRounds;
    }

    public static int getNumAiWins() {
        return numAiWins;
    }
}
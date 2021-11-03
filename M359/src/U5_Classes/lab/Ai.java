package U5_Classes.lab;

public class Ai {
    private VideoGame vG;
    private String difficulty; // easy, medium, hard

    public Ai (VideoGame vG, String difficulty) {
        this.vG = vG;
        this.difficulty = difficulty;
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
}

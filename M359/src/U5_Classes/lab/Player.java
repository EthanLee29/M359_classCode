package U5_Classes.lab;

public class Player {
    private int hours;
    private String name;
    private VideoGame vG;
    public static int numPRounds = 0;
    public static int numPWins = 0;

    public Player (int h, String n, VideoGame vidGame) {
        hours = h;
        name = n;
        vG = vidGame;
    }

    /**
     * This method returns the average wins of all the Players
     * @return
     */
    public static double getAverageWins () {
        return (double) numPWins / numPRounds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VideoGame getvG() {
        return vG;
    }

    public void setvG(VideoGame vG) {
        this.vG = vG;
    }

    public static int getNumPRounds() {
        return numPRounds;
    }

    public static int getNumPWins() {
        return numPWins;
    }
}
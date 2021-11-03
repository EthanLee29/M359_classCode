package U5_Classes.lab;

public class Player {
    private int hours;
    private String name;
    private VideoGame vG;

    public Player (int h, String n, VideoGame vidGame) {
        hours = h;
        name = n;
        vG = vidGame;
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
}

package U5_Classes.lab;

public class VideoGame {
    private boolean isConsole;
    private boolean isPc;
    private int numPlayers;
    private String gameName;


    public VideoGame(boolean isConsole, boolean isPc, int numPlayers, String gameName) {
        this.isConsole = isConsole;
        this.isPc = isPc;
        this.numPlayers = numPlayers;
        this.gameName = gameName;
    }

    public boolean isConsole() {
        return isConsole;
    }

    public void setConsole(boolean console) {
        isConsole = console;
    }

    public boolean isPc() {
        return isPc;
    }

    public void setPc(boolean pc) {
        isPc = pc;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
}

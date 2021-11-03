package U5_Classes.lab;

import java.util.Scanner;

public class VideoGameTester {
    public static void main(String[] args) {
        String dif;
        Scanner input = new Scanner(System.in);

        VideoGame minecraft = new VideoGame (true, true, 4, "Minecraft");
        System.out.println("Choose Ai battle difficulty(Easy,Normal,Hard) ");
        dif = input.nextLine();
        dif = dif.toLowerCase();
        Ai newAi = new Ai(minecraft, dif);
        Player player1 = new Player(7, "Steve", minecraft);

        battle(newAi, player1);
    }

    /**This method creates a battle between an Ai and a player
     *
     * @param artInt //AI object
     * @param person //player object
     * @return //a string that says who won
     */
    public static String battle (Ai artInt, Player person) {
        String result = "";

        if(artInt.getvG().getGameName().equals(person.getvG().getGameName())) {
            if(artInt.getDifficulty().equals("easy")) {
                if(person.getHours() >= 5) {
                    result += "Player wins!";
                }else {
                    result += "AI wins!";
                }
            }else if(artInt.getDifficulty().equals("normal")) {
                if(person.getHours() >= 10) {
                    result += "Player wins!";
                }else {
                    result += "AI wins!";
                }
            }else if(artInt.getDifficulty().equals("hard")) {
                if (person.getHours() >= 20) {
                    result += "Player wins!";
                } else {
                    result += "AI wins!";
                }
            }
        }
        return result;
    }
}

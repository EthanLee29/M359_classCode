package U5_Classes.lab;

import java.util.Scanner;

public class VideoGameTester {
    public static void main(String[] args) {
        String dif;
        String name;
        int hours;
        Scanner input = new Scanner(System.in);

        VideoGame minecraft = new VideoGame (true, true, "Minecraft");
        System.out.println("Choose Ai battle difficulty(Easy,Normal,Hard) ");
        dif = input.nextLine();
        dif = dif.toLowerCase();
        Ai newAi = new Ai(minecraft, dif);

        System.out.println("What's your name?");
        name = input.nextLine();
        System.out.println("How many hours have you played for?");
        hours = input.nextInt();
        Player player1 = new Player(hours, name, minecraft);

        battle(newAi, player1);
        battleAgain(newAi, player1);

        System.out.println(Player.getAverageWins());
        System.out.println(Ai.getAverageWins());

        System.out.println("How many hours have you played for?");
        hours = input.nextInt();

        player1.setHours(hours);

        battle(newAi, player1);
        battleAgain(newAi, player1);

        System.out.println(Player.getAverageWins());
        System.out.println(Ai.getAverageWins());
    }

    /**This method creates a battle between an Ai and a player
     *
     * @param artInt //AI object
     * @param person //player object
     * @return //a string that says who won
     */
    public static String battle (Ai artInt, Player person) {
        Player.numPRounds++;
        Ai.numAIRounds++;
        if(artInt.getvG().getGameName().equals(person.getvG().getGameName())) {
            if(artInt.getDifficulty().equals("easy")) {
                if(person.getHours() >= 5) {
                    Player.numPWins++;
                    return "Player wins!";
                }else {
                    Ai.numAiWins++;
                    return "Ai wins!";
                }
            }else if(artInt.getDifficulty().equals("normal")) {
                if(person.getHours() >= 10) {
                    Player.numPWins++;
                    return "Player wins!";
                }else {
                    Ai.numAiWins++;
                    return "Ai wins!";
                }
            }else if(artInt.getDifficulty().equals("hard")) {
                if (person.getHours() >= 20) {
                    Player.numPWins++;
                    return "Player wins!";
                } else {
                    Ai.numAiWins++;
                    return "Ai wins!";
                }
            }
        }
        return "Different games";
    }
    /**This method executes battle repeatedly until the player types "-1"
     *
     * @param bot //AI object
     * @param p1 //player object
     * @return //a string that says who won
     */


    public static void battleAgain(Ai bot, Player p1) {
        String playAgain;
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to go again?(Type yes or no)");
        playAgain = input.nextLine();

        while(playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("no")) {
            if(playAgain.equalsIgnoreCase("no")) {
                System.out.println("Player won " + Player.numPWins + " times. \nBot won " + Ai.numAiWins + " times.");
                break;
            }
            if(battle(bot, p1).equals("Player wins!")){
                System.out.println("Would you like to go again?(Type yes or no)");
                playAgain = input.nextLine();
            }else{
                System.out.println("Would you like to go again?(Type yes or no)");
                playAgain = input.nextLine();
            }
        }

    }
}
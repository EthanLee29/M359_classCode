package U5_Classes.examples.herovillianexample;

public class MarvelMovieTester {
    public static void main(String[] args) {
        // power scale 1-100 (ultimate power)
        Power bpPower = new Power("Vibranium wealth", 85.0);
        SuperHero blackPanther = new SuperHero("Black Panther", bpPower);
        Villian killmonger = new Villian("Killmonger", new Power("Vibranium stealage",
                80.0));

        System.out.println(blackPanther);
        System.out.println(killmonger);
        System.out.println("Num Heroes: " + SuperHero.getNumHeroes());
        System.out.println("Num Villains: " + Villian.getNumVillians());

        SuperHero shuri = new SuperHero("Shuri (sister)", bpPower);
        SuperHero arvind = new SuperHero("Arvind", new Power(bpPower.getName(),
                bpPower.getStrength()));

        System.out.println("Num Heroes: " + SuperHero.getNumHeroes());
        System.out.println("Num Villains: " + Villian.getNumVillians());

        System.out.println(shuri);
//        System.out.println(arvind);
//        shuri.updatePowerStrength(-45.0);
//        System.out.println(blackPanther);
//        System.out.println(killmonger);
//        System.out.println(shuri);
//        System.out.println(arvind);
//        arvind.updatePowerStrength(20.0);
//        System.out.println(arvind);

        epicBattle(blackPanther, killmonger, 20);
    }

    /**
     * This method will get a random number from 0-100 (100% chances) and the
     * fighter with more strength will have a 70% chance of winning the battle.
     *
     * If they have the same strength, the hero always wins
     *
     * The winner gets 10% damage subtracted from their strength
     * The loser gets 50% damage subtracted from their strength
     *
     * @param hero
     * @param villian
     */

    public static void battle(SuperHero hero, Villian villian) {
        double percent = Math.random(); // [0, 1.0)
        double heroStrength = hero.getSuperPower().getStrength();
        double villianStrength = villian.getSuperPower().getStrength();

        if (heroStrength == 0 || villianStrength == 0) {
            System.out.println("No battle, one person is dead");
            return;
        }

        if (heroStrength > villianStrength) {
            if (percent < 0.7) {
                double damageWinner = -0.1 * heroStrength;
                hero.updatePowerStrength(damageWinner);
                double damageLoser = -0.5 * villianStrength;
                villian.updatePowerStrength(damageLoser);
            }else {
                double damageWinner = -0.1 * villianStrength;
                villian.updatePowerStrength(damageWinner);
                double damageLoser = -0.5 * heroStrength;
                hero.updatePowerStrength(damageLoser);
            }
        }else if (heroStrength < villianStrength) {
            if (percent < 0.7) {
                double damageWinner = -0.1 * villianStrength;
                villian.updatePowerStrength(damageWinner);
                double damageLoser = -0.5 * heroStrength;
                hero.updatePowerStrength(damageLoser);
            }else {
                double damageWinner = -0.1 * heroStrength;
                hero.updatePowerStrength(damageWinner);
                double damageLoser = -0.5 * villianStrength;
                villian.updatePowerStrength(damageLoser);
            }
        }else {
            double damageWinner = -0.1 * heroStrength;
            hero.updatePowerStrength(damageWinner);
            double damageLoser = -0.5 * villianStrength;
            villian.updatePowerStrength(damageLoser);
        }
        System.out.println(hero);
        System.out.println(villian);
    }

    /**
     *This method will run numBattles between hero and villian as long as both
     * people have strength left
     *
     * @param hero
     * @param villian
     * @param numBattles
     */
    public static void epicBattle(SuperHero hero, Villian villian, int numBattles) {
        for(int i = 0; i < numBattles; i++) {
            // optional add in an if statement to check if the people are alive before
            // sending them to battle

            double heroStrength = hero.getSuperPower().getStrength();
            double villianStrength = villian.getSuperPower().getStrength();

            if (heroStrength != 0.0 && villianStrength != 0.0) {
                System.out.println(hero);
                System.out.println(villian);
                battle(hero, villian);
                System.out.println();
            }
        }
    }
}

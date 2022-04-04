package Unit9.Lab;

public class Strength extends Workout{
    private int weight;

    public Strength(String name, int num, int dur, int weight) {
        super(name, num, dur);
        this.weight = weight;
    }

    /**
     * Generates a random number [1,3] and multiplies
     * it by the weight to get calories burned
     * @return calories
     */
    public int startExercise() {
        int mult = (int)(Math.random() * 2) + 1;

        return mult * weight;
    }
}

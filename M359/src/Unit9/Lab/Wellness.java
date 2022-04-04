package Unit9.Lab;

public class Wellness extends Workout{
    private int numStretch;

    public Wellness(String name, int num, int dur, int numStretch) {
        super(name, num, dur);
        this.numStretch = numStretch;
    }

    /**
     * Generates a random number [5,10] and multiplies it
     * by the number of stretches to get calories burned
     * @return
     */
    public int startExercise() {
        int mult = (int)(Math.random() * 5) + 5;

        return mult * numStretch;
    }
}

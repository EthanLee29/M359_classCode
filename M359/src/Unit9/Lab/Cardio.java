package Unit9.Lab;

public class Cardio extends Workout{
    private double dist, speed;

    public Cardio(String name, int num, int dur, double speed) {
        super(name, num, dur);
        this.speed = speed;
        dist = speed * (getDur() / 60.0);
    }

    /**
     * Generates random number [80, 140] and
     * multiplies it by distance to get calories burned
     * @return calories per mile
     */
    public int startExercise() {
        int calPerMile = (int)(Math.random() * 60) + 80;

        return calPerMile * (int)dist;
    }
}

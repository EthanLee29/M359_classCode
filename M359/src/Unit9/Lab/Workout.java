package Unit9.Lab;

public class Workout {
    private String name;
    private int num, dur;

    public Workout(String name, int num, int dur) {
        this.name = name;
        this.num = num;
        this.dur = dur;
    }


    public String toString() {
        String str = "";
        str += "Workout #" + num +":\t";
        if (num < 10)
            str += "\t";
        str += name + "\t";
        if (name.length() < 8)
            str += "\t";
        str += dur;

        return str;
    }

    /**
     * Prints a statement telling the user a workout is starting
     * and returns 0
     * @return 0
     */
    public int startExercise() {
        System.out.println("Starting a workout");

        return 0;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public int getDur() {
        return dur;
    }
}

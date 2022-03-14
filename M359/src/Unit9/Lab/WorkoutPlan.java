package Unit9.Lab;

public class WorkoutPlan {
    private int numComplete, numSkipped, currWeek, nextWO, totalBurned, totalMin;
    private Workout[][] workouts;

    public WorkoutPlan(int numWeeks) {
        numComplete = 0;
        numSkipped = 0;
        currWeek = 0;
        nextWO = 0;
        totalBurned = 0;
        totalMin = 0;

        workouts = new Workout[numWeeks][7];
    }

    public void fill() {
        for (int i = 0; i < workouts.length; i++) {
            for (int j = 0; j < workouts[i].length; j++) {
                int rand = (int)(Math.random() * 3);

                if(rand == 0) {
                    int time = (int)(Math.random() * 30) + 10;
                    int speed = (int)(Math.random() * 6) + 1;
                    workouts[i][j] = new Cardio("Running", i + j, time, speed);

                }else if(rand == 1) {
                    int time = (int)(Math.random() * 45) + 15;
                    int weight = (int)(Math.random() * 130) + 95;
                    workouts[i][j] = new Strength("Lifting", i + j, time, weight);

                }else if(rand == 2) {
                    int time = (int)(Math.random() * 30) + 30;
                    int numStretches = (int)(Math.random() * 4) + 8;
                    workouts[i][j] = new Wellness("Stretching", i + j, time, numStretches);
                }
            }
        }
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < workouts.length; i++) {
            str += "*** WEEK #1 ***\n";
            str += "WORKOUT NUM\t\tNAME\t\tMINUTES\n";
            for (int j = 0; j < workouts[i].length; j++) {
                str += workouts[i][j].toString() + "\n";
            }
        }

        return str;
    }
}
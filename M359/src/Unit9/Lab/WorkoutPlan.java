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
                }
            }
        }
    }
}
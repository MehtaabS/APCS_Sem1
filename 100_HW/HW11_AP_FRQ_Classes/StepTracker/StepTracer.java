public class starter {
    private int minSteps;
    private double steps;
    private int days;
    private int active;
    public StepTracker(int minimumSteps) {
        minSteps = minimumSteps;
        steps = 0.0;
        days = 0;
        active = 0;
    }
    public void addDailySteps(int dailySteps) {
        days++;
        steps += dailySteps;

        if (dailySteps >= minSteps) {
            active++;
        }
    }
    public int activeDays() {
        return active;
    }
    public double averageSteps() {
        if (days == 0) {
            return 0.0;
        }
        return steps / days;
    }
}
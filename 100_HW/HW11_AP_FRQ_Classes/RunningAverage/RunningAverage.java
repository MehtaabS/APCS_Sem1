public class starter {
    private int t;
    private double avg;
    public RunningAverage() {
        t = 0;
        avg = 0.0;
    }
    public double getNewRating() {
        return 0.0;
    }
    public void updateAverage(double newVal) {
        double newTotal = (t * avg) + newVal;
        t++;
        avg = newTotal / t;
    }
    public int processNewRatings(int n) {
        int wrong = 0;
        int toProc = n;
        while (toProc > 0) {
            double rat = getNewRating();
            if (rat >= 0) {
                updateAverage(rat);
            }
            else {
                wrong++;
            }

            toProc--;
        }
        return wrong;
    }
}
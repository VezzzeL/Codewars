package tasks.kata7;

public class PopulationGrowth {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int n = 0;
        while (p - p0 > 0) {
            p0 += p0 * percent/100 + aug;
            n++;
        }
        return n;
    }
}

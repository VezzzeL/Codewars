package tasks.kata7;
//You are given:
//n - The total number of shots.
//x - The number of laxative laden shots.
//a - The number of shots that peter drinks.
//return the probability that Peter won't have the trots after drinking. n will always be greater than x, and a will
// always be less than n.
//You must return the probability rounded to two decimal places i.e. 0.05 or 0.81
public class LaxativeShotRoulette {
    static double getChance(int n, int x, int a) {
        double p = 1;
        while (a-- > 0) {
            p = p * (n - x) / n--;
        }
        return Math.round(100 * p) / 100.;
    }
}

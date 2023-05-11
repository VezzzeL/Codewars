package tasks.kata8;

import java.util.stream.Stream;

public class WilsonPrimes {
    public static boolean am_i_wilson(double n) {
        return (factorial(n - 1) + 1) / Math.pow(n, 2) % 1 == 0;
    }

    public static double factorial(double n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }
}

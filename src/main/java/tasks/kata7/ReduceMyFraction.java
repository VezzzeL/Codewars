package tasks.kata7;

//Write a function which reduces fractions to their simplest form! Fractions will be presented as an array/tuple
// (depending on the language) of strictly positive integers, and the reduced fraction must be returned as an
// array/tuple:
//input:   [numerator, denominator]
//output:  [reduced numerator, reduced denominator]
//example: [45, 120] --> [3, 8]
public class ReduceMyFraction {
    public static int[] myFraction(int[] fractions) {
        int numerator = fractions[0], denominator = fractions[1];
        int gcd = findGCD(numerator, denominator);
        return new int[]{numerator / gcd, denominator / gcd};
    }

    private static int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }
}

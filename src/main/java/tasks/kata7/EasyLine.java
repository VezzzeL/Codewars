package tasks.kata7;

import java.math.BigInteger;

//In the drawing below we have a part of the Pascal's triangle, horizontal lines are numbered from zero (top).
//We want to calculate the sum of the squares of the binomial coefficients on a given horizontal line with a function
// called easyline (or easyLine or easy-line).
//Can you write a program which calculate easyline(n) where n is the horizontal line number?
//The function will take n (with: n>= 0) as parameter and will return the sum of the squares of the binomial coefficients
// on line n.
public class EasyLine {
    public static BigInteger easyLine(int n) {
        BigInteger result = BigInteger.ZERO;

        for (int k = 0; k <= n; k++) {
            BigInteger coefficient = binomialCoefficient(n, k);
            result = result.add(coefficient.pow(2));
        }

        return result;
    }

    private static BigInteger binomialCoefficient(int n, int k) {
        return factorial(n).divide(factorial(k).multiply(factorial(n - k)));
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

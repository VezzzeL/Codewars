package tasks.kata7;

import java.math.BigInteger;
import java.util.stream.IntStream;

//Let us consider integer coordinates x, y in the Cartesian plane and three functions f, g, h defined by:
//f: 1 <= x <= n, 1 <= y <= n --> f(x, y) = min(x, y)
//g: 1 <= x <= n, 1 <= y <= n --> g(x, y) = max(x, y)
//h: 1 <= x <= n, 1 <= y <= n --> h(x, y) = x + y
//where n is a given integer (n >= 1) and x, y are integers
//The task is to calculate the sum of f(x, y), g(x, y) and h(x, y) for all integers x and y in the domain D:
// (1 <= x <= n, 1 <= y <= n).
//The function sumin (sum of f) will take n as a parameter and return the sum of min(x, y) in D.
//The function sumax (sum of g) will take n as a parameter and return the sum of max(x, y) in D.
//The function sumsum (sum of h) will take n as a parameter and return the sum of x + y in D.
public class FunctionsIntegersCartesianPlane {
    public static BigInteger sumin(final int n) {
        return IntStream.range(1, n).mapToObj(FunctionsIntegersCartesianPlane::gaussSum)
                .reduce(BigInteger.valueOf(n).multiply(gaussSum(n)), (a, b) -> a.subtract(b));
    }

    public static BigInteger sumax(final int n) {
        return IntStream.range(1, n).mapToObj(FunctionsIntegersCartesianPlane::gaussSum)
                .reduce(BigInteger.valueOf(n).multiply(gaussSum(n)), (a, b) -> a.add(b));
    }

    public static BigInteger sumsum(final int n) {
        return BigInteger.valueOf(2 * n).multiply(gaussSum(n));
    }

    private static BigInteger gaussSum(final int n) {
        return BigInteger.valueOf(n * (n + 1) / 2);
    }
}

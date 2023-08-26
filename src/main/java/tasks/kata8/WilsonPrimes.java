package tasks.kata8;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class WilsonPrimes {
    public static boolean am_i_wilson(double n) {
        int p = (int) n;
        if (p <= 1) {
            return false;
        }
        BigInteger factorial = LongStream.rangeClosed(2, p - 1)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
        BigInteger mod = factorial.add(BigInteger.ONE).mod(BigInteger.valueOf(p).pow(2));
        return mod.equals(BigInteger.ZERO);
    }
}

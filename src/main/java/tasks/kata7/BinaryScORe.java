package tasks.kata7;

import java.math.BigInteger;
//Given a number n we will define its scORe to be 0 | 1 | 2 | 3 | ... | n, where | is the bitwise OR operator.
//Write a function that takes n and finds it's scORe.
public class BinaryScORe {
    public static BigInteger score(BigInteger n) {
        return BigInteger.valueOf(2).pow(n.bitLength()).subtract(BigInteger.valueOf(1));
    }
}

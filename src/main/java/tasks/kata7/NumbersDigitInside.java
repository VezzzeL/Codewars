package tasks.kata7;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//You have to search all numbers from inclusive 1 to inclusive a given number x, that have the given digit d in it.
//The value of d will always be 0 - 9.
//The value of x will always be greater than 0.
//
//You have to return as an array
//
//the count of these numbers,
//their sum
//and their product.
public class NumbersDigitInside {
    public static long[] NumbersWithDigitInside(long x, long d) {
        long count = 0, sum = 0, product = 0;

        for (long i = 1; i <= x; i++) {
            if (String.valueOf(i).contains(String.valueOf(d))) {
                count++;
                sum += i;
                if (product == 0) {
                    product = i;
                } else {
                    product *= i;
                }
            }
        }

        return new long[]{count, sum, product};
    }
}

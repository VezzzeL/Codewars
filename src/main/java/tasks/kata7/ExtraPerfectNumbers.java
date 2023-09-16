package tasks.kata7;

import java.util.stream.IntStream;

//Definition
//Extra perfect number is the number that first and last bits are set bits.
//Task
//Given a positive integer N , Return the extra perfect numbers in range from 1 to N .
public class ExtraPerfectNumbers {
    public static int[] extraPerfect(int number) {
        return IntStream.rangeClosed(1, number).filter(i -> i % 2 == 1).toArray();
    }
}

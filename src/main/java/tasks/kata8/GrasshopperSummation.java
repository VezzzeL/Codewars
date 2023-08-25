package tasks.kata8;

import java.util.stream.IntStream;

//Write a program that finds the summation of every number from 1 to num.
// The number will always be a positive integer greater than 0.
public class GrasshopperSummation {
    public static int summation(int n) {
        return IntStream.range(0, n + 1).sum();
    }
}

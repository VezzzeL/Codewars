package tasks.kata8;

import java.util.stream.DoubleStream;

//Write a function that takes an array of numbers and returns the sum of the numbers. The numbers can be negative or
// non-integer. If the array does not contain any numbers then you should return 0.
public class SumArrays {
    public static double sum(double[] numbers) {
        return DoubleStream.of(numbers).sum();
    }
}

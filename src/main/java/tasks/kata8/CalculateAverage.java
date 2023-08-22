package tasks.kata8;

import java.util.Arrays;

//Write a function which calculates the average of the numbers in a given list.
public class CalculateAverage {
    public static double find_average(int[] array){
        return Arrays.stream(array).average().getAsDouble();
    }
}

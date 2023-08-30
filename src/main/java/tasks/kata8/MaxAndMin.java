package tasks.kata8;

import java.util.stream.IntStream;

//Your task is to make two functions ( max and min, or maximum and minimum, etc., depending on the language ) that
// receive a list of integers as input, and return the largest and lowest number in that list, respectively.
public class MaxAndMin {
    public int min(int[] list) {
        return IntStream.of(list).min().orElse(0);
    }

    public int max(int[] list) {
        return IntStream.of(list).max().orElse(0);
    }
}

package tasks.kata8;

import java.util.stream.IntStream;

//Write a method, that will get an integer array as parameter and will process every number from this array.
//Return a new array with processing every number of the input-array like this:
//If the number has an integer square root, take this, otherwise square the number.
public class RootSquare {
    public static int[] squareOrSquareRoot(int[] array) {
        return IntStream.of(array).map(n -> Math.sqrt(n) % 1 == 0 ? (int) Math.sqrt(n) : n * n).toArray();
    }
}

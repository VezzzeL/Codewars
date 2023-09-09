package tasks.kata8;

//Create a function that accepts a list/array and a number n, and returns a list/array of the first n
// elements from the list/array.
//If you need help, here's a reference:
public class TakeFirstNElements {
    public static int[] take(int[] arr, int n) {
        return n < arr.length ? java.util.Arrays.copyOf(arr, n) : arr;
    }
}

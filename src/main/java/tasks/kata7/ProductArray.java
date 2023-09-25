package tasks.kata7;

import java.util.Arrays;

//Given an array/list [] of integers , Construct a product array Of same size Such That prod[i]
// is equal to The Product of all the elements of Arr[] except Arr[i].
//Array/list size is at least 2 .
//Array/list's numbers Will be only Positives
//Repetition of numbers in the array/list could occur.
public class ProductArray {
    public static long[] productArray(int[] numbers) {
        long totalProduct = Arrays.stream(numbers)
                .asLongStream()
                .reduce(1, (x, y) -> x * y);

        return Arrays.stream(numbers)
                .mapToLong(num -> totalProduct / num)
                .toArray();
    }
}

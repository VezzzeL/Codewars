package tasks.kata8;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

//Create a method all which takes two params:
//a sequence
//a function (function pointer in C)
//and returns true if the function in the params returns true for every element in the sequence.
// Otherwise, it should return false. If the sequence is empty, it should return true, since technically
// nothing failed the test.
public class TrueForAll {
    public static boolean all(int[] list, IntPredicate predicate) {
        return IntStream.of(list).allMatch(predicate);
    }
}

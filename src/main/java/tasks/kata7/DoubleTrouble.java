package tasks.kata7;

import java.util.LinkedList;

//Given an array of integers (x), and a target (t), you must find out if any two consecutive numbers in the
// array sum to t. If so, remove the second number.
//Work through the array from left to right.
//Return the resulting array.
public class DoubleTrouble {
    public static int[] trouble(int[] x, int t) {
        LinkedList<Integer> result = new LinkedList<>();
        result.add(x[0]);
        for (int i = 1; i < x.length; i++) {
            if (result.getLast() + x[i] != t) {
                result.add(x[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

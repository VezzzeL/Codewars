package tasks.kata7;

import java.util.HashSet;

//You are given an odd-length array of integers, in which all of them are the same, except for one single number.
//Complete the method which accepts such an array, and returns that single different number.
//The input array will always be valid! (odd-length >= 3)
public class FindStrayNumber {
    static int stray(int[] numbers) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : numbers) {
            if (!seen.add(num)) {
                seen.remove(num);
            }
        }
        return seen.iterator().next();
    }
}

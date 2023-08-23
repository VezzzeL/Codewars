package tasks.kata8;

//Complete the function that takes two integers (a, b, where a < b) and return an array of all
// integers between the input parameters, including them.
public class WhatIsBetween {
    public static int[] between(int a, int b) {
        int[] res = new int[b - a + 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = a + i;
        }
        return res;
    }
}

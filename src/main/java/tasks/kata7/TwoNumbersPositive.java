package tasks.kata7;

//Your job is to write a function, which takes three integers a, b, and c as arguments, and returns True if exactly
// two of of the three integers are positive numbers (greater than zero), and False - otherwise.
public class TwoNumbersPositive {
    public static boolean twoArePositive(int a, int b, int c) {
        return (a > 0 ? 1 : 0) + (b > 0 ? 1 : 0) + (c > 0 ? 1 : 0) == 2;
    }
}

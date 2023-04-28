package tasks.kata8;

//Given a set of numbers, return the additive inverse of each. Each positive becomes negatives,
// and the negatives become positives.
public class InvertValues {
    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }
        return array;
    }
}

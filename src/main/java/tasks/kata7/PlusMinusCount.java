package tasks.kata7;

//Count how often sign changes in array.
//result
//number from 0 to ... . Empty array returns 0
public class PlusMinusCount {
    public static int signChange(int[] arr) {
        if (arr.length <= 1) return 0;
        int count = 0;
        boolean prev = arr[0] >= 0;
        for (int i = 1; i < arr.length; i++) {
            boolean cur = arr[i] >= 0;
            if (cur != prev) {
                count++;
            }
            prev = cur;
        }
        return count;
    }
}

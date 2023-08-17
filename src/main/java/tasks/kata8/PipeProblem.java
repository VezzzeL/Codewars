package tasks.kata8;

//Given a list of unique numbers sorted in ascending order, return a new list so that the values increment by
//1 for each index from the minimum value up to the maximum value (both included).
public class PipeProblem {
    public static int[] pipeFix(int[] numbers) {
        int size = numbers[numbers.length - 1] - numbers[0] + 1;
        int[] res = new int[size];
        int temp = numbers[0];
        for (int i = 0; i <= size; i++) {
            res[i] = temp;
            temp++;
        }
        return res;
    }
}

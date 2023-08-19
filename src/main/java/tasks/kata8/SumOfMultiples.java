package tasks.kata8;

//Find the sum of all multiples of n below m
//n and m are natural numbers (positive integers)
//m is excluded from the multiples
public class SumOfMultiples {
    public static long sumMul(int n, int m) {
        if (m <= 0 || n <= 0) throw new IllegalArgumentException();
        int res = 0;
        for (int i = n; i < m; i += n) {
            res += i;
        }
        return res;
    }
}

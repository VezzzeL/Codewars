package tasks.kata7;

//The Collatz Conjecture states that for any positive natural number n, this process:
//if n is even, divide it by 2
//if n is odd, multiply it by 3 and add 1
//repeat
//will eventually reach n = 1.
//For example, if n = 20, the resulting sequence will be:
//[ 20, 10, 5, 16, 8, 4, 2, 1 ]
public class CollatzConjectureLength {
    public static long conjecture(long x) {
        long count = 0;
        while (x != 1) {
            x = x % 2 == 0 ? x / 2 : x * 3 + 1;
            count++;
        }
        return ++count;
    }
}

package tasks.kata7;

import java.util.Arrays;

//Write a function to find if a number is lucky or not. If the sum of all digits is 0 or multiple of
// 9 then the number is lucky.
//1892376 => 1+8+9+2+3+7+6 = 36. 36 is divisible by 9, hence number is lucky.
//Function will return true for lucky numbers and false for others.
public class LuckyNumber {
    public static boolean isLucky(long n) {
        return Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt)
                .sum() % 9 == 0;
    }
}

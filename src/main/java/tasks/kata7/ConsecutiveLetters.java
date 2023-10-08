package tasks.kata7;

import java.util.Arrays;
import java.util.stream.Collectors;

//In this Kata, we will check if a string contains consecutive letters as they appear in the English alphabet and
// if each letter occurs only once.
//All inputs will be lowercase letters.
public class ConsecutiveLetters {
    public static boolean solve(String s) {
        if (s.length() == 1) return true;
        s = Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) - s.charAt(i - 1) != 1) return false;
        }
        return true;
    }
}

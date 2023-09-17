package tasks.kata7;

import java.util.stream.IntStream;

//In this Kata, we are going to reverse a string while maintaining the spaces (if any) in their original place.
public class SimpleStringReversal {
    public static String solve(String s) {
        StringBuilder str = new StringBuilder(s.replaceAll(" ", "")).reverse();
        IntStream.range(0, s.length())
                .filter(i -> s.charAt(i) == ' ')
                .forEach(j -> str.insert(j, ' '));
        return str.toString();
    }
}

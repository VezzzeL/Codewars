package tasks.kata7;

import java.util.regex.Pattern;

//In this Kata, you will be given a string that has lowercase letters and numbers. Your task is to compare the number
// groupings and return the largest number. Numbers will not have leading zeros.
//For example, solve("gh12cdy695m1") = 695, because this is the largest of all number groupings.
//Good luck!
public class NumbersInStrings {
    public static int solve(String s){
        return Pattern.compile("[\\d]+")
                .matcher(s)
                .results()
                .mapToInt(m -> Integer.parseInt(m.group()))
                .max().orElse(0);
    }
}

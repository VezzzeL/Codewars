package tasks.kata8;

import java.util.Arrays;

//Create a function that accepts a string and a single character, and returns an integer of the count of
// occurrences the 2nd argument is found in the first one.
//If no occurrences can be found, a count of 0 should be returned.
public class AllStarCodeChallenge18 {
    public static int strCount(String str, char letter) {
        return (int) str.chars().filter((k)-> k==letter).count();
    }
}

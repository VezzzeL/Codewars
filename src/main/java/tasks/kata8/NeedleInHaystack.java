package tasks.kata8;

import java.util.Arrays;

//Can you find the needle in the haystack?
//Write a function findNeedle() that takes an array full of junk but containing one "needle"
//After your function finds the needle it should return a message (as a string) that says:
//"found the needle at position " plus the index it found the needle, so:
public class NeedleInHaystack {
    public static String findNeedle(Object[] haystack) {
        return String.format("found the needle at position %s", Arrays.asList(haystack).indexOf("needle"));
    }
}

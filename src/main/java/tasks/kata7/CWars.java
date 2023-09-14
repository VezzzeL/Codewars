package tasks.kata7;

import java.util.Arrays;
import java.util.stream.Collectors;

//Write a function that takes the full name of a person, and returns the initials, separated by dots ('.').
// The initials must be uppercase. The last name of the person must appear in full, with its first letter in
// uppercase as well.
//"code wars"            ---> "C.Wars"
//"Barack hussein obama" ---> "B.H.Obama"
public class CWars {
    public static String initials(String name) {
        return Arrays.stream(name.split(" "))
                .filter(s -> !s.isEmpty())
                .map(s -> (s.equals(Arrays.stream(name.split(" ")).reduce((s1, s2) -> s2)
                        .orElse(""))) ? (s.substring(0, 1).toUpperCase() + s.substring(1))
                        : (s.substring(0, 1).toUpperCase()))
                .collect(Collectors.joining("."));
    }
}

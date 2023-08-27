package tasks.kata8;

import java.util.Arrays;
import java.util.stream.Collectors;

//Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//The output should be two capital letters with a dot separating them.
public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        return Arrays.stream(name.split(" "))
                .map(s -> s.substring(0, 1).toUpperCase())
                .collect(Collectors.joining("."));
    }
}

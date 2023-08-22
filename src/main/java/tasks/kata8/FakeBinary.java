package tasks.kata8;

import java.util.stream.Collectors;

//Given a string of digits, you should replace any digit below 5 with '0'
// and any digit 5 and above with '1'. Return the resulting string.
//Note: input will never be an empty string
public class FakeBinary {
    public static String fakeBin(String numberString) {
        return numberString.chars().mapToObj(c -> c < '5' ? "0" : "1").collect(Collectors.joining());
    }
}
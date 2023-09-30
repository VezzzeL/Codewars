package tasks.kata7;

//No Story
//No Description
//Only by Thinking and Testing
//Look at result of testcase, guess the code!
public class ThinkingTestingIncompleteString {
    public static String testIncompleteString(String s) {
        int size = s.length();
        StringBuilder result = new StringBuilder();
        if (size <= 1) return s;
        for (int i = 0; i < size - 1; i += 2) {
            result.append((char) ((s.charAt(i) + s.charAt(i + 1)) / 2));
        }
        if (size % 2 != 0) result.append(s.charAt(size - 1));
        return result.toString();
    }
}

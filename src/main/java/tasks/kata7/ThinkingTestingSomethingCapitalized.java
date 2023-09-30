package tasks.kata7;

import java.util.regex.Pattern;

//No Story
//No Description
//Only by Thinking and Testing
//Look at result of testcase, guess the code!
public class ThinkingTestingSomethingCapitalized {
    public static String testSomethingCapitalized(String s) {
        return Pattern.compile("\\w\\b").matcher(s).replaceAll(x -> x.group().toUpperCase());
    }
}

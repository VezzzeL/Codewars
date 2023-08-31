package tasks.kata8;

import java.util.Arrays;
import java.util.stream.Collectors;

//Oh no! Timmy hasn't followed instructions very carefully and forgot how to use the new String Template feature,
// Help Timmy with his string template so it works as he expects!
public class StringTemplatesBugFixing {
    public static String buildString(String... args){
        return String.format("I like s%", Arrays.stream(args).collect(Collectors.joining(", ")));
    }
}

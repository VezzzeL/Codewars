package tasks.kata7;

//Oh, no! The number has been mixed up with the text. Your goal is to retrieve the number from the text,
// can you return the number back to its original state?
public class FilterNumber {
    public static long filterString(final String value) {
        return Long.parseLong(String.valueOf(value).replaceAll("[^0-9]", ""));
    }
}

package tasks.kata8;

public class VowelToExclamation {
    public static String replace(final String s) {
        return s.replaceAll("[aeiouAEIOU]", "!");
    }
}

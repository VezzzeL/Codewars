package tasks.kata7;

//Input will be lowercase and uppercase letters only.
//The first index a will always be lower that than the string length; the second index b can be greater than the string
// length. More examples in the test cases. Good luck!
public class SimpleStringReversalII {
    public static String solve(String s, int a, int b) {
        int end = b >= s.length() ? s.length() : b + 1;
        return s.substring(0, a) + new StringBuilder(s.substring(a, end)).reverse() + s.substring(end);
    }
}

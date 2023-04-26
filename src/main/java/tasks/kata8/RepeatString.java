package tasks.kata8;
//Write a function that accepts an integer n and a string s as parameters,
// and returns a string of s repeated exactly n times.
public class RepeatString {
    public static String repeatStr(final int repeat, final String string) {
        return new String(string.repeat(repeat));
    }
}

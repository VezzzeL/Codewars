package tasks.kata8;
//Complete the solution so that it reverses the string passed into it.
public class ReversedStrings {
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

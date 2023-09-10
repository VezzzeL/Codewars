package tasks.kata8;

public class RemoveNExcl {
    public static String remove(String s, int n) {
        if (s == null || s.isEmpty() || n <= 0) {
            return s;
        }
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '!' && count < n) {
                count++;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}

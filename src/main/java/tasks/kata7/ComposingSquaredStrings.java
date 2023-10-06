package tasks.kata7;

//A squared string is a string of n lines, each substring being n characters long. We are given two n-squared strings.
// For example:
//s1 = "abcd\nefgh\nijkl\nmnop" s2 = "qrst\nuvwx\nyz12\n3456"
//Let us build a new string strng of size (n + 1) x n in the following way:
//The first line of strng has the first char of the first line of s1 plus the chars of the last line of s2.
//The second line of strng has the first two chars of the second line of s1 plus the chars of the penultimate line
// of s2 except the last char
//and so on until the nth line of strng has the n chars of the nth line of s1 plus the first char of the first
// line of s2.
public class ComposingSquaredStrings {
    public static String compose(String s1, String s2) {
        String[] lines1 = s1.split("\n");
        String[] lines2 = s2.split("\n");
        int n = lines1.length;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(lines1[i], 0, i + 1);
            result.append(lines2[n - 1 - i], 0, n - i);
            result.append('\n');
        }

        return result.toString().trim();
    }
}

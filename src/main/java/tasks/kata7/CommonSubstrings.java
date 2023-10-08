package tasks.kata7;

//Given 2 strings, your job is to find out if there is a substring that appears in both strings. You will return true
// if you find a substring that appears in both strings, or false if you do not. We only care about substrings that
// are longer than one letter long.
public class CommonSubstrings {
    public static boolean SubstringTest(String str1, String str2) {
        if (str1 == null || str2 == null) return false;
        for (int i = 0; i < str1.length() - 1; i++) {
            for (int j = 0; j < str2.length() - 1; j++) {
                if (str1.toLowerCase().substring(i, i + 2).equals(str2.toLowerCase().substring(j, j + 2))) {
                    return true;
                }
            }
        }
        return false;
    }
}

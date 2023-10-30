package tasks.kata7;

public class UglifyWord {
    public static String uglifyWord(String str) {
        char[] chars = str.toCharArray();
        boolean flag = true;
        int length = chars.length;

        for (int i = 0; i < length; i++) {
            char c = chars[i];
            if (Character.isLetter(c)) {
                chars[i] = flag ? Character.toUpperCase(c) : Character.toLowerCase(c);
                flag = !flag;
            }else {
                flag = true;
            }
        }
        return new String(chars);
    }
}

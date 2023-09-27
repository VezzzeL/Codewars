package tasks.kata7;

//Given a string indicating a range of letters, return a string which includes all the letters in that range, including
// the last letter. Note that if the range is given in capital letters, return the string in capitals also!
public class FromAToZ {
    public static String gimmeTheLetters(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = (int) s.charAt(0); i <= (int) s.charAt(s.length() - 1); i++) {
            sb.append((char) i);
        }
        return sb.toString();
    }
}


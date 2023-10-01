package tasks.kata7;

import java.util.Arrays;
import java.util.stream.Collectors;

//One suggestion to build a satisfactory password is to start with a memorable phrase or sentence and make a password
// by extracting the first letter of each word.
//Even better is to replace some of those letters with numbers (e.g., the letter O can be replaced with the number 0):
//instead of including i or I put the number 1 in the password;
//instead of including o or O put the number 0 in the password;
//instead of including s or S put the number 5 in the password.
public class PasswordMaker {
    public static String makePassword(String phrase) {
        if (phrase.length() == 0) return phrase;
        return Arrays.stream(phrase
                        .replaceAll("[iI]", "1")
                        .replaceAll("[oO]", "0")
                        .replaceAll("[sS]", "5")
                        .split(" "))
                .map(s -> s.substring(0, 1))
                .collect(Collectors.joining());
    }
}

package tasks.kata8;

import java.util.stream.Collectors;

//Define String.prototype.toAlternatingCase (or a similar function/method such as to_alternating_case/toAlternatingCase/
// ToAlternatingCase in your selected language; see the initial solution for details) such that each lowercase letter
// becomes uppercase and each uppercase letter becomes lowercase. For example:
public class AlternativeCase {
    public static String toAlternativeString(String string) {
        return string.chars()
                .map(c -> Character.isLowerCase(c) ? Character.toUpperCase(c) :
                        Character.isUpperCase(c) ? Character.toLowerCase(c) : c)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}

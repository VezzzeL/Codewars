package tasks.kata7;

//Here is the syntax for valid identifiers:
//Each identifier must have at least one character.
//The first character must be picked from: alpha, underscore, or dollar sign. The first character cannot be a digit.
//The rest of the characters (besides the first) can be from: alpha, digit, underscore, or dollar sign. In other words,
// it can be any valid identifier character.
public class IsValidIdentifier {
    public static boolean isValid(String idn) {
        return idn.length() >= 1 && (
                (Character.isLetter(idn.charAt(0)) || idn.charAt(0) == '_' || idn.charAt(0) == '$') &&
                        idn.substring(1).chars().allMatch(
                                c -> Character.isLetterOrDigit(c) || c == '_' || c == '$'
                        )
        );
    }
}

package tasks.kata8;
//Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.
public class VowelRemover {
    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }
}

package tasks.kata8;

//When provided with a letter, return its position in the alphabet.
//Input :: "a"
//Ouput :: "Position of alphabet: 1"
public class FindThePosition {
    public static String position(char alphabet) {
        return "Position of alphabet: " + (Character.toLowerCase(alphabet) - 'a' + 1);
    }
}

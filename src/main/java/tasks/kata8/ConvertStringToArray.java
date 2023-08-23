package tasks.kata8;

//Write a function to split a string and convert it into an array of words.
public class ConvertStringToArray {
    public static String[] stringToArray(String s) {
        return s.replaceAll("[^a-zA-Z0-9 ]", "").split(" ");
    }
}

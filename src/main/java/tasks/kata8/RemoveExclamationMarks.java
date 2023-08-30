package tasks.kata8;
//Write function RemoveExclamationMarks which removes all exclamation marks from a given string.
public class RemoveExclamationMarks {
    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }
}

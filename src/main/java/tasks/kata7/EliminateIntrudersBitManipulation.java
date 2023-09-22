package tasks.kata7;

//You are given a string representing a number in binary.
// Your task is to delete all the unset bits in this string and return the corresponding number
// (after keeping only the '1's).
public class EliminateIntrudersBitManipulation {
    public static long eliminateUnsetBits(String number) {
        return number.replace("0", "").isBlank() ? 0 :
                Long.parseLong(number.replace("0", ""), 2);
    }
}

package tasks.kata7;

//Given an array with exactly 5 strings "a", "b" or "c" (chars in Java, characters in Fortran),
// check if the array contains three and two of the same values.
public class CheckThreeTwo {
    public boolean checkThreeAndTwo(char[] chars) {
        int countA = 0, countB = 0, countC = 0;
        for (char c : chars) {
            if (c == 'a') countA++;
            else if (c == 'b') countB++;
            else if (c == 'c') countC++;
        }
        return (countA == 2 || countB == 2 || countC == 2) &&
                (countA == 3 || countB == 3 || countC == 3);
    }
}

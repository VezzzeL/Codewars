package tasks.kata7;

//A prison can be represented as an array of cells, where each cell contains exactly one prisoner.
// A 'True' represents an unlocked cell, and 'False' represents a locked cell.
//([True, True, False, False, False, True, False]) ➞ 4
//([True, True, True]) ➞ 1
//([False, False, False]) ➞ 0
//Create a function that, given this unique prison arrangement, returns the number of freed prisoners.
public class PrisonBreak {
    public static int freedPrisoners(Boolean[] prison) {
        if (!prison[0]) return 0;
        boolean cur = prison[0];
        int count = 0;

        for (boolean b : prison) {
            if (b == cur) {
                cur = !cur;
                count++;
            }
        }

        return count;
    }
}

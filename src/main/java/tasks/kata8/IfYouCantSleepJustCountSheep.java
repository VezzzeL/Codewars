package tasks.kata8;

//Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
// Input will always be valid, i.e. no negative integers.
public class IfYouCantSleepJustCountSheep {
    public static String countingSheep(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            sb.append(i);
            sb.append(" sheep...");
        }
        return sb.toString();
    }
}

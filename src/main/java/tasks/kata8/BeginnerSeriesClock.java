package tasks.kata8;

//Clock shows h hours, m minutes and s seconds after midnight.
//Your task is to write a function which returns the time since midnight in milliseconds.
public class BeginnerSeriesClock {
    public static int Past(int h, int m, int s) {
        return h * 3600000 + m * 60000 + s * 1000;
    }
}

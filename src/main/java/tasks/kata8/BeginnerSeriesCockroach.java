package tasks.kata8;

//The cockroach is one of the fastest insects. Write a function which takes its speed in km per hour and returns
// it in cm per second, rounded down to the integer (= floored).
public class BeginnerSeriesCockroach {
    public int cockroachSpeed(double x) {
        return (int) (x * 27.7777778);
    }
}

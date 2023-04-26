package tasks.kata8;

//find the nearest square number
public class NearestSquareNumber {
    public static int nearestSq(final int n) {
        return (int) Math.pow(Math.round(Math.sqrt(n)), 2);
    }
}

package tasks.kata8;

//Complete the function that calculates the area of the red square, when the length of the circular arc A is given
// as the input. Return the result rounded to two decimals.
public class AreaSquare {
    public static double squareArea(double a) {
        return Math.round(Math.pow((a * 4) / (2 * Math.PI), 2) * 100.0) / 100.0;
    }
}

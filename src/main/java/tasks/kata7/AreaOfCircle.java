package tasks.kata7;

//Complete the function which will return the area of a circle with the given radius.
//Returned value is expected to be accurate up to tolerance of 0.01.
//If the radius is not positive, throw IllegalArgumentException.
public class AreaOfCircle {
    public static double area(double radius) {
        if (radius <= 0) throw new IllegalArgumentException();
        return Math.PI * Math.pow(radius, 2);
    }
}

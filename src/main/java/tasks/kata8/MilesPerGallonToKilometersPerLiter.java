package tasks.kata8;

//Create an application that will display the number of kilometers per liter (output) based on the number of miles
// per imperial gallon (input).
//
//Make sure to round off the result to two decimal points.
public class MilesPerGallonToKilometersPerLiter {
    public static float mpgToKPM(final float mpg) {
        return Math.round(mpg * 35.4006044) / 100f;
    }
}

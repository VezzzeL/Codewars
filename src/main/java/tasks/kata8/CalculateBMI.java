package tasks.kata8;

//Write function bmi that calculates body mass index (bmi = weight / height2).
public class CalculateBMI {
    public static String bmi(double weight, double height) {
        double temp = weight / Math.pow(height, 2);
        return temp <= 18.5 ? "Underweight" : temp <= 25.0 ? "Normal" : temp <= 30.0 ? "Overweight" : "Obese";
    }
}

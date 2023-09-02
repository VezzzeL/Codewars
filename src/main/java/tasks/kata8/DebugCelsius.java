package tasks.kata8;

//Debug celsius converter
//Your friend is traveling abroad to the United States so he wrote a program to convert fahrenheit to celsius.
// Unfortunately his code has some bugs.
//Find the errors in the code to get the celsius converter working properly.
//To convert fahrenheit to celsius:
public class DebugCelsius {
    public static String weatherInfo(int temp) {
        double celsius = (temp - 32) * 5.0 / 9.0;
        return (celsius < 0) ? (celsius + " is freezing temperature") : (celsius + " is above freezing temperature");
    }
}

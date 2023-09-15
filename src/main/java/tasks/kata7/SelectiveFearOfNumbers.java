package tasks.kata7;

//I've got a crazy mental illness. I dislike numbers a lot. But it's a little complicated:
// The number I'm afraid of depends on which day of the week it is... This is a concrete description of my mental illness:
//Monday --> 12
//Tuesday --> numbers greater than 95
//Wednesday --> 34
//Thursday --> 0
//Friday --> numbers divisible by 2
//Saturday --> 56
//Sunday --> 666 or -666
//Write a function which takes a string (day of the week) and an integer (number to be tested) so it tells the doctor
// if I'm afraid or not. (return a boolean)
public class SelectiveFearOfNumbers {
    static public boolean AmIAfraid(final String day, final int num) {
        return switch (day.toUpperCase()) {
            case "MONDAY" -> num == 12;
            case "TUESDAY" -> num > 95;
            case "WEDNESDAY" -> num == 34;
            case "THURSDAY" -> num == 0;
            case "FRIDAY" -> num % 2 == 0;
            case "SATURDAY" -> num == 56;
            case "SUNDAY" -> Math.abs(num) == 666;
            default -> throw new IllegalArgumentException("Day not exist");
        };
    }
}

package tasks.kata7;

//One hour has 100 minutes (or 10,000 seconds) in decimal time, yet its duration is the same as in standard time.
// Thus a decimal minute consists of 36 standard seconds, which is 1/100 of an hour.
//Working time is usually rounded to integer decimal minutes. Thus one standard minute equals 0.02 decimal hours,
// while two standard minutes equal 0.03 decimal hours and so on.
//The terms "normal time" and "standard time" are considered synonymous in this kata.
//toIndustrial(time) should accept either the time in minutes as an integer or a string of the format "h:mm".
// Minutes will always consist of two digits in the tests (e.g., "0:05"); hours can have more. Return a double that
// represents decimal hours (e.g. 1.75 for 1h 45m). Round to a precision of two decimal digits - do not simply truncate!
//toNormal(time) should accept a double representing decimal time in hours. Return a string that represents standard
// time in the format "h:mm".
//There will be no seconds in the tests. We'll neglect them for the purpose of this kata.
public class DecimalTimeConversion {
    public static double toIndustrial(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) +
                Double.parseDouble(String.format("%.2f", (Integer.parseInt(parts[1]) / 60.0)));
    }

    public static double toIndustrial(int time) {
        return Double.parseDouble(String.format("%.2f", (double) time / 60));
    }

    public static String toNormal(double time) {
        return time - (int) time == 0 ? String.format("%d:00", (int) time) :
                String.format("%d:%02d", (int) time, Math.round((time - (int) time) * 60));
    }
}

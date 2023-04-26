package tasks.kata8;

//Input
//Input will always be a string, e.g., "Friday May 2, 7pm".
//
//Output
//Output will be the shortened string, e.g., "Friday May 2".
public class RemoveTheTime {
    public static String shortenToDate(String longDate) {
        return longDate.split(",")[0];
    }
}

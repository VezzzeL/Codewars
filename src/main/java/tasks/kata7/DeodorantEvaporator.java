package tasks.kata7;
//This program tests the life of an evaporator containing a gas.
//We know the content of the evaporator (content in ml), the percentage of foam or gas lost every day (evap_per_day)
// and the threshold (threshold) in percentage beyond which the evaporator is no longer useful.
// All numbers are strictly positive.
//The program reports the nth day (as an integer) on which the evaporator will be out of use.
public class DeodorantEvaporator {
    public static int evaporator(double content, double evap_per_day, double threshold) {
        int days = 0;
        double currentContent = 100.0;
        while (currentContent > threshold) {
            currentContent -= currentContent * (evap_per_day / 100.0);
            days++;
        }
        return days;
    }
}

package tasks.kata7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//You have an amount of money a0 > 0 and you deposit it with an interest rate of p percent divided by 360 per day on
// the 1st of January 2016. You want to have an amount a >= a0.
//Task:
//The function date_nb_days (or dateNbDays...) with parameters a0, a, p will return, as a string, the date on which you
// have just reached a.
//The return format of the date is "YYYY-MM-DD"
//The deposit is always on the "2016-01-01"
//Don't forget to take the rate for a day to be p divided by 36000 since banks consider that there are 360 days in a year.
//You have: a0 > 0, p% > 0, a >= a0
public class TargetDate {
    public static String dateNbDays(double a0, double a, double p) {
        int days = 0;
        while (a0 < a) {
            a0 += (a0 * (p / 36000));
            days++;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Calendar.JANUARY, 1);
        calendar.add(Calendar.DAY_OF_YEAR, days);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(calendar.getTime());
    }
}

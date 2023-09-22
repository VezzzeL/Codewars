package tasks.kata7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.stream.IntStream;

//Friday 13th or Black Friday is considered as unlucky day. Calculate how many unlucky days are in the given year.
//Find the number of Friday 13th in the given year.
public class UnluckyDays {
    public static int unluckyDays(int year) {
        return IntStream.rangeClosed(1, 12)
                .mapToObj(month -> LocalDate.of(year, month, 13))
                .filter(date -> date.getDayOfWeek() == DayOfWeek.FRIDAY)
                .mapToInt(date -> 1)
                .sum();
    }
}

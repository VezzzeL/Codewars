package tasks.kata7;

import java.util.Map;

//Write a function
//titleToNumber(title) or title_to_number(title) or titleToNb title ...
//that given a column title as it appears in an Excel sheet, returns its corresponding column number.
// All column titles will be uppercase.
public class ExcelColumnNumbers {
    public static long titleToNumber(String title) {
        long result = 0;
        long multiplier = 1;
        for (int i = title.length() - 1; i >= 0; i--) {
            int digitValue = title.charAt(i) - 'A' + 1;
            result += (long) digitValue * multiplier;
            multiplier *= 26;
        }
        return result;
    }
}

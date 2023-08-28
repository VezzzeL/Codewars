package tasks.kata8;

import java.util.HashMap;
import java.util.Map;

//Function should return a dictionary/Object/Hash with "status" as a key, whose value can : "busy" or "available"
// depending on the truth value of the argument is_busy.
//But as you will see after clicking RUN or ATTEMPT this code has several bugs, please fix them.
//    public static HashMap <String, String> getStatus(boolean isBusy) {
//        HashMap<String, String> status;
//        if (isBusy) {
//          status = "busy";
//        } else {
//          status = "available";
//        }
//        return status;
//    }
public class UnexpectedParsing {
    public static HashMap<String, String> getStatus(boolean isBusy) {
        return new HashMap<>(Map.of("status", isBusy ? "busy" : "available"));
    }
}

package tasks.kata8;
//The code provided is supposed replace all the dots . in the specified String str with dashes -
//But it's not working properly.
public class ReplaceDots {
    public static String replaceDots(final String str) {
        return str.replaceAll("\\.", "-");
    }
}

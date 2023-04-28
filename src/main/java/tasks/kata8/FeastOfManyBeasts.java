package tasks.kata8;

//Write a function feast that takes the animal's name and dish as arguments and returns true or false to
// indicate whether the beast is allowed to bring the dish to the feast.
//
//Assume that beast and dish are always lowercase strings, and that each has at least two letters.
// beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the string.
// They will not contain numerals.
public class FeastOfManyBeasts {
    public static boolean feast(String beast, String dish) {
        return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1) ?
                true : false;

    }
}

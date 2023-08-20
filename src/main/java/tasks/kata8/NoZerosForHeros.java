package tasks.kata8;

//Numbers ending with zeros are boring.
//They might be fun in your world, but not here.
//Get rid of them. Only the ending ones.
public class NoZerosForHeros {
    public static int noBoringZeros(int n) {
        return n == 0 ? n : Integer.parseInt(Integer.toString(n).replaceAll("0*$", ""));
    }
}

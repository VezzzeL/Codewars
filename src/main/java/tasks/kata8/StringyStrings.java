package tasks.kata8;

//write me a function stringy that takes a size and returns a string of alternating '1s' and '0s'.
//the string should start with a 1.
//a string with size 6 should return :'101010'.
//with size 4 should return : '1010'.
//with size 12 should return : '101010101010'.
//The size will always be positive and will only use whole numbers.
public class StringyStrings {
    public static String stringy(int size) {
        boolean temp = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (temp == true) {
                sb.append("1");
                temp = false;
            } else {
                sb.append("0");
                temp = true;
            }
        }
        return sb.toString();
    }
}

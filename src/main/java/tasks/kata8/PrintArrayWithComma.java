package tasks.kata8;

//Input: Array of elements
//["h","o","l","a"]
//Output: String with comma delimited elements of the array in th same order.
//"h,o,l,a"
public class PrintArrayWithComma {
    public static String printArray(Object[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}

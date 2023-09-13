package tasks.kata7;

//Kevin is noticing his space run out! Write a function that removes the spaces from the values and returns an array
// showing the space decreasing.
//For example, running this function on the array ['i', 'have','no','space'] would produce
// ['i','ihave','ihaveno','ihavenospace']
public class RunningOutSpace {
    public static String[] spacey(String[] array) {
        String[] res = new String[array.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            res[i] = sb.toString();
        }
        return res;
    }
}

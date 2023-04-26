package tasks.kata8;
//Take an array and remove every second element from the array. Always keep the first element
// and start removing with the next element.
public class RemovingElements {
    public static Object[] removeEveryOther(Object[] arr) {
        int j = 0;
        Object[] res = null;

        if (arr.length % 2 == 0) {
            res = new Object[arr.length/2];
        } else {
            res = new Object[(arr.length + 1)/2];
        }

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                res[j] = arr[i];
                j++;
            }
        }
        return res;
    }
}

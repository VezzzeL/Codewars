package tasks.kata7;

//Your task is to determine how many files of the copy queue you will be able to save into your Hard Disk Drive.
// The files must be saved in the order they appear in the queue.
public class FillHardDiskDrive {
    public static int save(int[] sizes, int hd) {
        int res = 0;
        for (int i : sizes) {
            if ((hd -= i) < 0) {
                break;
            }
            res++;
        }
        return res;
    }
}

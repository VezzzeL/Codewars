package tasks.kata7;

//Given two positive integers m (width) and n (height), fill a two-dimensional list (or array) of size m-by-n in
// the following way:
//(1) All the elements in the first and last row and column are 1.
//(2) All the elements in the second and second-last row and column are 2, excluding the elements from step 1.
//(3) All the elements in the third and third-last row and column are 3, excluding the elements from the previous steps.
//And so on ...
public class SpiralingBox {
    public static int[][] createBox(int width, int length) {
        if (width <= 0 || length <= 0) {
            return null;
        }

        int[][] box = new int[length][width];

        for (int i = 0; i < Math.min(width, length) + 1; i++) {
            int value = i + 1;
            int rowEnd = length - i;
            int colEnd = width - i;

            for (int row = i; row < rowEnd; row++) {
                for (int col = i; col < colEnd; col++) {
                    if (row == i || row == rowEnd - 1 || col == i || col == colEnd - 1) {
                        box[row][col] = value;
                    }
                }
            }
        }
        return box;
    }
}

package tasks.kata8;

import java.util.Arrays;

//Bob is bored during his physics lessons so he's built himself a toy box to help pass the time.
// The box is special because it has the ability to change gravity.
//There are some columns of toy cubes in the box arranged in a line.
// The i-th column contains a_i cubes. At first, the gravity in the box is pulling the cubes downwards.
// When Bob switches the gravity, it begins to pull all the cubes to a certain side of the box, d, which can be either
// 'L' or 'R' (left or right). Below is an example of what a box of cubes might look like before and
// after switching gravity.
public class GravityFlip {
    public static int[] flip(char dir, int[] arr) {
        if (dir == 'R') {
            Arrays.sort(arr);
        } else if (dir == 'L') {
            Arrays.sort(arr);
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        }
        return arr;
    }
}

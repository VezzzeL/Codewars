package tasks.kata8;

//Given a point in a Euclidean plane (x and y), return the quadrant the point exists in: 1, 2, 3 or 4 (integer).
// x and y are non-zero integers, therefore the given point never lies on the axes.
public class Quadrants {
    public static int quadrant(int x, int y) {
        return x < 0 ? y < 0 ? 3 : 2 : y < 0 ? 4 : 1;
    }
}

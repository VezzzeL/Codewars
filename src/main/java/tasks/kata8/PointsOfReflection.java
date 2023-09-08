package tasks.kata8;

import java.util.stream.IntStream;

//Given two points P and Q, output the symmetric point of point P about Q. Each argument is a two-element array of
// integers representing the point's X and Y coordinates. Output should be in the same format, giving the X and Y coordinates of point P1. You do not have to validate the input.
public class PointsOfReflection {
    public static int[] reflectPoint(int[] p, int[] q) {
        return IntStream.range(0, p.length)
                .mapToObj(i -> 2 * q[i] - p[i])
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

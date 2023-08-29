package tasks.kata8;

//The medians of a triangle are the segments that unit the vertices with the midpoint of their opposite sides. The three
// medians of a triangle intersect at the same point, called the barycenter or the centroid. Given a triangle, defined
// by the cartesian coordinates of its vertices we need to localize its barycenter or centroid.
public class BarycenterOfTriangle {
    public static double[] barTriang(double[] x, double[] y, double[] z) {
        return new double[]{
                Math.round(((x[0] + y[0] + z[0]) / 3) * 10000) / 10000.0,
                Math.round(((x[1] + y[1] + z[1]) / 3) * 10000) / 10000.0
        };
    }
}

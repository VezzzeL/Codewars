package tasks.kata8;

//You are given two interior angles (in degrees) of a triangle.
//Write a function to return the 3rd.
//Note: only positive integers will be tested.
public class ThirdAngleOfTriangle {
    public static int otherAngle(int angle1, int angle2) {
        return 180 - angle1 - angle2;
    }
}

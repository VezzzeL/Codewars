package tasks.kata8;

//Given an unsorted array of 3 positive integers [ n1, n2, n3 ], determine if it is possible to form a Pythagorean
// Triple using those 3 integers.
//A Pythagorean Triple consists of arranging 3 integers, such that:
//a^2 + b^2 = c^2
public class PythagoreanTriple {
    public int pythagoreanTriple(int[] triple) {
        return triple[0] * triple[0] + triple[1] * triple[1] == triple[2] * triple[2] ? 1 : 0;
    }
}

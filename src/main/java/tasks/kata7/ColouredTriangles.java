package tasks.kata7;

//A coloured triangle is created from a row of colours, each of which is red, green or blue.
// Successive rows, each containing one fewer colour than the last, are generated by considering the two
// touching colours in the previous row. If these colours are identical, the same colour is used in the new row.
// If they are different, the missing colour is used in the new row. This is continued until the final row, with only
// a single colour, is generated.
//The different possibilities are:
//Colour here:        G G        B G        R G        B R
//Becomes colour:      G          R          B          G
public class ColouredTriangles {
    public static char triangle(final String row) {
        char[] colors = row.toCharArray();
        int n = colors.length;
        while (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                colors[i] = getNewColor(colors[i], colors[i + 1]);
            }
            n--;
        }
        return colors[0];
    }

    private static char getNewColor(char c1, char c2) {
        if (c1 == c2) {
            return c1;
        } else if ((c1 == 'R' && c2 == 'G') || (c1 == 'G' && c2 == 'R')) {
            return 'B';
        } else if ((c1 == 'R' && c2 == 'B') || (c1 == 'B' && c2 == 'R')) {
            return 'G';
        } else {
            return 'R';
        }
    }
}

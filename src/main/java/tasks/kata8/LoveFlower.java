package tasks.kata8;

//Who remembers back to their time in the schoolyard, when girls would take a flower and tear its petals, saying each
// of the following phrases each time a petal was torn:
//"I love you"
//"a little"
//"a lot"
//"passionately"
//"madly"
//"not at all"
public class LoveFlower {
    public static String howMuchILoveYou(int nb_petals) {
        return switch ((nb_petals - 1) % 6) {
            case 1 -> "I love you";
            case 2 -> "a little";
            case 3 -> "a lot";
            case 4 -> "passionately";
            case 5 -> "madly";
            default -> "not at all";
        };
    }
}

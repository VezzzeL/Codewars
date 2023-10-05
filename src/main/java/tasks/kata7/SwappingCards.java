package tasks.kata7;

//Two players draw a pair of numbered cards so that both players can form a 2 digit number. A winner can be decided
// if one player's number is larger than the other.
//However, there is a rule where a player can swap any one of their cards with any one of the other player's cards in
// a gamble to get a higher number! Note that it is illegal to swap the order of your own cards. That means if you draw
// a 1 then a 9, you cannot swap them to get 91.
public class SwappingCards {
    public static boolean swapCards(int n1, int n2) {
        int m1 = n1 / 10, m2 = n1 % 10, o1 = n2 / 10, o2 = n2 % 10;
        return m1 <= m2 ? Integer.parseInt(String.valueOf(o1) + m2) > Integer.parseInt(String.valueOf(m1) + o2) :
                Integer.parseInt(String.valueOf(m1) + o1) > Integer.parseInt(String.valueOf(m2) + o2);
    }
}

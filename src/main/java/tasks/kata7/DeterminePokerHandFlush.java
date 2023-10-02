package tasks.kata7;

//Determine if the poker hand is flush, meaning if the five cards are of the same suit.
//Your function will be passed a list/array of 5 strings, each representing a poker card in the format "5H"
//(5 of hearts), meaning the value of the card followed by the initial of its suit (Hearts, Spades, Diamonds or Clubs).
// No jokers included.
//Your function should return true if the hand is a flush, false otherwise.
//The possible card values are 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A
public class DeterminePokerHandFlush {
    public static boolean CheckIfFlush(String[] cards) {
        if (cards.length != 5) return false;
        for (String card : cards) {
            if (card.charAt(card.length() - 1) != cards[0].charAt(cards[0].length() - 1)) return false;
        }
        return true;
    }
}

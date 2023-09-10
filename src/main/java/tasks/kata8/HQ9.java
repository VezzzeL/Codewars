package tasks.kata8;

//You task is to implement an simple interpreter for the notorious esoteric language HQ9+ that will work for a single
// character input:
//If the input is 'H', return 'Hello World!'
//If the input is 'Q', return the input
//If the input is '9', return the full lyrics of 99 Bottles of Beer. It should be formatted like this:
public class HQ9 {
    public static String HQ9(char code) {
        if (code == 'H') return "Hello World!";
        if (code == 'Q') return String.valueOf(code);
        if (code == '9') {
            StringBuilder lyrics = new StringBuilder();
            for (int i = 99; i > 2; i--) {
                lyrics.append(String.format("%d bottles of beer on the wall, %d bottles of beer.\n", i, i))
                        .append(String.format("Take one down and pass it around, %d bottles of beer on the wall.\n", i - 1));
            }
            lyrics.append("2 bottles of beer on the wall, 2 bottles of beer.\n")
                    .append("Take one down and pass it around, 1 bottle of beer on the wall.\n")
                    .append("1 bottle of beer on the wall, 1 bottle of beer.\n")
                    .append("Take one down and pass it around, no more bottles of beer on the wall.\n")
                    .append("No more bottles of beer on the wall, no more bottles of beer.\n")
                    .append("Go to the store and buy some more, 99 bottles of beer on the wall.");
            return lyrics.toString();
        }
        return null;
    }
}

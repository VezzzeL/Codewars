package tasks.kata8;

//Task: Given an array of Player objects (an array of associative arrays in PHP) and an index (1-based),
// return the name of the chosen Player(name is a property of Player objects, e.g Player.name)
public class DuckDuckGoose {
    private class Player {
        String name;

        public Player(String name) {
            this.name = name;
        }
    }

    public static String duckDuckGoose(Player[] players, int goose) {
        return players[(goose - 1) % players.length].name;
    }
}

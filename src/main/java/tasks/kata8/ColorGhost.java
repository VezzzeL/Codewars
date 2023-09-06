package tasks.kata8;

import java.util.Random;

//Create a class Ghost
//Ghost objects are instantiated without any arguments.
//Ghost objects are given a random color attribute of "white" or "yellow" or "purple" or "red" when instantiated
public interface ColorGhost {
    class Ghost {
        String getColor() {
            return switch (new Random().nextInt(4)) {
                case 0 -> "white";
                case 1 -> "yellow";
                case 2 -> "purple";
                default -> "red";
            };
        }
    }
}

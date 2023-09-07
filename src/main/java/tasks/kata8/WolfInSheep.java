package tasks.kata8;

//If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep". Otherwise, return "Oi!
// Sheep number N! You are about to be eaten by a wolf!" where N is the sheep's position in the queue.
//Note: there will always be exactly one wolf in the array.
public class WolfInSheep {
    public static String warnTheSheep(String[] array) {
        int wolfPosition = java.util.Arrays.asList(array).indexOf("wolf");
        return wolfPosition == array.length - 1 ? "Pls go away and stop eating my sheep" :
                String.format("Oi! Sheep number %s! You are about to be eaten by a wolf!",
                        array.length - wolfPosition - 1);
    }
}

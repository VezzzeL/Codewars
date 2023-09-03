package tasks.kata8;

//Create a function that gives a personalized greeting. This function takes two parameters: name and owner.
public class GrasshopperPersonalizedMessage {
    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}

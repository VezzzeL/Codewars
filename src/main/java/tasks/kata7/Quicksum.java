package tasks.kata7;

//A Quicksum is the sum of the products of each character’s position in the packet times the character’s value.
// A space has a value of zero, while letters have a value equal to their position in the alphabet.
public class Quicksum {
    public int quicksum(String packet) {
        if (packet.replaceAll("[A-Z\s]+", "").length() > 0) return 0;
        int quicksum = 0;
        for (int i = 0; i < packet.length(); i++) {
            if (packet.charAt(i) == ' ') {
                continue;
            }
            quicksum += (packet.charAt(i) - 'A' + 1) * (i + 1);
        }
        return quicksum;
    }
}

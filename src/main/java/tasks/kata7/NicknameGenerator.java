package tasks.kata7;

//Nickname Generator
//Write a function, nicknameGenerator that takes a string name as an argument and returns the first 3 or 4 letters as a nickname.
//If the 3rd letter is a consonant, return the first 3 letters.
//If the 3rd letter is a vowel, return the first 4 letters.
//If the string is less than 4 characters, return "Error: Name too short".
public class NicknameGenerator {
    public static String nickname(String name) {
        if (name.length() < 4) return "Error: Name too short";
        return switch (name.toUpperCase().charAt(2)) {
            case 'A', 'E', 'I', 'O', 'U' -> name.substring(0, 4);
            default -> name.substring(0, 3);
        };
    }
}

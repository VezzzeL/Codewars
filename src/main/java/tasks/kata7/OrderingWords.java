package tasks.kata7;

//Given a string, you need to write a method that order every letter in this string in ascending order.
//Also, you should validate that the given string is not empty or null. If so, the method should return:
public class OrderingWords {
    public String orderWord(String s) {
        if (s == null || s.length() == 0) return "Invalid String!";
        return s.chars().sorted().collect(
                        StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }
}

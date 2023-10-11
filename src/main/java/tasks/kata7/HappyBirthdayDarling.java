package tasks.kata7;

//As you may know, once some people pass their teens, they jokingly only celebrate their 20th or 21st birthday,
// forever. With some maths skills, that's totally possible - you only need to select the correct number base!
//For example, if they turn 32, that's exactly 20 - in base 16... Already 39? That's just 21, in base 19!
//Your task is to translate the given age to the much desired 20 (or 21) years, and indicate the number base,
// in the format specified below.
//Note: input will be always > 21
public class HappyBirthdayDarling {
    public static String womensAge(int n) {
        return String.format("%d? That's just %d, in base %d!", n, 20 + n % 2, n / 2);
    }
}

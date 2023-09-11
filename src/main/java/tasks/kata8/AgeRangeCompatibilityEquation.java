package tasks.kata8;

//Everybody knows the classic "half your age plus seven" dating rule that a lot of people follow (including myself).
// It's the 'recommended' age range in which to date someone.
public class AgeRangeCompatibilityEquation {
    public static String datingRange(int age) {
        return age <= 14 ? String.format("%d-%d", (int) (age - 0.1 * age), (int) (age + 0.1 * age)) :
                String.format("%d-%d", age / 2 + 7, (age - 7) * 2);
    }
}

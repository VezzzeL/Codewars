package tasks.kata7;

import java.util.Map;

//Every now and then people in the office moves teams or departments. Depending what people are doing with their time
// they can become more or less boring. Time to assess the current team.
//You will be provided with an array of Person objects with each instance containing the name and department for a
// staff member.
//Depending on the cumulative score of the team, return the appropriate sentiment:
//<=80: 'kill me now'
//< 100 & > 80: 'i can handle this'
//100 or over: 'party time!!'
public class BoredomScore {
    private static final Map<String, Integer> scorePerDepartment = Map.of(
            "accounts", 1,
            "finance", 2,
            "canteen", 10,
            "regulation", 3,
            "trading", 6,
            "change", 6,
            "IS", 8,
            "retail", 5,
            "cleaning", 4,
            "pissing about", 25
    );

    public static String boredom(Person[] staff) {
        int sum = 0;
        for (Person person : staff) {
            sum += scorePerDepartment.get(person.department);
        }
        return sum <= 80 ? "kill me now" : sum >= 100 ? "party time!!" : "i can handle this";
    }

    public class Person {
        public final String name;
        public final String department;

        public Person(String name, String department) {
            this.name = name;
            this.department = department;
        }
    }
}

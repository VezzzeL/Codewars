package tasks.kata8;
//We want to create a constructor function 'NameMe', which takes first name and last name as parameters. The function
// combines the first and last names and saves the value in "name" property.
//We already implemented that function, but when we actually run the code, the "name" property is accessible,
// but the "firstName" and "lastName" is not accessible. All the properties should be accessible. Can you find what's
// wrong with it? A test fixture is also available
public class ThisIsProblem {
    private String firstName, lastName, fullName;

    public ThisIsProblem(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        this.fullName = String.format("%s %s", first, last);
    }
}

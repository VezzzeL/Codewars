package tasks.kata8;

//Create a method that takes as input a name, city, and state to welcome a person. Note that name will be an array
// consisting of one or more values that should be joined together with one space between each, and the length of the
// name array in test cases will vary.
public class WelcomeToTheCity {
    public String sayHello(String[] name, String city, String state) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        for (int i = 0; i< name.length;i++){
            sb.append(name[i]);
            if(i!= name.length-1){
                sb.append(" ");
            }
        }
        return String.format("Hello, %s! Welcome to %s, %s!",sb,city,state);
    }
}

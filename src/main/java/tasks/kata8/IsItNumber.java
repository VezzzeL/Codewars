package tasks.kata8;
//Given a string s, write a method (function) that will return true if its a valid single
// integer or floating number or false if its not.
public class IsItNumber {
    public boolean isDigit(String s){
        return s.matches("[-+]?(\\d+(\\.\\d*)?|\\.\\d+)([eE][-+]?\\d+)?");
    }
}

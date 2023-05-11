package tasks.kata8;
//Create a function which translates a given DNA string into RNA.
//The input string can be of arbitrary length - in particular, it may be empty. All input is guaranteed to be valid,
// i.e. each input string will only ever consist of 'G', 'C', 'A' and/or 'T'.
public class DnaToRna {
    public String dnaToRna(String dna) {
        return dna.replaceAll("T", "U");
    }
}

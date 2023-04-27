package tasks.kata8;

import java.util.Locale;

//You received a whatsup message from an unknown number. Could it be from that girl/boy with a foreign accent you met yesterday evening?
//
//Write a simple function to check if the string contains the word hallo in different languages.
//
//These are the languages of the possible people you met the night before:
//
//hello - english
//ciao - italian
//salut - french
//hallo - german
//hola - spanish
//ahoj - czech republic
//czesc - polish
public class DidSheSayHallo {
    public static boolean validateHello(String greetings) {
        String[] keys = {"HELLO", "CIAO", "SALUT", "HALLO", "HOLA", "AHOJ", "CZESC"};
        String temp = greetings.toUpperCase();
        for (String s : keys) {
            if (temp.contains(s)) {
                return true;
            }
        }
        return false;
    }
}

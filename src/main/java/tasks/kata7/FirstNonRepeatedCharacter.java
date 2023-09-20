package tasks.kata7;

import java.util.LinkedHashMap;
import java.util.Map;

//You need to write a function, that returns the first non-repeated character in the given string.
//If all the characters are unique, return the first character of the string.
//If there is no unique character, return null in JS or Java, None in Python, '\0' in C.
//You can assume, that the input string has always non-zero length.
public class FirstNonRepeatedCharacter {
    public static Character firstNonRepeated(String source) {
        Map<Character, Long> charCount = source.chars()
                .mapToObj(c -> (char) c)
                .collect(
                        LinkedHashMap::new,
                        (map, c) -> map.merge(c, 1L, Long::sum),
                        LinkedHashMap::putAll
                );

        return charCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

}

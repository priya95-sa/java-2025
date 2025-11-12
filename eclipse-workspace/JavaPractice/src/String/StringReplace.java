
package String;
import java.util.*;

public class StringReplace {

    public static void main(String[] args) {

        String str = "PriyankaSatapathy";
        str = str.toLowerCase();

        Map<Character, Integer> charCount = new HashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        int vowelIndex = 0;
        StringBuilder result = new StringBuilder();

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // Replace repeated characters with vowels
        for (char ch : str.toCharArray()) {
            if (charCount.get(ch) > 1) {
                result.append(vowels[vowelIndex]);
                vowelIndex = (vowelIndex + 1) % vowels.length; // cycle through vowels
            } else {
                result.append(ch);
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + result.toString());
    }
}




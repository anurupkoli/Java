import java.util.HashMap;
import java.util.Map;

public class Sample {

    public static void main(String[] args) {
        String inputString = "This is an example string to find the most frequent vowel.";
        char mostFrequentVowel = findMostFrequentVowel(inputString);
        
        if (mostFrequentVowel != 0) {
            System.out.println("The most frequent vowel is '" + mostFrequentVowel + "'.");
        } else {
            System.out.println("No vowels found in the input string.");
        }
    }

    public static char findMostFrequentVowel(String s) {
        String vowels = "aeiou";
        // Create a map to store the count of each vowel
        Map<Character, Integer> vowelCount = new HashMap<>();

        // Initialize the map with vowels and their counts set to 0
        for (char v : vowels.toCharArray()) {
            vowelCount.put(v, 0);
        }

        // Iterate over each character in the string
        for (char ch : s.toLowerCase().toCharArray()) {
            if (vowelCount.containsKey(ch)) {
                vowelCount.put(ch, vowelCount.get(ch) + 1);
            }
        }

        // Find the vowel with the maximum count
        char mostFrequent = 0;
        int maxCount = 0;
        for (char v : vowels.toCharArray()) {
            if (vowelCount.get(v) > maxCount) {
                maxCount = vowelCount.get(v);
                mostFrequent = v;
            }
        }

        return mostFrequent;
    }
}

import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "This is a sample string to demonstrate word count using HashMap";

        // Remove leading and trailing whitespaces and split the string into words
        String[] words = str.trim().split("\\s+");

        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Count the occurrences of each word
        for (String word : words) {
            // Convert word to lowercase for case-insensitive counting
            String lowercaseWord = word.toLowerCase();
            
            // Update the count for the word in the HashMap
            wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
        }

        // Display the word count
        System.out.println("Word Count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
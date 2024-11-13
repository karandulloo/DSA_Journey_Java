package HashingTutorial.medium;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] array = {"eat", "tea", "ate", "bat", "tan", "nat"};

        // Step 1: Use a HashMap to group anagrams by their sorted character sequence
        HashMap<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : array) {
            // Step 2: Sort the string to form a canonical key
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);  // Sorted key

            // Step 3: Check if the sorted key is already in the map
            if (anagramGroups.containsKey(key)) {
                // If the key exists, add the string to the list associated with that key
                anagramGroups.get(key).add(str);
            } else {
                // If the key doesn't exist, create a new list and add the string
                List<String> anagramList = new ArrayList<>();
                anagramList.add(str);
                anagramGroups.put(key, anagramList);
            }
        }

        // Step 4: Convert the values (groups of anagrams) to a List of Lists
        List<List<String>> groupedAnagrams = new ArrayList<>(anagramGroups.values());

        // Print the result
        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }
}

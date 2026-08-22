package cognizant;

import java.util.LinkedHashMap;
import java.util.LinkedHashMap;

public class FrequencyOfFrequency {

    public static int findMaxFrequency(int n, String s) {

        // Character -> frequency
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        // Frequency -> number of characters having that frequency
        LinkedHashMap<Integer, Integer> map1 = new LinkedHashMap<>();

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Count how many characters have each frequency
        for (char ch : map.keySet()) {
            int frequency = map.get(ch);
            map1.put(frequency, map1.getOrDefault(frequency, 0) + 1);
        }

        int max = -1;
        int res = Integer.MAX_VALUE;

        // Find the frequency which occurs most often
        // If tied, choose the smaller frequency
        for (int frequency : map1.keySet()) {

            int curr = map1.get(frequency);

            if (curr > max) {
                max = curr;
                res = frequency;
            } else if (curr == max) {
                res = Math.min(res, frequency);
            }
        }

        return res;
    }

    public static void main(String[] args) {

        String s1 = "ACABABCCA";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Output: " + findMaxFrequency(s1.length(), s1));
        // Expected: 2

        String s2 = "ACABDDABDCDACFAEGFDA";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Output: " + findMaxFrequency(s2.length(), s2));
        // Expected: 1
    }
}

package cognizant;

import java.util.HashMap;

public class StringOccurrenceCounter {
    public static int countOccurrences(String input1, String input2) {
        int count = 0;
        String arr[] = input1.split("\\s+");

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0; i < arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for (String s : map.keySet()){
            if(s.equals(input2)){
                count=map.get(s);
            }
        }

      return count;
    }

    public static void main(String[] args) {
        // Test Case 1 (From Question)
        String input1 = "Always Joe in Friends Joe with Joe Joe";
        String input2 = "Joe";

        System.out.println("--- Test Case 1 ---");
        System.out.println("String 1: " + input1);
        System.out.println("String 2: " + input2);
        System.out.println("Output: " + countOccurrences(input1, input2));
        // Expected Output: 4

        // Test Case 2 (Custom Test Case)
        String input1_2 = "apple banana apple orange apple";
        String input2_2 = "apple";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("String 1: " + input1_2);
        System.out.println("String 2: " + input2_2);
        System.out.println("Output: " + countOccurrences(input1_2, input2_2));
        // Expected Output: 3
    }
}

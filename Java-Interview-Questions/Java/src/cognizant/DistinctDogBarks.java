package cognizant;

import java.util.HashSet;

public class DistinctDogBarks {
    public static int countDistinctDogs(String s) {
        String arr[] = s.split("\\.+");
        HashSet<String> hs = new HashSet<>();
        for (String i : arr){
            if(!i.isEmpty()){
                hs.add(i);
            }
        }
        return hs.size();
    }

    public static void main(String[] args) {
        // Test Case 1 (From Image)
        String input1 = "B...B...BB...B....BBB";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + countDistinctDogs(input1));
        // Expected Output: 3

        // Test Case 2 (Custom Test Case)
        String input2 = "BB.B.BBB.BB.BB.B";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + countDistinctDogs(input2));
        // Expected Output: 3 (B, BB, BBB)

        // Test Case 3 (Custom Test Case - Edge Case empty dots)
        String input3 = "....";
        System.out.println("\n--- Test Case 3 ---");
        System.out.println("Input: " + input3);
        System.out.println("Output: " + countDistinctDogs(input3));
        // Expected Output: 0
    }
}

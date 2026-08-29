package cognizant;

public class AlphabetMappingCount {
    public static int countValidMappings(String s) {

       int count = s.length();

       for(int i=0; i < s.length()-1; i++){
           String pair = s.substring(i,i+1);
           int num = Integer.parseInt(pair);
           if(num <= 26)count++;
       }

       return count;
    }

    public static void main(String[] args) {
        // Test Case 1
        String input1 = "226";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + countValidMappings(input1));
        // Expected Output: 5

        // Test Case 2
        String input2 = "11292";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + countValidMappings(input2));
        // Expected Output: 7
    }
}

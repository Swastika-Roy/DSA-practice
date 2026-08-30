package cognizant;

public class MagicBoard {

    public static String getMagicCharacters(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < digits.length; i++){
            sb.append((char) digits[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // Test Case 1 (From Question)
        int[] input1 = {65, 66, 67, 68};
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: 65, 66, 67, 68");
        System.out.println("Output: " + getMagicCharacters(input1));
        // Expected Output: ABCD

        // Test Case 2 (Custom Test Case - Small letters)
        int[] input2 = {112, 97, 115, 115};
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: 112, 97, 115, 115");
        System.out.println("Output: " + getMagicCharacters(input2));
        // Expected Output: pass
    }
}

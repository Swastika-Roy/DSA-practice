package cognizant;

public class amazoncryptography {
    public static String generateBarcode(String s, int key) {

        char arr[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < arr.length; i++){
            int no = Integer.parseInt(String.valueOf(arr[i]));
            no+=key;
            if(no < 10)sb.append(no);
            else sb.append((char)('A'+no-10));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // Test Case 1 (From Image)
        String orderNumber1 = "46734";
        int key1 = 2;
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + orderNumber1 + ", " + key1);
        System.out.println("Output: " + generateBarcode(orderNumber1, key1));
        // Expected Output: 68956

        // Test Case 2 (Custom for Alphabets)
        String orderNumber2 = "89";
        int key2 = 3;
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: " + orderNumber2 + ", " + key2);
        System.out.println("Output: " + generateBarcode(orderNumber2, key2));
        // Expected Output: BC
    }
}

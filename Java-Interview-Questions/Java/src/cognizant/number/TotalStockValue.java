package cognizant.number;

public class TotalStockValue {
    public static int calculateTotalValue(String input1) {
      String arr[] = input1.split(";");

      int totalval = 0;

      for (int i=0; i < arr.length; i++){
          String details[] = arr[i].split(":");
          int price = Integer.parseInt(details[1]);
          int quantity = Integer.parseInt(details[2]);
          totalval += price*quantity;
      }

      return totalval;
    }

    public static void main(String[] args) {
        // Test Case 1
        String input1 = "Apple:250:10;Banana:120:15;Orange:300:5";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + calculateTotalValue(input1));
        // Expected Output: 5800

        // Test Case 2
        String input2 = "Pen:10:50;Pencil:5:100;Eraser:3:20";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + calculateTotalValue(input2));
        // Expected Output: 1060
    }
}

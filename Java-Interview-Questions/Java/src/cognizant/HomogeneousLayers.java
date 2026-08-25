package cognizant;

public class HomogeneousLayers  {
    public static int countHomogeneousLayers(String s) {
        int count = 0;
        int layersize = 1;
        int i=0;
        while(i+layersize<=s.length()){
            String layer = s.substring(i,i+layersize);
            if(isHomogeneous(layer))count++;
            i+=layersize;
            layersize++;
        }
        return count;
    }

    public static boolean isHomogeneous(String layer) {
        char ch = layer.charAt(0);
        for(int i=1; i < layer.length();i++){
            if(layer.charAt(i)!=ch)return false;
        }
         return true;
    }

    public static void main(String[] args) {
        // Test Case 1 (From Image)
        String input1 = "aaabbbcccdddddd";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + countHomogeneousLayers(input1));
        // Expected Output: 4

        // Test Case 2 (Custom Test Case)
        String input2 = "abcccd";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + countHomogeneousLayers(input2));
        // Expected Output: 1
        // Explanation:
        // L1: "a" (Yes)
        // L2: "bc" (No)
        // L3: "ccd" (No)
        // Only 1 homogeneous layer formed.
    }
}

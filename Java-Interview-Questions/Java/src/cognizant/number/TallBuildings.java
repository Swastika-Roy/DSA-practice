package cognizant.number;

public class TallBuildings {
    public static int sumOfTallBuildings(int N, int[] arr, int D) {
        int sum = 0;
        for (int i=0; i < arr.length; i++){
           boolean leftOk = (i-D < 0 || arr[i] > arr[i-D]);
           boolean rightOk = (i+D >= N || arr[i] > arr[i+D]);

            if(leftOk && rightOk)sum+=arr[i];
        }
      return sum;
    }
    public static void main(String[] args) {
        // Test Case 1
        int N1 = 6;
        int[] H1 = {1, 3, 2, 1, 5, 4};
        int D1 = 2;
        System.out.println("Output: " + sumOfTallBuildings(N1, H1, D1));
        // Expected Output: 12
    }
}

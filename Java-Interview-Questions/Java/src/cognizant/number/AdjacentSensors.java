package cognizant.number;

import java.util.Arrays;

public class AdjacentSensors {
    public static int[] countGreaterAdjacent(int N, int[] arr) {
       int res[] = new int[N];

       int leftmax =0; int rightmax=0;
        for (int i=0; i < N; i++){
            int count=0;
            if(i==0){
                leftmax=arr[N-1];
                rightmax=arr[1];
            }
            else if(i==N-1){
                leftmax=arr[N-2];
                rightmax=arr[0];
            }else {
                leftmax=arr[i-1];
                rightmax=arr[i+1];
            }
            if(arr[i]<leftmax)count++;
            if(arr[i]<rightmax)count++;
            res[i]=count;
        }
        return res;
    }

    public static void main(String[] args) {
        // Test Case 1 (From Image)
        int input1 = 5;
        int[] input2 = {10, 15, 12, 9, 14};

        System.out.println("--- Test Case 1 ---");
        System.out.println("Input Array: " + Arrays.toString(input2));

        int[] output = countGreaterAdjacent(input1, input2);
        System.out.println("Output: " + Arrays.toString(output));
        // Expected Output: [2, 0, 1, 2, 0]
    }
}

package cognizant.number;

import java.util.HashMap;

public class LoanWaiver {
    public static int waiveOffLoan(int N, int[][] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for (int i=0; i < N; i++){
            for (int j=0; j < N ; j++){
                mp.put(arr[i][j],mp.getOrDefault(arr[i][j],0)+1);
            }
        }

       int min = Integer.MAX_VALUE;

        for (int a : mp.keySet()){
            if(mp.get(a)==1 && a > 0)min = Math.min(a,min);
        }

        return (min==Integer.MAX_VALUE) ? -1 : min;
    }

    public static void main(String[] args) {
        // Test Case 1
        int input1 = 3;
        int[][] input2 = {
                {-1, 1, 3},
                {2, 3, 4},
                {3, 4, 5}
        };

        System.out.println("--- Test Case 1 ---");
        System.out.println("Output: " + waiveOffLoan(input1, input2));
        // Expected Output: 1
    }
}

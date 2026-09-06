package Cognizant.Array;

import java.util.Arrays;

/**
 * 📝 Problem: Optimum Time for Nailing
 *
 * Problem Statement:
 * Find the minimum time to drive all nails using Single Mode (X beats/min on 1 nail)
 * or Dynamic Mode (1 beat/min on all nails).
 */
public class CarpenterRobot {

    public static int getOptimumTime(int N, int X, int[] S) {

        // 1. Shobtheke boro perek-ta koto boro seta ber kor (max_size)
        // (Eta korle amader limit ta jana thakbe)


        int sum = 0;
        int max = -1;
        //single mode
        for (int i=0; i < S.length; i++){
            sum += (S[i]+X-1)/X;
            max=Math.max(max,S[i]);
        }



        return Math.min(sum,max);

        // 2. Amra check korbo 0 theke max_size obdi protita minute-e
        // Dynamic mode use korle ki hoy.
        // Dhor, amra 'd' minutes Dynamic mode use korlam.
        // for (int d = 0; d <= max_size; d++) { ... }

        // 3. d minutes Dynamic mode korle total time = d
        // 4. Ebar baki perek gulo Single mode-e korte koto time lagbe?
        //    - Ekta loop chala sob perek-er upor.
        //    - Baki size = max(0, perek_size - d)
        //    - Ei baki size-ta Single mode-e dhokate koto time lagbe?
        //      Hint: aager moto ceil korar technique (baki_size + X - 1) / X
        // 5. Total time = d + sum of Single mode times.
        // 6. minTotalTime update kor.


    }

    public static void main(String[] args) {
        int input1 = 5;
        int input2 = 4;
        int[] input3 = {2, 2, 4, 1, 1};

        System.out.println("Output: " + getOptimumTime(input1, input2, input3));
        // Expected Output: 4
    }
}

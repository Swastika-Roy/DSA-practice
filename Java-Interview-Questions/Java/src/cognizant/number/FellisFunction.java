package Cognizant.Number;

/**
 * 📝 Problem: Fellis Function
 *
 * Problem Statement:
 * Morris Fellis defines a function f(N) as follows:
 * - f(0) = 1
 * - f(1) = 1
 * - f(N) = (f(N-1) + 7 * f(N-2) + (N/4)) modulo (10^9 + 7)
 *
 * Given an integer N, return the integer value of f(N).
 * Note: Division operator (N/4) is integer division (returns the integer part).
 */
public class FellisFunction {

    public static int getFellisValue(int N) {

        // 1. Base cases: N=0 ba N=1 hole direct 1 return hobe
        if (N == 0) return 1;
        if (N == 1) return 1;

        // 2. Modulo-r value
        long mod = 1000000007;

        // 3. Array banalam purono value gulo mone rakhar jonno
        long[] arr = new long[N + 1];

        // 4. Initial values set korlam
        arr[0] = 1;
        arr[1] = 1;

        // 5. Loop chaliye 2 theke N obdi baki value gulo ber korchi
        for (int i = 2; i <= N; i++) {
            long t1 = arr[i - 1];
            long t2 = 7 * arr[i - 2];
            long t3 = (i / 4);

            // ⚠️ BRACKET MUST: Aage total jog, tarpor purotar opor modulo
            arr[i] = (t1 + t2 + t3) % mod;
        }

        // 6. Shesher result-ta int-e cast kore return korlam
        return (int) arr[N];
    }

    public static void main(String[] args) {
        // Test Case 1
        System.out.println("Output for N=3 : " + getFellisValue(3));
        // Expected: 15

        // Test Case 2
        System.out.println("Output for N=1 : " + getFellisValue(1));
        // Expected: 1

        // Custom Test Case
        System.out.println("Output for N=4 : " + getFellisValue(4));
        // Expected: 72
        // f(4) = f(3) + 7*f(2) + (4/4) = 15 + 7(8) + 1 = 72
    }
}
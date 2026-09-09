package cognizant.number;

/**
 * 📝 Problem: Flipkart Virus (Tribonacci Series)
 *
 * Problem Statement:
 * Flipkart has been infected with a virus. Each user that has been infected with
 * the virus is traced by a special algorithm and a hint that the virus gives.
 * The virus leaves a hint number N. Flipkart is able to identify the user ID of
 * the virus by this N number as the user ID works as a series:
 * Each number in the series is the sum of the last three numbers in the series.
 * The first three numbers in the series are 0, 0, 1 always.
 *
 * Write a program to identify the user ID infected based on the N value checked
 * from the logs of the system.
 *
 * Input:
 * The input contains the N value left by the virus.
 *
 * Output:
 * Print the userID of the infected user.
 */
public class FlipkartVirus {

    public static long getUserID(int N) {

        // 1. Base cases for early return and preventing Array Index Out of Bounds
        if (N == 1) return 0;
        if (N == 2) return 0;
        if (N == 3) return 1;

        // 2. Array size (N+1) to support 1-based indexing directly up to N
        long[] arr = new long[N + 1];

        // 3. Initializing the first three terms explicitly
        arr[1] = 0;
        arr[2] = 0;
        arr[3] = 1;

        // 4. Loop starting from 4th term up to N (using i <= N for readability)
        for (int i = 4; i <= N; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }

        // 5. Returning the exact N-th index
        return arr[N];
    }

    public static void main(String[] args) {

        // Test cases ready for validation
        System.out.println("Output for N = 1 : " + getUserID(1)); // Expected: 0
        System.out.println("Output for N = 3 : " + getUserID(3)); // Expected: 1
        System.out.println("Output for N = 4 : " + getUserID(4)); // Expected: 1
        System.out.println("Output for N = 5 : " + getUserID(5)); // Expected: 2
        System.out.println("Output for N = 6 : " + getUserID(6)); // Expected: 4
        System.out.println("Output for N = 7 : " + getUserID(7)); // Expected: 7
    }
}
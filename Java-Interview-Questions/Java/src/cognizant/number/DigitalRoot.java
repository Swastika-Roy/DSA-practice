package Cognizant.Number;

/**
 * 📝 Problem: Digital Root (Single Digit Sum)
 *
 * Problem Statement:
 * Given a number N, repeatedly sum its digits until the result
 * becomes a single-digit number (less than 10).
 * Return that single-digit number.
 */
public class DigitalRoot {

    public static int getSingleDigit(int N) {

        // Jotokhon number-ta 10 ba tar theke boro aache (mane single digit noy)
        while (N >= 10) {
            int sum = 0;

            // Number-tar bhitor theke protita digit alada kore jog kora
            while (N != 0) {
                int lastDigit = N % 10; // Shesher digit-ta ber korlam
                sum += lastDigit;       // Seta sum-er sathe jog korlam
                N = N / 10;             // Shesher digit-ta kete bad dilam
            }

            // Puro number-tar sum ber kora hoye geche,
            // ebar ashol number-take oi sum diye update kore dilam
            N = sum;
        }

        return N; // Sheshe jokhon N 10 er theke choto hobe, tokhon return hobe
    }

    public static void main(String[] args) {
        // Test Case 1 (From Image)
        int input1 = 38;
        System.out.println("--- Test Case 1 ---");
        System.out.println("Output: " + getSingleDigit(input1));
        // Expected Output: 2

        // Test Case 2 (From Image)
        int input2 = 41;
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Output: " + getSingleDigit(input2));
        // Expected Output: 5
    }
}
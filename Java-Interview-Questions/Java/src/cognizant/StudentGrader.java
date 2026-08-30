package cognizant;

/**
 * 📝 Problem: ABS School Grading System
 *
 * Problem Statement:
 * ABS School wants to provide grades to students according to their marks.
 * Their Grading Policy is as follows:
 * Marks
 * 10-40 = F
 * 41-50 = C
 * 51-60 = B
 * 61-80 = A
 * 81-100 = S
 * All other inputs print "invalid"
 *
 * Input Format:
 * Total number of inputs (N)
 * List of marks (space-separated)
 *
 * Output Format:
 * List of grades (space-separated)
 *
 * Example:
 * Input:
 * 5
 * 81 61 51 41 11
 *
 * Output:
 * S A B C F
 */
public class StudentGrader {

    public static String getGrades(int n, int[] arr) {
        StringBuilder sb = new StringBuilder();
        for(int i : arr){
            if(i >= 10 && i <=40) sb.append('F').append(' ');
            else if(i >= 41 && i <=50) sb.append('C').append(' ');
            else if(i >= 51 && i <=60) sb.append('B').append(' ');
            else if(i >= 61 && i <=80) sb.append('A').append(' ');
            else if(i >= 81 && i <=100) sb.append('S').append(' ');
            else sb.append("invalid").append(' ');
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        // Test Case 1 (From Question)
        int n1 = 5;
        int[] marks1 = {81, 61, 51, 41, 11};
        System.out.println("--- Test Case 1 ---");
        System.out.println("Output: " + getGrades(n1, marks1));
        // Expected Output: S A B C F

        // Test Case 2 (Custom Test Case with Invalid inputs)
        int n2 = 4;
        int[] marks2 = {45, 5, 105, 90};
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Output: " + getGrades(n2, marks2));
        // Expected Output: C invalid invalid S
    }
}

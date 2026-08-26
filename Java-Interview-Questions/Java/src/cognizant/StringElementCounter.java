package cognizant;

import java.util.Scanner;
/**

 * 📝 Problem: Count elements of string

 *

 * Problem Statement:

 * Write a program to count the number of digits, special characters, whitespaces, and

 * alphabets in a string. Print the count of each in the same order, one per line.

 *

 * Input Specification:

 * first line takes the input of a sentence

 *

 * Output Specification:

 * Print the count of each element type:

 * Alphabets - [count]

 * Digits - [count]

 * Space - [count]

 * Special Character - [count]

 *

 * Example 1:

 * Input : Amcatuff@ #% 123

 * Output :

 * Alphabets - 8

 * Digits - 3

 * Space - 2

 * Special Character - 3

 */

public class StringElementCounter {
    public static void countElements(String s) {
        int countalpha=0;
        int countdigit=0;
        int countspace=0;
        int countspecial=0;

        for(int i=0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i)))countalpha++;
            else if(Character.isDigit(s.charAt(i)))countdigit++;
            else if(Character.isSpaceChar(s.charAt(i)))countspace++;
            else countspecial++;
        }

        System.out.println("space="+countspace);
        System.out.println("alpha="+countalpha);
        System.out.println("digit="+countdigit);
        System.out.println("special="+countspecial);
    }

    public static void main(String[] args) {
        // Test Case 1: Standard mixed input (Sample Case)
        System.out.println("--- Test Case 1 ---");
        String input1 = "Amcatuff@ #% 123";
        System.out.println("Input: " + input1);
        countElements(input1);
        System.out.println();

        // Test Case 2: Only Alphabets
        System.out.println("--- Test Case 2 ---");
        String input2 = "Cognizant";
        System.out.println("Input: " + input2);
        countElements(input2);
        System.out.println();

        // Test Case 3: Only Digits and Spaces
        System.out.println("--- Test Case 3 ---");
        String input3 = "123 456 789";
        System.out.println("Input: " + input3);
        countElements(input3);
        System.out.println();

        // Test Case 4: Only Special Characters
        System.out.println("--- Test Case 4 ---");
        String input4 = "@#$%^&*!";
        System.out.println("Input: " + input4);
        countElements(input4);
        System.out.println();

        // Test Case 5: Sentence with Punctuation
        System.out.println("--- Test Case 5 ---");
        String input5 = "Hello, World! 2026.";
        System.out.println("Input: " + input5);
        countElements(input5);
        System.out.println();

        // Test Case 6: Empty String
        System.out.println("--- Test Case 6 ---");
        String input6 = "";
        System.out.println("Input: (empty string)");
        countElements(input6);
    }
}

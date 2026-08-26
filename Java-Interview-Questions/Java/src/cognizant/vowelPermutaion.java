    package cognizant;

public class vowelPermutaion {
        public static int solve(String s) {
          char arr[] = s.replaceAll("[aeiouAEIOU]","")
                  .toCharArray();
          int cons = arr.length;
          if(cons==0)return 0;
          int fact = 1;
          for (int i=2; i <= cons; i++){
              fact *= i;
          }
          return fact;
        }

        public static void main(String[] args) {
            // Test Case 1
            System.out.println("Input: ABC -> Output: " + solve("ABC")); // Expected: 2

            // Test Case 2
            System.out.println("Input: CDF -> Output: " + solve("CDF")); // Expected: 6

            // Test Case 3 (Edge case with no consonants)
            System.out.println("Input: AEIOU -> Output: " + solve("AEIOU")); // Expected: 0

            // Test Case 4 (Mix case)
            System.out.println("Input: aBcDe -> Output: " + solve("aBcDe")); // Expected: 6
        }
    }


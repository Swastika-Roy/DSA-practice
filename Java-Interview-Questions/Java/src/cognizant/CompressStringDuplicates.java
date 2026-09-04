package cognizant;

public class CompressStringDuplicates {

    public static String compressString(String s) {
          StringBuilder sb = new StringBuilder();

          int n = s.length();

          for(int i=0; i < n; i++){
              char currentchar = s.charAt(i);
              int count = 1;

              while (i + 1 < n && s.charAt(i+1)==currentchar){
                  count++;
                  i++;
              }

              if(count == 1)sb.append(currentchar);
              else{
                  if(sb.length()==0 || sb.charAt(sb.length()-1) != '#')sb.append('#');
              }


          }
          return sb.toString();

    }
    public static void main(String[] args) {
        // Test Case 1
        String input1 = "aabbbccdeeea";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + compressString(input1));
        // Expected Output: #d#a

        // Test Case 2 (Custom: Starts and ends with duplicates)
        String input2 = "xxxyyzz";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + compressString(input2));
        // Expected Output: #
    }
}

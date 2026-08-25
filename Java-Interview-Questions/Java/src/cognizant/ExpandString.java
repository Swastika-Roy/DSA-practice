package cognizant;

public class ExpandString {
    public static String formatString(String s) {

       StringBuilder sb = new StringBuilder();

       for(int i=0; i < s.length(); i++){

           int count = s.indexOf(s.charAt(i)) + 1;

           for(int j=0; j < count; j++){
               sb.append(s.charAt(i));
           }

           if(i < s.length()-1) sb.append('-');
       }

       return sb.toString();
    }

    public static void main(String[] args) {
        String test1 = "abcaba";
        String test2 = "hello";

        System.out.println("--- Test Case 1 ---");
        System.out.println(formatString(test1)); // Expected: a-bb-ccc-a-bb-a

        System.out.println("\n--- Test Case 2 ---");
        System.out.println(formatString(test2)); // Expected: h-ee-lll-lll-ooooo
    }
}

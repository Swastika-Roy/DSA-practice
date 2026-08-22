package cognizant;

public class StringMatching {
    public static int findSubstringIndex(String text, String pattern) {
//        // That's it. This single line does exactly what the problem asks!
//        return text.indexOf(pattern);
        int tl = text.length();
        int pl = pattern.length();

        if (pl > tl) return -1;

        for (int i = 0; i <= tl - pl; i++) {
            String part = text.substring(i, i + pl);
            if (part.equals(pattern)) return i;
        }
        return -1;
    }



    public static void main(String[] args) {
        String text1 = "cognizant";
        String pattern1 = "zan";

        String text2 = "ulmind";
        String pattern2 = "tech";

        String text3 = "hello";
        String pattern3 = "ll";

        String text4 = "cognizant";
        String pattern4 = "ant";

        System.out.println("--- Test Case 1 ---");
        System.out.println("Output: " + findSubstringIndex(text1, pattern1));
        // Expected: 5

        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Output: " + findSubstringIndex(text2, pattern2));
        // Expected: -1

        System.out.println("\n--- Test Case 3 ---");
        System.out.println("Output: " + findSubstringIndex(text3, pattern3));
        // Expected: 2

        System.out.println("\n--- Test Case 4 (Edge Case) ---");
        System.out.println("Output: " + findSubstringIndex(text4, pattern4));
        // Expected: 6
    }
}



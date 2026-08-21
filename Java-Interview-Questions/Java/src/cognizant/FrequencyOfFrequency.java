package cognizant;

import java.util.LinkedHashMap;

public class FrequencyOfFrequency {
    public static int findMaxFrequency(int n, String s) {
        LinkedHashMap<Character,Integer> map1 = new LinkedHashMap<>();
        LinkedHashMap<Integer,Integer> map2 = new LinkedHashMap<>();

        char arr[] = s.toCharArray();

        for(char ch : arr){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

        for(char ch : map1.keySet()){
            map2.put(map1.get(ch),map1.getOrDefault(map1.get(ch),0)+1);
        }

        int max=-1;
        int res = Integer.MAX_VALUE;

        for (int i : map2.keySet()){
            int curr = map2.get(i);

           if(curr > max){
               max = curr;
               res = i;
           }
           if(curr == max){
               res = Math.min(i,res);
           }
        }
        return res;
    }

    public static void main(String[] args) {
        // Test Case 1
        String s1 = "ACABABCCA";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Output: " + findMaxFrequency(s1.length(), s1));
        // Expected Output: 2

        // Test Case 2
        String s2 = "ACABDDABDCDACFAEGFDA";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Output: " + findMaxFrequency(s2.length(), s2));
        // Expected Output: 1
    }
}

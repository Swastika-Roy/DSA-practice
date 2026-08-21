package cognizant;

import java.util.LinkedHashMap;

public class RepeatingCharacters {
    public static void findRepeating(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();
        char arr[] = s.toCharArray();

        for(char ch : arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (char ch : map.keySet()){
            if(map.get(ch) > 1) {
                sb.append(ch).append(' ');
            }
        }

        System.out.println(sb.toString().trim());

    }



    public static void main(String[] args) {
        String test1 = "programming";
        String test2 = "cognizant";

        System.out.println("--- Test Case 1 ---");
        findRepeating(test1); // Expected: r g m

        System.out.println("\n--- Test Case 2 ---");
        findRepeating(test2); // Expected: n
    }

//    LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
//
//    char arr[] = s.toCharArray();
//
//    StringBuilder sb = new StringBuilder();
//
//        for(char ch : arr){
//        map.put(ch,map.getOrDefault(ch,0)+1);
//    }
//
//        for(char ch: map.keySet()){
//        if(map.get(ch)>1){
//            sb.append(ch).append(' ');
//        }
//    }
//        System.out.println(sb.toString().trim());
}

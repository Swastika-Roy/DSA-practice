package cognizant;

import java.util.LinkedHashMap;

public class PrintFrequencyOfEachChar {

    public static String printFrequency(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();
        char arr[] = s.toCharArray();

        for(char ch : arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (char ch:arr){
            sb.append(ch).append('=').append(map.get(ch)).append('\n');
        }

        return sb.toString().trim();
    }



    public static void main(String[] args) {
        String test1 = "apple";
        String test2 = "cognizant";

        System.out.println( printFrequency(test1));


        System.out.println("\n--- Test Case 2: " + test2 + " ---");
        printFrequency(test2);
    }
}


//LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
//char arr[] = s.toCharArray();
//StringBuilder sb = new StringBuilder();
//
//        for(char ch : arr){
//        map.put(ch,map.getOrDefault(ch,0)+1);
//        }
//
//        for(char ch : map.keySet()){
//        sb.append(ch).append('=').append(map.get(ch)).append('\n');
//        }
//
//
//                return sb.toString();

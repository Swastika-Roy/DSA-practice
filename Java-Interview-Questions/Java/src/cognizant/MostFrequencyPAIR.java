package cognizant;

import java.util.LinkedHashMap;

public class MostFrequencyPAIR {
    public static String findMostFrequentPair(String s) {
        LinkedHashMap<String,Integer> mp = new LinkedHashMap<>();

        String[] words = s.split(" ");

        for (String word : words ){
            char f = word.charAt(0);
            char l = word.charAt(word.length()-1);
            String pair = f + "" + l;
            mp.put(pair,mp.getOrDefault(pair,0)+1);
        }

        int maxfre = 0;
        String res = "";

        for(String word : mp.keySet()){
           int currfre = mp.get(word);
           if(currfre > maxfre){
               maxfre=currfre;
               res=word;
           }
        }
        return res;
    }

    public static void main(String[] args) {
        String input1 = "she is good grid god and ground player plotter";
        System.out.println("Output: " + findMostFrequentPair(input1));
        // Expected Output: gd
    }

}

import java.util.*;

public class FindDuplicateCharacter {
    public static void DuplicateChar(String str){
       char[] ch = str.toCharArray();
       StringBuilder sb = new StringBuilder();

       Set<Character> s1 = new HashSet<>();
       Set<Character> s2 = new HashSet<>();

       for(int i=0; i < ch.length;i++){
           if(!s1.contains(ch[i])){
               s1.add(ch[i]);
           }else {
               if(!s2.contains(ch[i])){
                   s2.add(ch[i]);
               }
           }
       }

       for(char word : s2){
      if(word == ' '){
continue;   }sb.append(word);
   }System.out.println(sb.toString());
}
    public static void main(String[] args) {
        DuplicateChar("Learn Java Programming");
    }
}
//target
//a g m n r


//char[] ch = str.toCharArray();
//
//StringBuilder sb = new StringBuilder();
//Set<Character> set1 = new TreeSet<>();
//
//Set<Character> set2 = new TreeSet<>();
//        for(int i = 0 ; i<ch.length ; i++){
//        if(!set1.contains(ch[i])){
//        set1.add(ch[i]);
//            }else{
//                    if (!set2.contains(ch[i])){
//        set2.add(ch[i]);
//                }
//                        }
//                        }
//                        for (char word : set2){
//        if (word == ' '){
//        continue;
//        }
//        sb.append(word);
//        }
//                System.out.println(sb.toString());
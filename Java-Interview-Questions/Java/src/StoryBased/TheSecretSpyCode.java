package StoryBased;

import java.util.Scanner;

//public class TheSecretSpyCode {
//
//    public static long findSecretCode(String s) {
//        // Write your code here
//        String helper = "";
//        long sum = 0;
//        for(int i = 0 ; i<s.length() ; i++){
//            if(Character.isDigit(s.charAt(i))){
//                helper += String.valueOf(s.charAt(i));
//            }else{
//                if(!helper.equals("")){
//                    sum += Long.parseLong(helper);
//                }
//                helper = "";
//            }
//        }
//        //sum again without this not all test cases will run
//        if(!helper.equals("")){
//            sum += Long.parseLong(helper);
//        }
//
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String S = sc.nextLine();
//        System.out.println(findSecretCode(S));
//        sc.close();
//    }
//}

public class TheSecretSpyCode {
    public static long decrypt(String S) {
     long sum = 0;
     long currentNum = 0;
     boolean innumber = false;

     for (char ch : S.toCharArray()){
         if(Character.isDigit(ch)){
             currentNum = currentNum * 10 + (ch - '0');
             innumber = true;
         }else {
             if (innumber){
                 sum += currentNum;
                 currentNum = 0;
                 innumber = false;
             }
         }
     }
     if(innumber){
         sum += currentNum;
     }
     return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(decrypt(S));
        sc.close();
    }
}


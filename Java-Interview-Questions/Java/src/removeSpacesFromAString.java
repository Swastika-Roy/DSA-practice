public class removeSpacesFromAString {
    public static String removeSpace(String s){
       StringBuilder sb = new StringBuilder();
       for(int i=0;i < s.length();i++){
           if(s.charAt(i) != ' '){
               sb.append(i);
           }
       }
       return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Welcome to Java World Guys!";
        System.out.println(removeSpace(str));
    }
}

//StringBuilder str = new StringBuilder();
//        for (int i = 0 ; i<s.length() ; i++){
//        if(s.charAt(i)!=' '){
//        str.append(s.charAt(i));
//        }
//        }
//        return str.toString();

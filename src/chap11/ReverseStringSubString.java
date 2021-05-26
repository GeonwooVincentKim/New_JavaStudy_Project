package chap11;

import static java.lang.System.out;

public class ReverseStringSubString {
    public static String reverseStr(String str){
        int n = str.length();
        String reverse = "";
        
        for(int i = n; i > 0; i--){
            reverse += str.substring(i - 1, i);
        }

        return reverse;
    }

    public static void main(String[] args) {
        String getStr = "Hola, Miguel!";
        out.println(getStr + " --> 뒤집기 전");
    
        out.println(reverseStr(getStr));
    }
}

package chap11;

import static java.lang.System.out;

public class ReverseString {
    public static void main(String[] args) {
        String readLine = "detartrated";
        out.print(readLine + " --> 뒤집기 전\n");
        
        out.println("-- 뒤집은 후--");
        for(int i = readLine.length(); i > 0; i--){
            out.print(readLine.charAt(i - 1));
        }
    }
}

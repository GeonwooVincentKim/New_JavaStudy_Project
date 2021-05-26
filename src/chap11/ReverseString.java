package chap11;

import static java.lang.System.out;

public class ReverseString {
    public static char[] reverseStr(String str){
        int n = str.length();
        char temp;
        char reverseString[] = str.toCharArray();
        
        for (int i = 0; i < n / 2; i++){
            temp = reverseString[i];
            reverseString[i] = reverseString[reverseString.length - i - 1];
            reverseString[reverseString.length - i - 1] = temp;
        }

        return reverseString;
    }

    public static void main(String[] args) {
        String readLine = "Hola Miguel!";
        out.print(readLine + " --> 뒤집기 전\n");
        
        out.print(reverseStr(readLine));

        // out.println("-- 뒤집은 후--");
        // for(int i = readLine.length(); i > 0; i--){
        //     out.print(readLine.charAt(i - 1));
        // }
    }
}

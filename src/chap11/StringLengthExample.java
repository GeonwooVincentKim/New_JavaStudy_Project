package chap11;

import java.util.Scanner;
import static java.lang.System.out;

public class StringLengthExample {
    public static void main(String[] args) {
        // double v1 = Math.floor(6.8);
        // double v2 = Math.ceil(6.3);
        // double v3 = Math.round(6.8);

        // out.println(v1);
        // out.println(v2);
        // out.println(v3);
        Scanner sc = new Scanner(System.in);
        String getInput = sc.nextLine();

        int length = 0;
        char convertToChar[] = getInput.toCharArray();

        // for(int i = 0; i < convertToChar[i] && convertToChar[i] != '\0'; i++){
        //     if(convertToChar[i] == '\0'){
        //         break;
        //     } else {
        //         length++;
        //     }
        // }

        int i = 0;
        for(char strChar : getInput.toCharArray()){
            i++;
        }
         
        out.println(i);
        // out.println(length);
        sc.close();
    }
}

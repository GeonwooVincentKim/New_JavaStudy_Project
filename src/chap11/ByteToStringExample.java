package chap11;

import static java.lang.System.out;

public class ByteToStringExample {
    public static void main(String[] args) {
        byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
        // out.println(bytes);

        // String str1 = new String(bytes);
        // out.println(str1);
        
        int result = bytes.length;
        for(int i = 0; i < bytes.length; i++){
            result = bytes[i];
            // out.print(result + " ");

            String str2 = String.valueOf(result);
            // out.print(str2 + " ");

            for(int j = 0; j < str2.length(); j++){
                if(i == j) {
                    out.print(str2 + " " + j + "\n");
                    continue; 
                }

                String str3 = str2;
                if(str2.equals(str3)){
                    out.print("중복 -> " + i + ". " + str2);
                    break;
                }
            }
            
            // String str2 = bytes[i];

            // for(int j = 0; j < bytes.length; j++){
            //     if(i == j) continue;
            // }
        }
    }
}

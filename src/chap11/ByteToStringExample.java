package chap11;

import static java.lang.System.out;

public class ByteToStringExample {
    public static void main(String[] args) {
        byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
        out.println(bytes);

        String str1 = new String(bytes);
        out.println(str1);

        String str4 = new String(bytes, 6, 4);
        out.println(str4);
    }
}

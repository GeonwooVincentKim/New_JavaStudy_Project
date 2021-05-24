package chap11;

import static java.lang.System.out;

public class KeyboardToStringExample {
    public static void main(String[] args) throws Exception {
        byte[] bytes = new byte[100];
        out.println(bytes);

        out.print("입력 : ");
        int readByNo = System.in.read(bytes);
        out.println(readByNo);

        String str = new String(bytes, 0, readByNo - 2);
        out.println(str);
    }
}

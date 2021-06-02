package chap14.ReadStreamFile;

import static java.lang.System.out;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
    public static void main(String[] args) throws Exception {
        String fLocate = "E:/NewJavaBasicProject/New_JavaProject/src/chap14/";
        InputStream is = new FileInputStream(fLocate + "WriteStreamFile/test3.db");
        out.println(is);

        byte[] buffer = new byte[5];

        int readByteNum = is.read(buffer, 2, 3);
        out.println(readByteNum);

        if (readByteNum != -1) {
            for (int i = 0; i < buffer.length; i++) {
                out.println(buffer[i]);
            }
        }

        is.close();
    }
}

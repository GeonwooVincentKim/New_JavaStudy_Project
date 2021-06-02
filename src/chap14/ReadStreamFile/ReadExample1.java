package chap14.ReadStreamFile;

import static java.lang.System.out;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {
    public static void main(String[] args) throws Exception {
        String fLocate = "E:/NewJavaBasicProject/New_JavaProject/";

        InputStream is = new FileInputStream(fLocate + "src/chap14/WriteStreamFile/test1.db");
        out.println(is);

        byte[] buffer = new byte[100];
        out.println(buffer);

        while (true) {
            int readByteNum = is.read(buffer);
            out.println(readByteNum);

            if (readByteNum == -1)
                break;
            
            for(int i = 0; i < readByteNum; i++){
                out.println(buffer[i]);
            }
        }

        is.close();
    }
}

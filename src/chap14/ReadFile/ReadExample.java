package chap14.ReadFile;

import static java.lang.System.out;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) throws Exception {
        String fLocate = "E:/NewJavaBasicProject/New_JavaProject/src/chap14/";

        InputStream is = new FileInputStream(fLocate + "WriteStreamFile/test1.db");
        out.println(is);

        while (true) {
            int data = is.read();

            if (data == -1)
                break;

            out.println(data);
        }

        is.close();
    }
}

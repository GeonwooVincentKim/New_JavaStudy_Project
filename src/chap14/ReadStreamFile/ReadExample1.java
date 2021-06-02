package chap14.ReadStreamFile;

import static java.lang.System.out;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {
    public static void main(String[] args) throws Exception {
        String fLocate = "E:/NewJavaBasicProject/New_JavaProject/";
        InputStream is = new FileInputStream(fLocate + "src/chap14/");

        out.println(is);

        is.close();
    }
}

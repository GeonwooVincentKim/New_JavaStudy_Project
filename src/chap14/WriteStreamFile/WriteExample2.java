package chap14.WriteStreamFile;

import java.io.FileOutputStream;
import java.io.OutputStream;

import static java.lang.System.out;

public class WriteExample2 {
    public static void main(String[] args) throws Exception {
        String fLocate = "E:/NewJavaBasicProject/New_JavaProject/";
        OutputStream os = new FileOutputStream(fLocate + "src/chap14/WriteStreamFile/test3.db");
        out.println(os);

        byte[] array = { 10, 20, 30, 40, 50 };
        out.println(array);
        out.println(array.length);

        os.write(array, 1, 3);

        os.flush();
        os.close();
    }
}

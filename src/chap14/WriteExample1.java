package chap14;

import static java.lang.System.out;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {
    public static void main(String[] args) throws Exception {
        String fLocation = "E:/NewJavaBasicProject/New_JavaProject/src/chap14/test2.db";

        OutputStream os = null;
        os = new FileOutputStream(fLocation);
        out.println(os);

        byte[] array = { 10, 20, 30 };
        os.write(array);

        os.flush();
        os.close();
    }
}

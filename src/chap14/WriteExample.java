package chap14;

import java.io.FileOutputStream;
import java.io.OutputStream;

import static java.lang.System.out;

public class WriteExample {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("E:/NewJavaBasicProject/New_JavaProject/test1.db");
        out.println(os);

        byte a = 10;
        byte b = 20;
        byte c = 30;

        os.write(a);
        os.write(b);
        os.write(c);

        os.flush();
        os.close();

        OutputStream os1 = new FileOutputStream("E:/NewJavaBasicProject/New_JavaProject/src/chap14/test2.db");
        out.println(os1);
    }
}

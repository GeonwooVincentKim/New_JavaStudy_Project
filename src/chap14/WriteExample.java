package chap14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import static java.lang.System.out;

public class WriteExample {
    public static OutputStream createFile(String fLocation) {
        OutputStream os = null;
        try {
            os = new FileOutputStream(fLocation);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return os;
    }

    public static int getData(OutputStream os) {
        int result[] = new int[3];
        int getResult = 0;

        byte a = 10;
        byte b = 20;
        byte c = 30;

        result[0] = a;
        result[1] = b;
        result[2] = c;

        try {
            os.write(result[0]);
            os.write(result[1]);
            os.write(result[2]);
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return getResult;
    }

    // public static void writeFile(OutputStream os, int getResult) {
    // try {
    // os.write(getResult);
    // os.flush();
    // os.close();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // }

    public static void main(String[] args) throws Exception {
        String fLocation = "E:/NewJavaBasicProject/New_JavaProject/test1.db";
        OutputStream os = createFile(fLocation);
        getData(os);
        // out.println(getResult);
        // writeFile(os, getResult);

        // byte a = 10;
        // byte b = 20;
        // byte c = 30;

        // os.write(a);
        // os.write(b);
        // os.write(c);

        // os.flush();
        // os.close();

        OutputStream os1 = new FileOutputStream("E:/NewJavaBasicProject/New_JavaProject/src/chap14/test2.db");
        out.println(os1);
    }
}

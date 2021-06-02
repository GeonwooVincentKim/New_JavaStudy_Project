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
        String result = "";
        int getResult = 0;

        byte a = 10;
        byte b = 20;
        byte c = 30;

        out.println(a + b + c);
        result = String.valueOf(a);

        result += a + b + c;
        out.println(result);

        getResult = Integer.parseInt(result);
        out.println(getResult);

        return getResult;
    }

    public static void writeFile(OutputStream os, int getResult) {
        try {
            os.write(getResult);
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        String fLocation = "E:/NewJavaBasicProject/New_JavaProject/test1.db";
        OutputStream os = createFile(fLocation);
        int getResult = getData(os);
        out.println(getResult);
        writeFile(os, getResult);

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

package chap14.ReadStreamFile;

import static java.lang.System.out;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadExample {
    public static InputStream readFile(String fGetLocate) {
        InputStream is = null;

        try {
            is = new FileInputStream("E:/NewJavaBasicProject/New_JavaProject/src/chap14/" + fGetLocate);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return is;
    }

    public static void writeData(int[] getResult, String fSetLocate) {
        OutputStream os = null;

        try {
            os = new FileOutputStream("E:/NewJavaBasicProject/New_JavaProject/src/chap14/" + fSetLocate);
            for (int i = 0; i < getResult.length; i++) {
                os.write(getResult[i]);
                out.println(getResult);
                os.flush();
            }

            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int[] getData(InputStream readFile) throws Exception {
        int result[] = new int[3];
        int data = 0;
        int i = 0;

        while (true) {
            data = readFile.read();

            if (data == -1)
                break;

            out.println(data);
            result[i] = data;
            i++;
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        String fGetLocate = "WriteStreamFile/test1.db";
        String fSetLocate = "ReadStreamFile/test1.db";
        InputStream is = readFile(fGetLocate);

        int[] getResult = getData(is);
        writeData(getResult, fSetLocate);

        is.close();
    }
}

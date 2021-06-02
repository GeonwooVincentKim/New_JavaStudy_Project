package chap14.ReadFile;

import static java.lang.System.out;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadExample {
    public static InputStream readFile(String fLocate) {
        InputStream is = null;

        try {
            is = new FileInputStream("E:/NewJavaBasicProject/New_JavaProject/src/chap14/" + fLocate);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return is;
    }

    public static void writeData(int[] getResult, String fLocate) {
        OutputStream os = null;

        try {
            os = new FileOutputStream("E:/NewJavaBasicProject/New_JavaProject/src/chap14/" + fLocate);
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
        // int result = readFile.read();
        // return readLine;
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
        String fLocate = "WriteStreamFile/test1.db";
        InputStream is = readFile(fLocate);
        int[] getResult = getData(is);
        // getData(is);
        writeData(getResult, fLocate);

        is.close();
    }
}

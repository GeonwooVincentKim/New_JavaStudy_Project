package chap14.ReadStreamFile;

import static java.lang.System.out;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class ReadExample1 {
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
        byte[] buffer = new byte[100];
        out.println(buffer);

        int readByteNum = 0;
        int[] bufArr = new int[3];

        while (true) {
            readByteNum = readFile.read(buffer);
            out.println(readByteNum);

            if (readByteNum == -1)
                break;

            for (int i = 0; i < readByteNum; i++) {
                for (int j = 0; j < bufArr.length; j++) {
                    bufArr[j] = buffer[j];
                }
                out.println(buffer[i]);
            }
        }

        return bufArr;
    }

    public static void main(String[] args) throws Exception {
        String fGetLocate = "WriteStreamFile/test2.db";
        String fSetLocate = "ReadStreamFile/test2.db";
        InputStream is = readFile(fGetLocate);

        int[] getResult = getData(is);
        writeData(getResult, fSetLocate);

        is.close();
    }
}

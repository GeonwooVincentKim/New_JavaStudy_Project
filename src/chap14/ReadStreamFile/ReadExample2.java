package chap14.ReadStreamFile;

import static java.lang.System.out;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadExample2 {
    public static InputStream readFile(String fGetLocate) {
        InputStream is = null;

        try {
            is = new FileInputStream("E:/NewJavaBasicProject/New_JavaProject/src/chap14/" + fGetLocate);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return is;
    }

    public static void writeFile(int[] getResult, String fSetLocate) {
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
        byte[] buffer = new byte[5];
        out.println(buffer);

        int result[] = new int[5];
        int readByteNum = readFile.read(buffer, 2, 3);
        out.print(readByteNum);

        if (readByteNum != -1) {
            for (int i = 0; i < buffer.length; i++) {
                // Subsititude when there are `0` in the buffer[i] String
                if (buffer[i] == 0) {
                    result[i] = 1; // Convert as ''
                } else {
                    result[i] = buffer[i];
                }
                out.println(result[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        String fGetLocate = "WriteStreamFile/test3.db";
        String fSetLocate = "ReadStreamFile/test3.db";
        InputStream is = readFile(fGetLocate);

        int[] getResult = getData(is);
        writeFile(getResult, fSetLocate);

        is.close();
    }
}

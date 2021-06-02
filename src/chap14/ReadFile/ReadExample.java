package chap14.ReadFile;

import static java.lang.System.out;

import java.io.FileInputStream;
import java.io.InputStream;

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

    public static String getData(InputStream readFile) {
        String result = "";
        int data = 0;

        while (true) {
            try {
                data = readFile.read();
                if (data == -1)
                    break;

                out.println(data);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        String fLocate = "WriteStreamFile/test1.db";
        InputStream is = readFile(fLocate);
        getData(is);

        is.close();
    }
}

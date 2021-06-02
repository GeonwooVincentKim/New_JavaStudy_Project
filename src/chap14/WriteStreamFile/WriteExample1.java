package chap14.WriteStreamFile;

import static java.lang.System.out;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {
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

    public static int[] getData(OutputStream os) {
        int result[] = new int[3];

        // byte a = 10;
        byte[] arr = { 10, 20, 30 };

        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i];
            out.println(result[i]);
        }

        try {
            for (int i = 0; i < result.length; i++) {
                os.write(result[i]);
                out.println(result[i]);
                os.flush();
            }
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        String fLocation = "E:/NewJavaBasicProject/New_JavaProject/";
        OutputStream os = createFile(fLocation + "test0.db");
        getData(os);

        OutputStream os1 = createFile(fLocation + "src/chap14/WriteStreamFile/test2.db");
        out.println(fLocation + "src/chap14/test1.db");
        getData(os1);
    }
}

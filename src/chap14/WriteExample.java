package chap14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

    public static int[] getData(OutputStream os) {
        int result[] = new int[3];

        byte a = 10;

        for (int i = 0; i < result.length; i++) {
            result[i] = a;
            a += 10;
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
        OutputStream os = createFile(fLocation + "test1.db");
        getData(os);

        OutputStream os1 = createFile(fLocation + "src/chap14/test2.db");
        getData(os1);
    }
}

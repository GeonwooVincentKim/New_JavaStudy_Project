package chap14.Reader;

import static java.lang.System.out;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("E:/NewJavaBasicProject/New_JavaProject/src/chap14/Reader/text7.txt");
        out.println(reader);

        while (true) {
            int data = reader.read();
            out.print(data + " ");

            if (data == -1)
                break;
            out.println((char) data);
        }

        reader.close();
    }
}

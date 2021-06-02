package chap14.Writer;

import java.io.FileWriter;
import java.io.Writer;

import static java.lang.System.out;

public class WriteExample {
    public static void main(String[] args) throws Exception {
        String fLocates = "E:/NewJavaBasicProject/New_JavaProject/src/chap14/";
        Writer writer = new FileWriter(fLocates + "Writer/writeTest.txt");
        out.println(writer);

        char a = 'A';
        char b = 'B';
        char c = 'C';

        writer.write(a);
        writer.write(b);
        writer.write(c);

        writer.flush();
    }
}

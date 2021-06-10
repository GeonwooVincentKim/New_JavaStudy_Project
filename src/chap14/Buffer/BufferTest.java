package chap14.Buffer;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

public class BufferTest {
    public static void main(String[] args) throws Exception {
        out.println("Test");

        String filePath = "E:/NewJavaBasicProject/New_JavaProject/src/chap14/Buffer/";
        String fileName = "BufferTest.java";
        String writeFileName = "BufferTest.txt";
        Reader reader = new FileReader(filePath + fileName);

        BufferedReader br = new BufferedReader(reader);
        FileWriter fWriter = new FileWriter(filePath + writeFileName);

        int rowNumber = 0;
        String data;
        String result = "";
        while ((data = br.readLine()) != null) {
            result = ++rowNumber + " " + data + "\n";
            out.println(++rowNumber + " " + data);
            fWriter.write(result);
        }

        fWriter.close();

        br.close();
    }
}

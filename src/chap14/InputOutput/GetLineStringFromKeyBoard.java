package chap14.InputOutput;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyBoard {
    public static void main(String[] args) throws Exception {
        InputStream is = System.in;
        out.println(is);

        Reader reader = new InputStreamReader(is);
        out.println(reader);

        BufferedReader br = new BufferedReader(reader);
        out.print(br);

        out.println();
        while (true) {
            out.print("입력하세요 : ");
            String lineStr = br.readLine();

            if (lineStr.equals("q") || lineStr.equals("quit"))
                break;

            out.println("입력된 내용 : " + lineStr);
            out.println();
        }

        br.close();
    }
}

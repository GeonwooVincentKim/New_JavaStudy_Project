package chap14.Writer;

import java.util.Scanner;
import static java.lang.System.out;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loopCount = sc.nextInt();

        String str = "";
        String result = "";
        // char storeStr[] = null;

        for (int k = 0; k < loopCount; k++) {
            str = sc.next();
            result += "#" + (k + 1) + " ";

            int j = 0;
            int i = 1;
            for (i = 1; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    j++;
                } else {
                    j = 0;
                    out.println(j + " --> ");
                }

            }

            result += (i - j) + "\n";
        }

        out.print(result);

        sc.close();
    }
}

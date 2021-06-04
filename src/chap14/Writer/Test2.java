package chap14.Writer;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            String s = sc.next();
            int idx = 0;
            for (int j = 1; j <= s.length(); j++) {
                String tmp = s.substring(0, j);
                boolean diff = false;
                for (int k = 0; k + tmp.length() < s.length(); k += tmp.length()) {
                    String cmp = s.substring(k, k + tmp.length());
                    if (!cmp.equals(tmp)) {
                        System.out.println(cmp);
                        diff = true;
                        break;
                    }
                }
                if (diff == false) {
                    // System.out.println("흠...");
                    idx = j;
                    break;
                }

            }
            System.out.println("#" + t + " " + idx);
        }
    }
}

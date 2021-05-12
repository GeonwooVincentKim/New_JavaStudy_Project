package chap01;

import java.util.Scanner;

public class CastingExample {
    public static void main(String[] args) throws Exception {
        // System.out.println("ddd");

        Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();

        int i;
        int j;
        int k[] = new int[3];
        int min = 0;
        int result = 0;

        for (i = 0; i < 3; i++) {
            k[i] = scan.nextInt();
            if (min > k[i]) {
                min = k[i];
            }
            result += min;
            System.out.println(result);
        }

    }
}

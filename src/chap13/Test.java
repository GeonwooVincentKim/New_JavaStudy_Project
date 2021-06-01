package chap13;

import java.util.Scanner;

public class Test {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else {
            return gcd(b, a % b);
        }
    }

    public static void temp(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    public static void main(String[] args) {
        // int a = 72, b = 30;
        // int a = 30, b = 72;

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " " + b);

        if (a < b) {
            temp(a, b);
            int t_c = gcd(a, b);
            System.out.println(t_c);
        } else {
            int c = gcd(a, b);
            System.out.println(c);
        }

        sc.close();

        // int r = a % b;
        // System.out.println(r);

        // int r1 = b % r;
        // System.out.println(r1);

        // int r2 = r % r1;
        // System.out.println(r2);
    }
}

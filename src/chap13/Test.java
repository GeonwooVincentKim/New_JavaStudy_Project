package chap13;

public class Test {
    public static void main(String[] args) {
        int a = 72, b = 30;
        System.out.println(a + " " + b);

        int r = a % b;
        System.out.println(r);

        int r1 = b % r;
        System.out.println(r1);

        int r2 = r % r1;
        System.out.println(r2);
    }
}

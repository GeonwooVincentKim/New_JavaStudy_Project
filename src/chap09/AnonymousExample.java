package chap09;

import static java.lang.System.out;

public class AnonymousExample {
    public static void main(String[] args) {
        B1 obj = new B1();
        A1 obj1 = obj;
        // A1 obj = new B1();
        out.println(obj1.getClass());
        obj.show();
        obj1.show();

        // B1 obj2 = (B1) obj;
        // obj2.show();
    }
}

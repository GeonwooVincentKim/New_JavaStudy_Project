package chap09;

import static java.lang.System.out;

public class AnonymousExample {
    public static void main(String[] args) {
        // B1 obj = new B1();
        // A1 obj1 = obj;
        // out.println(obj1.getClass());

        // obj.show();
        // obj1.show();

        // A1 obj = new B1();
        // obj.show();

        // B1 obj2 = (B1) obj;
        // obj2.show();

        A1 obj0 = new A1();
        obj0.show();

        A1 obj = new A1() {
            public void show() {
                out.println("I'm the Best");
            }
        };
        obj.show();
    }
}

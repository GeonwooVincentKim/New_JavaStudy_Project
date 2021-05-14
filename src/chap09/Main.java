package chap09;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        
        A.B b = a.new B();
        // Cannot use this because the inner-class `B` should allocates with an enclosing instance of type, `A`.
        // A.B b = new A.B(); 
        b.field1 = 3;
        b.method1();

        System.out.println(b.field1);

        A.C c = new A.C();
        c.field1 = 3;
        c.method1();

        A.C.field2 = 3;
        A.C.method2();

        System.out.println(c.field1);
        System.out.println(A.C.field2);

        a.method();
    }
}

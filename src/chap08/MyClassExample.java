package chap08;

import static java.lang.System.out;

public class MyClassExample {
    public static void main(String[] args) {
        out.println("1) ----------");

        MyClass myClass1 = new MyClass();
        myClass1.rc.turnOn();
        myClass1.rc.setVolume(5);

        out.println("2) ----------");

        MyClass myClass2 = new MyClass(new Audio());
        out.println(myClass2);
        // myClass2.rc.turnOn();
        // myClass2.rc.turnOff();

        out.println("3) ----------");

        MyClass myClass3 = new MyClass();
        myClass3.methodA();

        out.println("4) ----------");

        MyClass myClass4 = new MyClass();
        myClass4.methodB(new Television());
    }
}

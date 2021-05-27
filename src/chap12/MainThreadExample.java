package chap12;

import static java.lang.System.out;

public class MainThreadExample {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        out.println(cal);

        User1 usr1 = new User1();
        out.println(usr1);

        usr1.setCalculator(cal);
        usr1.start();
    }
}

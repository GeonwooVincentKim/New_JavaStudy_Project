package chap12;

import static java.lang.System.out;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        out.println(Thread.currentThread());
        out.println(mainThread);

        out.println("Program start Thread Name : " + mainThread.getName());

        ThreadA thrA = new ThreadA();
        out.println(thrA);
        out.println("작업 스레드 이름 : " + thrA.getName());
        thrA.start();

        ThreadB thrB = new ThreadB();
        out.println(thrB);
        out.println("작업 스레드 이름 : " + thrB.getName());
        thrB.start();
    }   
}

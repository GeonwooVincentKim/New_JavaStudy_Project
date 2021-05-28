package chap12.InterruptThread;

import static java.lang.System.out;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thr = new PrintThread2();
        out.println(thr);

        thr.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        thr.interrupt();
    }
}

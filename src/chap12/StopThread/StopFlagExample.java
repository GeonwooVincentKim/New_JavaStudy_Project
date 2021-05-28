package chap12.StopThread;

import static java.lang.System.out;

public class StopFlagExample {
    public static void main(String[] args) {
        PrintThread1 pThr1 = new PrintThread1();
        out.println(pThr1);

        pThr1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        pThr1.setStop(true);
    }
}

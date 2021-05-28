package chap12.InterruptThread;

import static java.lang.System.out;

public class PrintThread2 extends Thread {
    public void run(){
        try {
            while(true){
                out.println();
                Thread.sleep(1);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        out.println("자원 정리");
        out.println("실행 종료");
    }
}

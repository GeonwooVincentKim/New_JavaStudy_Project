package chap12.StopThread;

import static java.lang.System.out;

public class PrintThread1 extends Thread {
    private boolean stop;

    public void setStop(boolean stop){
        this.stop = stop;
    }

    public void run(){
        while(!stop){
            out.println("실행 중");
        }

        out.println("자원 정리");
        out.println("실행 종료");
    }
}

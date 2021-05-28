package chap12.InterruptThread;

import static java.lang.System.out;

public class PrintThread2 extends Thread {
    public void run(){
        while(true){
            out.println("실행 중..");
        
            if(Thread.interrupted()){
                break;
            }
        }

        out.println("자원 정리");
        out.println("실행 종료");
    }
}

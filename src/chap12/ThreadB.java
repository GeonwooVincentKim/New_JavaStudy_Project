package chap12;

import static java.lang.System.out;

public class ThreadB extends Thread {
    @Override
    public void run(){
        for(int i = 0; i < 2; i++){
            out.println(getName() + " 가 출력한 내용");
        }
    }
}

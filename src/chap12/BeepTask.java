package chap12;

import java.awt.Toolkit;

import static java.lang.System.out;

public class BeepTask implements Runnable {
    public void run(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        out.println(toolkit);

        for(int i = 0; i < 5; i++){
            toolkit.beep();
            try { Thread.sleep(350); } catch (Exception e) {}
        }
    }
}

package chap12;

import static java.lang.System.out;

import java.awt.Toolkit;

public class BeepPrintExample2 {
    public static void main(String[] args) {
        Runnable beepTask = new BeepTask();
        out.println(beepTask + " -> Beeping..");
        
        Thread thread = new Thread(beepTask);
        out.println(thread + " -> Non-InnerClass");
        thread.start();

        Thread newThread = new Thread(new Runnable(){
            @Override
            public void run(){
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                out.println(toolkit);

                for(int i = 0; i < 5; i++){
                    toolkit.beep();
                    try { Thread.sleep(500); } catch (Exception e) {}
                }
            }
        });
        out.println(newThread + " -> InnerClass");
        newThread.start();

        for(int i = 0; i < 5; i++){
            out.println("띵");
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

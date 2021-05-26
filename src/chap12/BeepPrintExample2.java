package chap12;

import static java.lang.System.out;

public class BeepPrintExample2 {
    public static void main(String[] args) {
        Runnable beepTask = new BeepTask();
        out.println(beepTask);
        
        Thread thread = new Thread(beepTask);
        out.println(thread);
        thread.start();

        for(int i = 0; i < 5; i++){
            out.println("띵");
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

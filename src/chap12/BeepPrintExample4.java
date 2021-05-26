package chap12;

import static java.lang.System.out;

public class BeepPrintExample4 {
    public static void main(String[] args) {
        Thread thread = new BeepThread();
        thread.start();

        for(int i = 0; i < 5; i++){
            out.println("띵");

            try { Thread.sleep(500); } catch (Exception e) {e.printStackTrace();}
        }
    }
}

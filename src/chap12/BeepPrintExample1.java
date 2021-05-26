package chap12;

import java.awt.Toolkit;
import static java.lang.System.out;

public class BeepPrintExample1 {
    public static void main(String[] args) {
        Toolkit toolKit = Toolkit.getDefaultToolkit();
        out.println(toolKit);
        
        for(int i = 0; i < 5; i++){
            toolKit.beep();
            
            try { Thread.sleep(500);} catch (Exception e){}
        }

        for(int i = 0; i < 5; i++){
            System.out.println("띵");

            try { Thread.sleep(500);} catch (Exception e){}
        }
    }
}

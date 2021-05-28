package chap12;

import static java.lang.System.out;
import java.awt.Toolkit;

public class SleepExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        out.println(Toolkit.getDefaultToolkit());
        out.println(toolkit);

        for(int i = 0; i < 10; i++){
            toolkit.beep();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e){
                e.printStackTrace();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

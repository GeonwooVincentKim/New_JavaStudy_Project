package chap08;

import static java.lang.System.out;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc = new Audio();
        out.println(rc);
        // System.out.println(rc);
    }
}

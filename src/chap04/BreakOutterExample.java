package chap04;

import static java.lang.System.out;

public class BreakOutterExample {
    public static void main(String[] args) {
        out.println();

        Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                out.println(upper + "-" + lower);

                if (lower == 'g') {
                    break Outter;
                }
            }
        }

        out.println("프로그램 실행 종료");
    }
}

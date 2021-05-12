package chap03;

public class forLoop {
    public static void main(String[] args) throws Exception {
        // for (int i = 0; i < 4; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > 0; j--) {
                // for (int i = 0; i < 4; i++) {
                // for (int j = 4; j >= i; j--) {
                // System.out.print("*");
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}

package chap02;

public class Test {
    public static void main(String[] args) throws Exception {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        // System.out.println(++x);
        // System.out.println(y--);
        System.out.println(z);

        int pencils = 534;
        int students = 30;

        int pencilsPerStudent = pencils / students;
        System.out.println(pencilsPerStudent);

        int pencilsLeft = pencils % students;
        System.out.println(pencilsLeft);

        int var1 = 5;
        int var2 = 2;
        double var3 = var1 / var2;
        int var4 = (int) (var3 * var2);
        System.out.println(++var4);

        int value = 356;
        System.out.println(value - (value % 100));
    }
}

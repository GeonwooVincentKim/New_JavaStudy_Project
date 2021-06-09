package chap05;

import static java.lang.System.out;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores = new int[] { 83, 90, 87 };
        out.println(scores);

        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }

        out.println("총합 : " + sum1);

        int sum2 = add(scores);
        out.println("총합 - (함수 사용): " + sum2);
        out.println();
    }

    public static int add(int[] scores) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += scores[i];
        }

        return sum;
    }
}

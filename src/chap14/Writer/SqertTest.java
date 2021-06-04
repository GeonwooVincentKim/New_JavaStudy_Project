package chap14.Writer;

public class SqertTest {
    public static void main(String[] args) {
        int[] r = new int[10];
        int i;
        int sum = 0;
        double avg, total = 0, dev;

        for (i = 0; i < r.length; i++) {
            r[i] = (int) (Math.random() * 100) + 1;
            System.out.print(r[i] + " ");
            sum += r[i];

        }

        avg = (double) sum / r.length;

        for (i = 0; i < r.length; i++)
            total += (r[i] - avg) * (r[i] - avg);

        dev = total / r.length; // 분산

        System.out.printf("합 : %d\n평균 : %.2f\n분산 : %.2f\n표준편차 : %.2f\n", sum, avg, dev, Math.sqrt(dev));

    }
}

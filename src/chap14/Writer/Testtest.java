package chap14.Writer;

public class Testtest {

    public static void main(String[] args) {
        int[] data = { 81, 93, 75, 69, 88, 79 };

        int sum = 0;

        for (int i = 0; i < data.length; i++)
            sum += data[i];

        // 평균값
        double avg = (double) sum / data.length;

        sum = 0;
        for (int i = 0; i < data.length; i++)
            sum += Math.pow(data[i] - avg, 2);

        // 분산값
        double var = (double) sum / data.length;

        // 표준편차
        double sd = Math.sqrt(var);

        System.out.println("평균값: " + avg);
        System.out.println("분산값: " + var);
        System.out.println("표준편차값: " + sd);

    }

}
package chap04;

public class ArrayCopyExample {
    public static void main(String[] args) throws Exception {
        String[] oldStrArray = { "java", "array", "copy" };
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for (int i = 0; i < newStrArray.length; i++) {
            System.out.println(newStrArray[i] + ", ");
        }

        int[] scores = { 95, 71, 84, 93, 87 };

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println("점수 총합 = " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);

        int max = 0;
        int[] array = { 1, 5, 3, 8, 2 };

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);

        int[][] array1 = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

        int sum1 = 0;
        double avg1 = 0.0;

        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 1; j < array1[i].length; j++) {
                sum1 += array1[i][j];
                count++;
            }
            // System.out.println(sum);
        }

        avg1 = (double) sum1 / count;
        System.out.println(sum1 + " : 합계");
        System.out.println(avg1 + " : 평균");
    }
}

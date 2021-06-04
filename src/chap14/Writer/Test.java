package chap14.Writer;

public class Test {
    public static void main(String[] args) {
        System.out.printf("n의 값:%d\n반환받은 값:%d\n", 1, freq(new int[] { 1, 2, 1, 1, 3 }, 1));

    }

    public static int freq(int[] arr, int n) {
        int i;
        int cnt = 0;

        for (i = 0; i < arr.length; i++)
            if (arr[i] == n)
                cnt++;

        return cnt;
    }
}

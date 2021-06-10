package chap05;

import static java.lang.System.out;

public class ArrayCopyByForExample {
    public static int[] getOldArray(int[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            arr[i - 1] = i;
            out.print(arr[i - 1] + " ");
        }
        out.println();

        return arr;
    }

    public static int[] getNewArray(int[] arr) {
        int[] newArray = new int[arr.length];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arr[i];
            out.print(newArray[i] + " ");
        }

        return newArray;
    }

    public static void main(String[] args) {
        int printLength = 3;
        out.println(printLength);

        int newPrintLength = 5;
        out.println(newPrintLength);

        int[] oldIntArray = new int[printLength];
        out.println(oldIntArray.length);

        // oldIntArray = getOldArray(oldIntArray);
        extracted(oldIntArray);

        int[] newIntArray = new int[newPrintLength];

        // newIntArray = getNewArray(oldIntArray);
        extracted2(oldIntArray, newIntArray);

        out.println();
        extracted3(newIntArray);
    }

    private static void extracted3(int[] newIntArray) {
        for (int i = 0; i < newIntArray.length; i++) {
            out.print(newIntArray[i] + ", ");
        }
    }

    private static void extracted2(int[] oldIntArray, int[] newIntArray) {
        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
            out.print(newIntArray[i] + " ");
        }
    }

    private static void extracted(int[] oldIntArray) {
        for (int i = 1; i <= 3; i++) {
            oldIntArray[i - 1] = i;
            out.print(oldIntArray[i - 1] + " ");
        }
    }
}

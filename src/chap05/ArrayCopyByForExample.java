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

        oldIntArray = getOldArray(oldIntArray);
        // for (int i = 1; i <= 3; i++) {
        // oldIntArray[i - 1] = i;
        // out.print(oldIntArray[i - 1] + " ");
        // }

        int[] newIntArray = new int[newPrintLength];

        // newIntArray = getNewArray(oldIntArray);
        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
            out.print(newIntArray[i] + " ");
        }

        out.println();
        for (int i = 0; i < newIntArray.length; i++) {
            out.print(newIntArray[i] + ", ");
        }
    }
}

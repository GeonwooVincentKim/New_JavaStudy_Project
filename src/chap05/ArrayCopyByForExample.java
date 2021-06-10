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

    public static String printArray(int[] newIntArray) {
        String result = "";
        for (int i = 0; i < newIntArray.length; i++) {
            out.print(newIntArray[i] + ", ");
        }

        return result;
    }

    public static void main(String[] args) {
        int printLength = 3;
        out.println(printLength);

        int newPrintLength = 5;
        out.println(newPrintLength);

        int[] oldIntArray = new int[printLength];
        out.println(oldIntArray.length);

        oldIntArray = getOldArray(oldIntArray);
        // extracted(oldIntArray);

        int[] newIntArray = new int[newPrintLength];

        newIntArray = getNewArray(oldIntArray);
        // extracted2(oldIntArray, newIntArray);

        out.println();
        printArray(newIntArray);
    }

}

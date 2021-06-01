package chap13.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import static java.lang.System.out;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        out.println(list1);

        List<String> list2 = new LinkedList<String>();
        out.println(list2);

        List<String> list3 = new Vector<String>();
        out.println(list3);

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();
        out.println("ArrayList - startTime : " + startTime);
        out.println("ArrayList - endTime : " + endTime);

        out.println("ArrayList - 걸린 시간 : " + (endTime - startTime) + " ns");

        out.println("--------------");

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();
        out.println("LinkedList - startTime : " + startTime);
        out.println("LinekdList - endTime : " + endTime);

        out.println("LinkedList - 걸린 시간 : " + (endTime - startTime) + " ns");

        out.println("--------------");

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list3.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();
        out.println("Vector - startTime : " + startTime);
        out.println("Vector - endTime : " + endTime);

        out.println("Vector - 걸린 시간 : " + (endTime - startTime) + " ns");

        out.println("-------------");
    }
}
package chap13.Map;

import java.util.HashMap;
import java.util.Map;

import chap13.Student;

import static java.lang.System.out;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<Student, Integer>();
        out.println(map);

        map.put(new Student(1, "홍길동"), 95);
        out.println(map);

        map.put(new Student(1, "홍길동"), 95);
        out.println(map);

        out.println("총 Entry 수 : " + map.size());
    }
}

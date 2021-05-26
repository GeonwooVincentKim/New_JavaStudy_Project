package chap11;

import java.util.HashMap;
import static java.lang.System.out;

public class StudentExample {
    public static void main(String[] args) {
        HashMap<Student, String> hashMap = new HashMap<Student, String>();
        out.println(hashMap);

        hashMap.put(new Student("1"), "95");

        String score = hashMap.get(new Student("1"));
        out.println("1번 학생의 총점 : " + score);
    }
}

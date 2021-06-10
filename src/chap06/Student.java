package chap06;

import static java.lang.System.out;

public class Student {
    public static void main(String[] args) {
        Student s1 = new Student();
        out.println(s1);
        out.println("s1 변수가 Student 객체를 참조합니다.");

        Student s2 = new Student();
        out.println(s2);
        out.println("s2 변수 또한 Student 객체를 참조합니다.");
    }
}

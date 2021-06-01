package chap13.Set;

import java.util.HashSet;
import java.util.Set;

import chap13.Member;

import static java.lang.System.out;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();
        out.println(set);

        set.add(new Member("홍길동", 30));
        out.println(set);

        set.add(new Member("홍길동", 30));
        out.println(set);

        out.println("총 객체 수 : " + set.size());
    }
}

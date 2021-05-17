package chap10;

import static java.lang.System.out;

public class MemberExample {
    public static void main(String[] args) {
        Member obj1 = new Member("Blue"); // Blue 문자열이 id field 값 안에 들어감
        Member obj2 = new Member("Blue");
        Member obj3 = new Member("red");
        
        if(obj1.equals(obj2)){
            out.println("Obj1 과 Obj2 는 동일합니다");
        } else {
            out.println("Obj1 과 Obj2 는 동등하지 않습니다.");
        }

        if(obj1.equals(obj3)){
            out.println("Obj1 과 Obj3 은 동등합니다.");
        } else {
            out.println("Obj1 과 Obj3 은 동등하지 않습니다.");
        }
    }
}

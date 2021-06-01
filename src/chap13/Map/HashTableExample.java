package chap13.Map;

import static java.lang.System.out;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<String, String>();
        out.println(map);

        map.put("spring", "12");
        out.println(map);

        map.put("summer", "123");
        out.println(map);

        map.put("fall", "1234");
        out.println(map);

        map.put("winter", "12345");
        out.println(map);

        Scanner sc = new Scanner(System.in);

        while (true) {
            out.println("아이디와 비밀번호를 입력해주세요");

            out.print("아이디 : ");
            String id = sc.nextLine();

            out.print("비밀번호 : ");
            String password = sc.nextLine();
            out.println();

            if (map.containsKey(id)) {
                if (map.get(id).equals(password)) {
                    out.println("로그인되었습니다.");
                    break;
                } else {
                    out.println("비밀번호가 일치하지 않습니다");
                }
            } else {
                out.println("입력하신 아이디가 존재하지 않습니다");
            }
        }

        sc.close();
    }
}

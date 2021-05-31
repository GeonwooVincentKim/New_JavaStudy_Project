package chap13;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        out.println(map);

        map.put("신용권", 85);
        map.put("홍길동", 90);
        out.println(map);

        map.put("동장군", 80);
        map.put("홍길동", 95);
        out.println("총 Entry 수 : " + map.size());
    }
}
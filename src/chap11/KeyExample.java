package chap11;

import java.util.HashMap;
import static java.lang.System.out;

public class KeyExample {
    public static void main(String[] args) {
        HashMap<Key, String> hashMap = new HashMap<Key, String>();
        
        out.println(hashMap);
        out.println(hashMap.size());
        out.println(hashMap.values());

        hashMap.put(new Key(1), "홍길동");

        String value = hashMap.get(new Key(1));
        out.println(value);
    }
}

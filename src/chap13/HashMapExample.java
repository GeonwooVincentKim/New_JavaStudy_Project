package chap13;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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

        out.println("\t홍길동 : " + map.get("홍길동"));
        out.println();

        // Convert Map to Set
        Set<String> keySet = map.keySet();
        out.println(keySet);

        Iterator<String> keyIterator = keySet.iterator();
        out.println(keyIterator);

        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            out.println("\t" + key + " : " + value);
        }

        out.println();

        map.remove("홍길동");
        out.println("총 Entry 수 : " + map.size());

        Set<Entry<String, Integer>> entrySet = map.entrySet();
        out.println(entrySet);

        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        out.println(entryIterator);

        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            out.println("\t" + key + " : " + value);
        }

        out.println();

        map.clear();
        out.println("총 Entry 수 : " + map.size());
    }
}

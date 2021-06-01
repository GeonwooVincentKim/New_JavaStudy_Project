package chap13.Map.MapSet;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        out.println(map);

        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);
        out.println(map);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<Entry<String, Integer>> entrySet = map.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > maxScore) {
                name = entry.getKey();
                maxScore = entry.getValue();
            }
            totalScore += entry.getValue();
        }

        int avg = totalScore / map.size();
        out.println("평균 점수 : " + avg);
        out.println("최고 점수 : " + maxScore);
        out.println("최고 점수를 받은 아이디 : " + name);
    }
}

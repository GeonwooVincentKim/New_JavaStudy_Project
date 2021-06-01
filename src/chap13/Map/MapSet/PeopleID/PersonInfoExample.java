package chap13.Map.MapSet.PeopleID;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import static java.lang.System.out;

public class PersonInfoExample {
    public static void main(String[] args) {
        Map<PersonDTO, String> map = new HashMap<PersonDTO, String>();
        out.println(map);

        map.put(new PersonDTO("yourID", "yourPWD", "yourName", 16), "닉네임");
        map.put(new PersonDTO("myID", "myPWD", "myName", 18), "넉네임");

        out.println("Just Just Iterator Method --> ");

        int i = 1;

        Set<PersonDTO> keySet = map.keySet();
        Iterator<PersonDTO> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            PersonDTO key = keyIterator.next();
            String value = map.get(key);
            out.println("#" + i + " " + key.getUserID() + " " + key.getUserPWD() + " " + key.getName() + " "
                    + key.getAge() + " " + value);
            i++;
        }
        out.println("No.1 Size : " + map.size());

        out.println();

        out.println("Use Map Entry together");

        i = 1;

        Set<Entry<PersonDTO, String>> entrySet = map.entrySet();
        out.println(entrySet);

        Iterator<Entry<PersonDTO, String>> entryIter = entrySet.iterator();
        out.println(entryIter);

        while (entryIter.hasNext()) {
            Entry<PersonDTO, String> entry = entryIter.next();
            PersonDTO key = entry.getKey();
            String value = entry.getValue();
            // Cannot use this because those are just for `Map` not for `Entry<Key, Value>`
            // PersonDTO key = keyIterator.next();
            // String value = map.get(entry);
            out.println("#" + i + " " + key.getUserID() + " " + key.getUserPWD() + " " + key.getName() + " "
                    + key.getAge() + " " + value);
            i++;
        }

        out.println("No.2 Size : " + entrySet.size());
    }
}

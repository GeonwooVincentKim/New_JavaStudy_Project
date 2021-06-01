package chap13.Map.MapSet.PeopleID;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static java.lang.System.out;

public class PersonInfoExample {
    public static void main(String[] args) {
        Map<PersonDTO, String> map = new HashMap<PersonDTO, String>();
        out.println(map);

        map.put(new PersonDTO("yourID", "yourPWD", "yourName", 16), "닉네임");
        out.println(map.size());

        Set<PersonDTO> keySet = map.keySet();
        Iterator<PersonDTO> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            PersonDTO key = keyIterator.next();
            String value = map.get(key);
            out.println("\t" + key.getUserID() + " " + key.getUserPWD() + " " + key.getName() + " " + key.getAge() + " "
                    + value);
        }
    }
}

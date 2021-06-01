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
        out.println(map.size());

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

        out.println();

        out.println("Use Map Entry together");
        Set<Entry<PersonDTO, String>> entrySet = map.entrySet();
        out.println(entrySet);

        Iterator<Entry<PersonDTO, String>> entryIter = entrySet.iterator();
        out.println(entryIter);

        for (int j = 0; j < entrySet.size(); j++) {
            if (!keyIterator.hasNext()) {
                out.println("Cannot get the data more because data does not exists");
                break;
            } else if (keyIterator.hasNext()) {
                PersonDTO key = keyIterator.next();
                String value = map.get(key);
                out.println("#" + (j + 1) + " " + key.getUserID() + " " + key.getUserPWD() + " " + key.getName() + " "
                        + key.getAge() + " " + value);
            }
        }

        out.println(entrySet.size());
    }
}

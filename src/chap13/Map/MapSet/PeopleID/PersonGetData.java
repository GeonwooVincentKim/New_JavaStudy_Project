package chap13.Map.MapSet.PeopleID;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static java.lang.System.out;

public class PersonGetData {
    public void printUserInfoAsMap(Map<PersonDTO, String> map) {
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
    }

}

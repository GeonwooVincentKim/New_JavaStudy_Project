package chap13.Map.MapSet.PeopleID;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import static java.lang.System.out;

public class PersonGetData {
    // public void printUserInfoAsMap(Map<PersonDTO, String> map) {
    // int i = 1;

    // Set<PersonDTO> keySet = map.keySet();
    // Iterator<PersonDTO> keyIterator = keySet.iterator();
    // while (keyIterator.hasNext()) {
    // PersonDTO key = keyIterator.next();
    // String value = map.get(key);
    // out.println("#" + i + " " + key.getUserID() + " " + key.getUserPWD() + " " +
    // key.getName() + " "
    // + key.getAge() + " " + value);
    // i++;
    // }
    // }

    public void printUserInfoAsMap(Map<String, PersonDTO> map) {
        int i = 1;

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            PersonDTO value = map.get(key);
            out.println("#" + i + " " + key + " " + value.getUserID() + " " + value.getUserPWD() + " " + value.getName()
                    + " " + value.getAge());
            i++;
        }
    }

    // public Set<Entry<PersonDTO, String>> printUserInfoAsEntry(Map<PersonDTO,
    // String> map) {
    // int i = 1;

    // Set<Entry<PersonDTO, String>> entrySet = map.entrySet();
    // // out.println(entrySet);

    // Iterator<Entry<PersonDTO, String>> entryIter = entrySet.iterator();
    // // out.println(entryIter);

    // while (entryIter.hasNext()) {
    // Entry<PersonDTO, String> entry = entryIter.next();
    // PersonDTO key = entry.getKey();
    // String value = entry.getValue();
    // // Cannot use this because those are just for `Map` not for `Entry<Key,
    // Value>`
    // // PersonDTO key = keyIterator.next();
    // // String value = map.get(entry);
    // out.println("#" + i + " " + key.getUserID() + " " + key.getUserPWD() + " " +
    // key.getName() + " "
    // + key.getAge() + " " + value);
    // i++;
    // }

    // return entrySet;
    // }
    public Set<Entry<String, PersonDTO>> printUserInfoAsEntry(Map<String, PersonDTO> map) {
        int i = 1;

        Set<Entry<String, PersonDTO>> entrySet = map.entrySet();
        // out.println(entrySet);

        Iterator<Entry<String, PersonDTO>> entryIter = entrySet.iterator();
        // out.println(entryIter);

        while (entryIter.hasNext()) {
            Entry<String, PersonDTO> entry = entryIter.next();
            String key = entry.getKey();
            PersonDTO value = entry.getValue();
            // Cannot use this because those are just for `Map` not for `Entry<Key, Value>`
            // PersonDTO key = keyIterator.next();
            // String value = map.get(entry);
            out.println("#" + i + " " + key + " " + value.getUserID() + " " + value.getUserPWD() + " " + value.getName()
                    + " " + value.getAge());
            i++;
        }

        return entrySet;
    }
}

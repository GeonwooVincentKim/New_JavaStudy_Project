package chap13.Map.MapSet.PeopleID;

import java.util.HashMap;
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

        PersonGetData pGD = new PersonGetData();
        pGD.printUserInfoAsMap(map);
        out.println("No.1 Size : " + map.size());
        out.println();

        out.println("Use Map Entry together");

        Set<Entry<PersonDTO, String>> entrySet = pGD.printUserInfoAsEntry(map);
        out.println("No.2 Size : " + entrySet.size());
    }
}

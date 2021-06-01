package chap13.Map.MapSet.PeopleID;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

import static java.lang.System.out;

public class PersonInfoExample {

    public static void main(String[] args) {
        Map<String, PersonDTO> map = new HashMap<String, PersonDTO>();
        out.println(map);
        map.put("LaCampanella", new PersonDTO("yourID", "yourPWD", "yourName", 16));

        // Show when the <Key, Value> duplicates
        map.put("Darkness", new PersonDTO("myID", "myPWD", "myName", 18));

        // Convert Value, "넉네임" as "눅네임"
        map.put("GraphBallstics", new PersonDTO("myID", "myPWD", "myName", 18));

        out.println("Just Just Iterator Method --> ");

        PersonGetData pGD = new PersonGetData();
        pGD.printUserInfoAsMap(map);
        out.println("No.1 Size : " + map.size());
        out.println();

        out.println("Use Map Entry together");

        Set<Entry<String, PersonDTO>> entrySet = pGD.printUserInfoAsEntry(map);
        out.println("No.2 Size : " + entrySet.size());

        // Compare that the ID and userPWD is already exist in the Map area or not exist
        Scanner sc = new Scanner(System.in);

        while (true) {
            out.println("아이디 및 비밀번호를 입력하세요.");

            out.println("아이디 : ");
            String id = sc.nextLine();

            out.println("비밀번호 : ");
            String pwd = sc.nextLine();

            PersonDTO pDTO = map.get(id);

            if (id.equals("exit"))
                break;

            if (map.containsKey(id)) {
                if (pDTO.getUserPWD().equals(pwd)) {
                    out.println("로그인 되었습니다");
                    break;
                } else {
                    out.println("비밀번호가 일치하지 않습니다");
                }
            } else {
                out.println("입력하신 아이디가 존재하지 않습니다");
            }
        }

        sc.close();
    }
}

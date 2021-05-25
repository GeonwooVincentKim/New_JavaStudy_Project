package chap11;

import static java.lang.System.out;

public class StringCharAtExample {
    public static void main(String[] args) {
        String ssn = "010624-4230123";
        char gender = ssn.charAt(7);
        
        out.println(gender);

        switch(gender){
            case '1':   out.println("여자입니다."); break;
            case '2':   out.println("남자입니다."); break;
            case '3':   out.println("남자입니다."); break;
            case '4':   out.println("여자입니다."); break;
        }
    }
}

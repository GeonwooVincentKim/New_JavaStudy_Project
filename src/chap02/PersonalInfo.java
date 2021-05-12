package chap02;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("[필수 정보 입력]");
        System.out.print("이름 : ");
        String strName = sc.nextLine();
        // System.out.println(strName);

        System.out.print("주민번호 앞 6자리 : ");
        String strID = sc.nextLine();

        System.out.print("전화번호 : ");
        String strNum = sc.nextLine();

        System.out.println();

        System.out.println("[입력한 내용]");
        System.out.println(strName + " - 이름");
        System.out.println(strID);
        System.out.println(strNum);
    }
}

package chap11;

import java.util.Scanner;

import static java.lang.System.out;

public class NewStringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("줄 수를 입력하세요 : ");

        String getData = "";

        int readLine = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < readLine; i++){
            out.println("=== 문자열을 입력하세요 ===");
            getData = sc.nextLine();
            extracted(getData);
        }

        sc.close();
    }

    private static boolean extracted(String getData) {
        int n = getData.length();
        for(int j = 0; j < n / 2; j++){
            if(getData.charAt(j) != getData.charAt(n - j - 1)){
                out.println("=== 출력 결과 ===");
                out.println("false");
                return false;
            }
        }

        out.println("=== 출력 결과 ===");
        out.println("true");
        return true;
    }
}

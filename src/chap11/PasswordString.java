package chap11;

import java.util.Scanner;

public class PasswordString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String getUserInput = sc.nextLine();
        
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < getUserInput.length(); i++){
            if(getUserInput.charAt(i) == 'c' || getUserInput.charAt(i) == 'C'){
                count1++;
                if(i < getUserInput.length() - 1 && (getUserInput.charAt(i+1)=='c' || getUserInput.charAt(i+1)=='C')){
                    count2++;
                }
            }
        }

        System.out.println(count1 + "\n" + count2);
        sc.close();
    }
}

package chap12.LogTest;

import static java.lang.System.out;

import java.util.Scanner;

public class LogTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get the involution value
        int n = sc.nextInt();
        int inValue = sc.nextInt();
        int c = sc.nextInt();

        int result = 1; 
        for(int i = 1; i <= inValue; i++){
            result = result * n % c;
        }

        // result %= c;

        out.println(result);

        sc.close();
    }
}

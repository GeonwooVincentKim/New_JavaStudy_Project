package chap11;

import java.util.Date;
import java.util.Scanner;

import static java.lang.System.out;

public class ToStringExample {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Date obj2 = new Date();
        
        out.println(obj1.toString());
        out.println(obj2.toString());

        Scanner sc = new Scanner(System.in);
        int readLine = sc.nextInt();

        int t_data = 0;
        int []t_storeData = new int[readLine];
        String getData = "";

        for(int i = 0; i < readLine; i++){
            t_data = sc.nextInt();
            t_storeData[i] = t_data;
            // getData = t_data + " ";
            getData = String.valueOf(t_storeData[i]);
            out.print(getData.toString() + " ");
        }
        
        out.println();
        out.println(t_data);

        sc.close();
    }
}

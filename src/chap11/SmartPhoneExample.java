package chap11;

import static java.lang.System.out;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

        String strObj = myPhone.toString();
        out.print(strObj + "\n");
        
        char[] charObj = null;

        for(int i = 0; i < 3; i++){
            charObj = strObj.toCharArray();
        }
        
        out.println(myPhone);
        
        out.print("-------");
        out.print(charObj);
        out.print("-------");
    }
}

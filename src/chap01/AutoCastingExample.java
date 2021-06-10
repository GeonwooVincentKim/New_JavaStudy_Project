package chap01;

import static java.lang.System.out;

public class AutoCastingExample {
    public static void main(String[] args) throws Exception {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
        out.println(byteValue1);
        out.println(byteValue2);
        // byte byteValue3 = byteValue1 + byteValue2;
        // out.println(byteValue3);

        byte byteValue3 = 10;
        double doubleValue = byteValue3;
        out.println(doubleValue);

        // Cannot complie when the type of value is smaller than the big type
        // Like type `byte` value cannot get the `double` value.

        char charValue1 = 'A';
        char charValue2 = 1;
        int intValue2 = charValue1 + charValue2;
        out.println("유니코드=" + intValue2);
        out.println("출력문자=" + (char) intValue2);

        int intValue3 = 10;
        int intValue4 = intValue3 / 4;
        out.println(intValue4);

        int intValue5 = 10;
        double doubleValue1 = intValue5 / 4.0;
        out.println(doubleValue1);

        int intValueTest = 10;
        byte byteValue = (byte) intValueTest;
        out.println(byteValue);
    }
}

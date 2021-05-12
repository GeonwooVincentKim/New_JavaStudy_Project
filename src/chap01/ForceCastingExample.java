package chap01;

public class ForceCastingExample {
    public static void main(String[] args) throws Exception {
        int intValue0 = 44032;
        char charValue0 = (char) intValue0;
        System.out.println(charValue0);

        System.out.println("");

        int intValue = 54736;
        char charValue = (char) intValue;
        System.out.print(charValue + ", ");

        int intValue1 = 45824;
        char charValue1 = (char) intValue1;
        System.out.print(charValue1);

        int intValue2 = 48149;
        char charValue2 = (char) intValue2;
        System.out.print(charValue2 + "!!");
    }
}

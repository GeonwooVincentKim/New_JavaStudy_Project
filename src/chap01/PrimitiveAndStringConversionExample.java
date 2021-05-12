package chap01;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) throws Exception {
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 : " + value1);
        System.out.println("value2 : " + value2);
        System.out.println("value3 : " + value3);

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);

        char c1 = 'a';
        int c2 = c1 + 1;
        System.out.println(c2);

        int x = 5;
        int y = 2;
        // int result = x / y;
        double result = (double) x / y;
        System.out.println(result);

        double var1 = 3.5;
        double var2 = 2.7;
        int result1 = (int)(var1 + var2);
        System.out.println(result1);

        long var1_1 = 2L;
        float var2_1 = 1.8f;
        double var3_1 = 2.5;
        String var4_1 = "3.9";
        int result2 = (int) (var1_1 + var2_1 + var3_1) + (int) Float.parseFloat(var4_1);
        System.out.println(result2);
    }
}

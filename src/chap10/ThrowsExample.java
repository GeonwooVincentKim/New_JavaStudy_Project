package chap10;

import static java.lang.System.out;

public class ThrowsExample {

    public static void findClass2() {
        try {
            // Class clazz = Class.forName("java.lang.String2");
            Class.forName("java.lang.String2");
        } catch (ClassNotFoundException e) {
            // e.printStackTrace();
            out.println("클래스가 없어요..");
        }
    }

    public static void main(String[] args) throws Exception {
        findClass2();
    }

    // public static void main(String[] args) {
    // try{
    // findClass();
    // } catch(ClassNotFoundException e){
    // out.println("클래스가 존재하지 않습니다.");
    // }
    // }

    // public static void findClass() throws ClassNotFoundException{
    // Class clazz = Class.forName("java.lang.String2");
    // }
}

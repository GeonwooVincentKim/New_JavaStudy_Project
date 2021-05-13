package chap07;

public class InstanceofExample {
    public static void method1(Parent parent){
        if(parent instanceof Child){
            // System.out.println(parent);
            // Child child = (Child) parent;
            System.out.println("method1 -> Child 로 변환 성공");
        } else {
            System.out.println("method1 != Child 로 변환되지 않음");
        }
    }

    public static void method2(Parent parent){
        // Child child = (Child) parent;
        System.out.println("method2 -> Child 로 변환 성공");
    }

    public static void main(String[] args) {
        Parent parentA = new Child();
        method1(parentA);
        method2(parentA);

        Parent parentB = new Child();
        method1(parentB);
        method2(parentB); // 예외가 전혀 발생하지
    }
}

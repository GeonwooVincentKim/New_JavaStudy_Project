package chap06;

public class SingletonExample {
    public static void main(String[] args) {
        // SingletonService obj1 = new SingletonService();
        // SingletonService obj2 = new SingletonService();
        SingletonService obj1 = SingletonService.getInstance();
        SingletonService obj2 = SingletonService.getInstance();
        
        if (obj1 == obj2) {
            System.out.println("같은 Singleton 객체입니다.");
        } else {
            System.out.println("다른 Singleton 객체입니다.");
        }
    }
}

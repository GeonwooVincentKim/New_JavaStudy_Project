package chap06;

public class SingletonService {
    private static SingletonService singletonService = new SingletonService();

    private SingletonService() {}

    static SingletonService getInstance(){
        return singletonService;
    }
}

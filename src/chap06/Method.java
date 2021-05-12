package chap06;

public class Method {
    String id;
    String password;

    boolean login(String id, String password){
        if(id == null){
            return false;
        }
        return true;
    }

    void logout(String id){
        System.out.println("로그아웃 되었습니다.");
    }
}

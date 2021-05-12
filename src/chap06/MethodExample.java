package chap06;

public class MethodExample {
    public static void main(String[] args) throws Exception {
        Method mService = new Method();
        boolean result = mService.login("hong", "12345");

        if(result) {
            System.out.println("로그인 성공");
            mService.logout("hong");
        } else {
            System.out.println("id 또는 password가 존재하지 않습니다.");
        }
    }
}

package chap11;

import static java.lang.System.out;

public class FindAndReplaceExample {
    public static void main(String[] args) {
        String str = "Everyprogram can be developed as 자바";
        int index = str.indexOf("자바");

        if(index == -1){
            out.println("자바 String is not included in this program");
        } else {
            out.println("자바 String has already included in this program");
            str = str.replace("자바", "JAVA");
            out.println("--> " + str);
        }
    }
}

package chap11;

public class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os){
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString(){
        return company + ", " + os;
    }

    // @Override
    // public char[] toCharArray(){
    //     String str1 = company + ", " + os;
    //     char[] result = str1.toCharArray();
        
    //     return result;
    // }
}
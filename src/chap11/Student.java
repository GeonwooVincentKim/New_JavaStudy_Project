package chap11;

public class Student {
    private String stuNum;

    public Student(String stuNum){
        this.stuNum = stuNum;
    }

    public String getStuNum(){
        return stuNum;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student student = (Student) obj;

            // if(this.stuNum == student.getStuNum()){
            if(this.stuNum.equals(student.getStuNum())){
                return true;
            }
        }
        
        return false;
    }

    @Override
    public int hashCode(){
        return stuNum.hashCode();
    }
}

package chap13;

public class Student {
    public int sno;
    public String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student stu = (Student) obj;
            return (sno == stu.sno) && (name.equals(stu.name));
        } else {
            return false;
        }
    }

    public int hashCode() {
        return sno + name.hashCode();
    }
}

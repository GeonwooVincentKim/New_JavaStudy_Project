package chap10;
import static java.lang.System.out;

public class Member {
    public String id;

    public Member(String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        // out.println(obj.getClass() + " : Current Obj type");
        
        if(obj instanceof Member){
            Member member = (Member) obj;
            out.println(member.getClass() + " : Current Type");
            out.println(id.length() + " : ID Length");

            // out.println(id.charAt(3) + " : ID Type");
            // id -> Parameter of Equals function
            if(id.equals(member.id)){
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode(){
        return id.hashCode();
    }
}

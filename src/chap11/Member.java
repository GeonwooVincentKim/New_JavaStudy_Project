package chap11;

public class Member {
    private String id;
    private String name;

    public Member(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member){
            Member member = (Member) obj;

            if(this.id.equals(member.getId()) && this.name.equals(member.getName())){
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString(){
        return id + ", " + name;
    }
}

package chap13.Map.MapSet.PeopleID;

public class PersonDTO {
    private String userID;
    private String userPWD;
    private String name;
    private int age;

    public PersonDTO(String userID, String userPWD, String name, int age) {
        this.userID = userID;
        this.userPWD = userPWD;
        this.name = name;
        this.age = age;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserPWD() {
        return userPWD;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

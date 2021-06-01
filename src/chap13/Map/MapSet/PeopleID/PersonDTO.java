package chap13.Map.MapSet.PeopleID;

public class PersonDTO {
    String userID;
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

    public boolean equals(Object obj) {
        if (obj instanceof PersonDTO) {
            PersonDTO pDTO = (PersonDTO) obj;
            return (userID == pDTO.userID) && (userPWD == pDTO.userPWD);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return userID.hashCode() + userPWD.hashCode();
    }
}

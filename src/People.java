
public class People {
	private Person person;
    private String userType;
    
    // Constructor
    public People(Person person, String userType) {
        this.person = person;
        this.userType = userType;
    }
    
    // Getter ve Setter metotlarý
    public Person getPerson() {
        return person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    
    public String getUserType() {
        return userType;
    }
    
    public void setUserType(String userType) {
        this.userType = userType;
    }
}


public class User {
	private String name;
    private String surname;
    private int phoneNumber;
    private int IDNumber;
    private String userType;
    
    // Constructor
    public User(String name, String surname, int phoneNumber, int IDNumber, String userType) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.IDNumber = IDNumber;
        this.userType = userType;
    }
    
    // Getter ve Setter metotlarý
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public int getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public int getIDNumber() {
        return IDNumber;
    }
    
    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }
    
    public String getUserType() {
        return userType;
    }
    
    public void setUserType(String userType) {
        this.userType = userType;
    }
}

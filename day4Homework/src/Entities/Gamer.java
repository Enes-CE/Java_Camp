package Entities;

public class Gamer extends User{

    private String firstName;
    private String lastName;
    private String identityNumber;
    private int birthDate;

    public Gamer(){

    }

    public Gamer(String firstName, String lastName, String  identityNumber, int birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityNumber = identityNumber;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String  getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String  identityNumber) {
        this.identityNumber = identityNumber;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
}

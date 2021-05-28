package Entities;

public class User {
    private int id;
    private String e_mail;

    public User() {
    }

    public User(int id, String e_mail) {
        this.id = id;
        this.e_mail = e_mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
}

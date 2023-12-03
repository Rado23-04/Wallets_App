package Model;

import java.util.Objects;

public class Account {
    private int id;
    private String first_name;
    private String last_name;
    private String birthday;
    private char gender;
    private String CIN;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && gender == account.gender && Objects.equals(first_name, account.first_name) && Objects.equals(last_name, account.last_name) && Objects.equals(birthday, account.birthday) && Objects.equals(CIN, account.CIN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, birthday, gender, CIN);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public Account(int id, String first_name, String last_name, String birthday, char gender, String CIN) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthday = birthday;
        this.gender = gender;
        this.CIN = CIN;
    }
}

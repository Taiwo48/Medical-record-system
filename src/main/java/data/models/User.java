package data.models;

public class User {
    private String fullName;
    private String email;
    private String userName;
    private String password;

    public User(String fullName, String email, String userName, String password) {
        this.fullName = fullName;
        this.email = email;
        this.userName = userName;
        this.password = password;

    }



    public boolean verifyPassword(String password) {
        return this.password.equals(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}

package data.models;

public class User {
    public String fullName;
    public int userId;
    public String email;
    public String userName;
    public String password;
//    private Profile profile;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public Profile getProfile() {
//        return profile;
//    }
//
//    public void setProfile(Profile profile) {
//        this.profile = profile;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

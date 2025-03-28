package org.Medical;

public class User {
    protected String fullName;
    protected String password;
    protected String userId;
    protected String userType;

    public User(String fullName, String password, String userId, String userType) {
        this.fullName = fullName;
        this.password = password;
        this.userId = userId;
        this.userType = userType;
    }

    public void register() {
        System.out.println(fullName + " registered successfully.");
    }

    public void login() {
        System.out.println(fullName + " logged in successfully.");
    }

    public String getFullName() {
        return fullName;
    }

    public String getPassword() {
        return password;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}

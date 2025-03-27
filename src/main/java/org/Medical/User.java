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
    }




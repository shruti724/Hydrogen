package com.example.hydrogen;

public class UserHelperClass {

    String user, pass, repass;

    public UserHelperClass() {

    }

    public UserHelperClass(String user, String pass, String repass) {
        this.user = user;
        this.pass = pass;
        this.repass = repass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRepass() {
        return repass;
    }

    public void setRepass(String repass) {
        this.repass = repass;
    }
}

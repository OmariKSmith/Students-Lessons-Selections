package org.javaclass.Solutions;

//!                             Create a method named login that checks an int password
//!                             Output "Welcome" if password matches.
//!                             Output "bad password" if password does not match.
public class LoginPage {
    int password = 12345;

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(1235);
    }

    void login(int password){
        if(password == getPassword()){
            System.out.println(" Welcome ");
        }
        else {
            System.out.println("bad password");
        }
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}

package org.javaclass.Solutions;

//!                             Create a method named checkZip that checks an int zip code
//!                             Output "Zip code match" if zip code matches.
//!                             Output "Bad zip code" if zip code does not match.
public class CheckZipCode {
    int zipCode = 12345;

    public static void main(String[] args) {
        CheckZipCode zipChecker = new CheckZipCode();
        zipChecker.checkZip(1235);
    }

    void checkZip(int zipCode){
        if(zipCode == getZipCode()){
            System.out.println(" Zip code match ");
        }
        else {
            System.out.println("Bad zip code");
        }
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setPassword(int zipCode) {
        this.zipCode = zipCode;
    }
}

package org.javaclass.Solutions;

//!                             Create a method named 'validate' that accepts the Strings password
//!                             and username as parameter arguments.

//!                             The method should return true if both username and password match
//!                             the username and password stored in the Database class;

import org.javaclass.exercises.Database;

public class Validator {

    boolean validate(String username, String password){
        if(username.equals(Database.getUsername()) && password.equals(Database.getPassword())){
            return true;
        }
        return false;
    }
}

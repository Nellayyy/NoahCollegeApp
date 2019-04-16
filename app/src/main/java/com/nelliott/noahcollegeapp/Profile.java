package com.nelliott.noahcollegeapp;

import java.util.Date;

public class Profile {

    String lastName = "Elliott";
    String firstName = "Noah";
    Date dateOfBirth;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Profile(){
        dateOfBirth = new Date();
    }


}

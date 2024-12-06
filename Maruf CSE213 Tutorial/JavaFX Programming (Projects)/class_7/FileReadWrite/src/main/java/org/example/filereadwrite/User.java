package org.example.filereadwrite;

import java.io.Serializable;
import java.time.LocalDate;

public class User implements Serializable {
    private String firstname, lastname, address, language, gender;
    private String phonenumber;
    protected String email, password;
    private LocalDate dateofbirth;

    public User(String firstname, String lastname, String gender, String email, String phonenumber, LocalDate dateofbirth, String address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.gender = gender;
        this.phonenumber = phonenumber;
        this.email = email;
        this.dateofbirth = dateofbirth;
    }

    public User() {
    }

    // Getters and setters...

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", email='" + email + '\'' +
                ", dateofbirth=" + dateofbirth +
                '}';
    }
}

package com.example.workbook.ch2;

import java.util.Date;

public class OverrideString {
    private final String name;
    private final String password;
    private final String firstname;
    private final String lastname;
    private final String email;
    private final Date created;

    public OverrideString(String name, String password, String firstname, String lastname, String email, Date created) {
        this.name = name;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public Date getCreated() {
        return created;
    }



    @Override
    public String toString() {
        return "OverrideString{" +
                "name='" + name + '\'' +
//                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", created=" + created +
                '}';
    }
}

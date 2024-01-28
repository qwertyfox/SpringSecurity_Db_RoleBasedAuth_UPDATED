package com.qwertyfox.TheFox.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "username_password")
public class AppUsernamePassword {

    @Id
    private int userID;
    private String username;
    private String password;

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

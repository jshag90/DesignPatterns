package com.ji.structural_patterns.adapter.after;

import com.ji.structural_patterns.adapter.after.security.UserDetails;

public class Account implements UserDetails {

    private String name;

    private String password;

    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getUsername() {
        return this.name;
    }

    @Override
    public String getPassword() {
        return this.password;
    }
}

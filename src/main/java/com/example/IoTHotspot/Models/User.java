package com.example.IoTHotspot.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String confirm_password;
    private String token;

    public User() {
        //
    }

    public User(Long id, String name, String email, String password, String confirm_password, String token) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.confirm_password = confirm_password;
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(long l) {
        this.id = l;
    }

    public String getName() {
        return name;
    } 

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm_password() {
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
}

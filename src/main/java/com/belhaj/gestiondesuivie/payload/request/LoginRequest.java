package com.belhaj.gestiondesuivie.payload.request;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class LoginRequest {
    @NotBlank
    private String username;
    @NotBlank
    private String lastname;
    @NotBlank
    private String email;
    @NotBlank
    private Date dateNai;
    @NotBlank
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateNai() {
        return dateNai;
    }

    public void setDateNai(Date dateNai) {
        this.dateNai = dateNai;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
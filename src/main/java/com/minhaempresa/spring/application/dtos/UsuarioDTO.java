package com.minhaempresa.spring.application.dtos;

import org.springframework.security.core.userdetails.User;

import java.io.Serializable;

public class UsuarioDTO implements Serializable {

    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UsuarioDTO() {
    }

    public UsuarioDTO(String user, String password) {
        this.user = user;
        this.password = password;
    }
}

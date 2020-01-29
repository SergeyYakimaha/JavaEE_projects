package com.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
public class User {
    private long id;
    private String name;

    public User() {
        this.id = 10;
        this.name = "Component Bean";
    }

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
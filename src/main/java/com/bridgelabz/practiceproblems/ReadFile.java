package com.bridgelabz.practiceproblems;

import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;

class User {
    private String name;
    private String email;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
public class ReadFile {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        try {
            User user = mapper.readValue(new FileReader("User.json"), User.class);
            System.out.println(user.getName());
            System.out.println(user.getEmail());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

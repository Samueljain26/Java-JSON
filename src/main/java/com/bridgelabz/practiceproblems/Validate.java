package com.bridgelabz.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;

class User2 {
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


public class Validate {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            User2 user = mapper.readValue(new FileReader("User.json"), User2.class);
            System.out.println("Valid");
        } catch (Exception e) {
            System.out.println("Invalid "+ e.getMessage());;
        }
    }
}

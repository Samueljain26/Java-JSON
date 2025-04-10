package com.bridgelabz.handsonproblem;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

class User3 {
    private String name;
    private int id;

    public User3(String name, int id) {
        this.name = name;
        this.id = id;
    }

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
}

public class JavaListToJsonArray2 {
    public static void main(String[] args) {
        List<User3> list = new ArrayList<>();
        list.add(new User3("Samuel",1));
        list.add(new User3("B",2));
        list.add(new User3("C",3));

        try{
            ObjectMapper mapper =new ObjectMapper();
            String json = mapper.writeValueAsString(list);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

}

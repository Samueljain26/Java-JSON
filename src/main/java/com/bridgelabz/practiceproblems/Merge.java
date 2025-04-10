package com.bridgelabz.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Merge {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode obj1 = mapper.createObjectNode();
        obj1.put("Name","samuel");
        obj1.put("Age",21);

        ObjectNode obj2 = mapper.createObjectNode();
        obj2.put("number","1234");
        obj2.put("school","DPS");

        obj1.setAll(obj2);

        System.out.println(obj1.toString());
    }
}

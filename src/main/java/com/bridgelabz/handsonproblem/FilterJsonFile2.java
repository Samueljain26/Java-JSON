package com.bridgelabz.handsonproblem;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;

public class FilterJsonFile2 {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        JsonNode array = mapper.readTree(new FileReader("Age.json"));
        for(JsonNode node: array){
            int age = node.get("age").asInt();
            if(age>25){
                String name =node.get("name").asText();
                System.out.println("Name: "+name + ", Age: "+ age);

            }
        }
    }
}

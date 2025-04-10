package com.bridgelabz.handsonproblem;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class ReadJsonFile {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(new FileReader("User.json"));

        Iterator<Map.Entry<String, JsonNode>> root = node.fields();
        while (root.hasNext()){
            Map.Entry<String, JsonNode> entry = root.next();
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }

        }
    }

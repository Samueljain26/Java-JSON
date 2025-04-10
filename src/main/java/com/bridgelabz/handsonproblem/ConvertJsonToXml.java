package com.bridgelabz.handsonproblem;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.json.XML;

import java.io.File;

public class ConvertJsonToXml {
    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            JsonNode json = mapper.readTree(new File("User.json"));

            JSONObject jsonObject = new JSONObject(mapper.writeValueAsString(json));
            String xml = XML.toString(jsonObject);
            System.out.println(xml);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

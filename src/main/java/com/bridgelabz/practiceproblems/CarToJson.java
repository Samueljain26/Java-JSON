package com.bridgelabz.practiceproblems;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

class Car {
    private String brand;
    private String model;
    private int year;
    private double price;

    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class CarToJson {
    public static void main(String[] args) throws JsonProcessingException {
        Car car = new Car("Toyota", "Innova", 2025, 200000.00);

        ObjectMapper mapper =new ObjectMapper();
        try{
            String str = mapper.writeValueAsString(car);
            System.out.println(str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

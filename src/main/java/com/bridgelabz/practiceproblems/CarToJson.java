package com.bridgelabz.practiceproblems;

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
}

public class CarToJson {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Innova", 2025, 200000.00);

        Gson gson = new Gson();
        String str = gson.toJson(car);

        System.out.println(str);
    }
}

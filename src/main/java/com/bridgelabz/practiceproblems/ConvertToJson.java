package com.bridgelabz.practiceproblems;

import java.util.*;
import com.google.gson.Gson;

class Student{
    private String name;
    private int age;
    private List<String> subjects;

    public Student(String name, int age,List<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects=subjects;
    }

}
public class ConvertToJson {
    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>();
        subjects.add("Maths");
        subjects.add("English");
        Student student = new Student("samuel", 21,subjects);
        Gson gson = new Gson();
        String str = gson.toJson(student);
        System.out.println(str);
    }
}
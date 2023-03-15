package com.ji.creational_patterns.prototype.java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student seonhak = new Student("seonhak");
        Student whiteship = new Student("whiteship");
        List<Student> students = new ArrayList<>();
        students.add(seonhak);
        students.add(whiteship);

        List<Student> clone = new ArrayList<>(students); //shallow copy
        System.out.println(clone);

    }
}

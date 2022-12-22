package com.ji.creational_patterns.builder._03_java;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        Stream.Builder<String> stringStreamBuilder = Stream.builder();
        Stream<String> names = Stream.<String>builder().add("seonhak").add("ji").build();
        names.forEach(System.out::println);
    }
}

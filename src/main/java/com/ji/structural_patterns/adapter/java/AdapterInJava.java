package com.ji.structural_patterns.adapter.java;

import java.io.*;
import java.util.*;

public class AdapterInJava {
    public static void main(String[] args) {
        // collections
        List<String> strings = Arrays.asList("a", "b", "c");//array를 List로 받아줌
        Enumeration<String> enumeration = Collections.enumeration(strings);
        ArrayList<String> list =  Collections.list(enumeration);

        // io
        try(InputStream is = new FileInputStream("input.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr)){
                while(reader.ready()){
                    System.out.println(reader.readLine());
                }
            }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

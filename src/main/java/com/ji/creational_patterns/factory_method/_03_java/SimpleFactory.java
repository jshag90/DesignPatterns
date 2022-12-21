package com.ji.creational_patterns.factory_method._03_java;

import com.ji.creational_patterns.factory_method._02_after.Blackship;
import com.ji.creational_patterns.factory_method._02_after.Whiteship;

public class SimpleFactory {

    public Object createProduct(String name){
        if(name.equals("whiteship")){
            return new Whiteship();
        }else if(name.equals("blackship")){
            return new Blackship();
        }

        throw new IllegalArgumentException();
    }
}

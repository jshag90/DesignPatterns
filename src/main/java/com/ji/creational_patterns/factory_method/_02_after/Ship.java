package com.ji.creational_patterns.factory_method._02_after;

import com.ji.creational_patterns.abstract_factory._02_after.Anchor;
import com.ji.creational_patterns.abstract_factory._02_after.Wheel;

public class Ship {

    private String name;

    private String color;

    private String logo;

    private Wheel wheel;

    private Anchor anchor;
    public String getColor() {
        return color;
    }

    public Anchor getAnchor() {
        return anchor;
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }

    public Wheel getWheel(){
        return wheel;
    }

    public void setWheel(Wheel wheel){
        this.wheel = wheel;
    }

}

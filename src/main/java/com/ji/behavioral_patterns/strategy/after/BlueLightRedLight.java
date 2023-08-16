package com.ji.behavioral_patterns.strategy.after;

public class BlueLightRedLight {

    void blueLight(Speed speed) {
        speed.blueLight();
    }

    void redLight(Speed speed) {
        speed.redLight();
    }

}

package com.ji.behavioral_patterns.strategy.before;

class BlueLightRedLight {

    private final int speed;

    public BlueLightRedLight(int speed) {
        this.speed = speed;
    }

    public void blueLight() {
        if (speed == 1) {
            System.out.println("무궁화 꽃 이");
        } else if (speed == 2) {
            System.out.println("무궁화꽃이");
        } else {
            System.out.println("무광꼬치");
        }
    }

    public void redLight() {
        if (speed == 1) {
            System.out.println("피 었 습 니 다.");
        } else if (speed == 2) {
            System.out.println("피었습니다.");
        } else {
            System.out.println("피어씀다.");
        }

    }

}

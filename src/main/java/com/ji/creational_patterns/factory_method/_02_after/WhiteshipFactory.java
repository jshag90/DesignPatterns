package com.ji.creational_patterns.factory_method._02_after;

public class WhiteshipFactory extends DefaultShipFactory{
    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}

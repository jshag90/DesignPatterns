package com.ji.creational_patterns.abstract_factory._02_after;

public class WhitePartsProFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchoPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}

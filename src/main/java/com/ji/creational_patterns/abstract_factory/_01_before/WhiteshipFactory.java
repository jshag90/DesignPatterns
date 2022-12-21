package com.ji.creational_patterns.abstract_factory._01_before;

import com.ji.creational_patterns.factory_method._02_after.DefaultShipFactory;
import com.ji.creational_patterns.factory_method._02_after.Ship;
import com.ji.creational_patterns.factory_method._02_after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return new Whiteship();
    }
}

package com.ji.creational_patterns.abstract_factory._02_after;

import com.ji.creational_patterns.abstract_factory._01_before.WhiteAnchor;
import com.ji.creational_patterns.abstract_factory._01_before.WhiteWheel;
import com.ji.creational_patterns.factory_method._02_after.DefaultShipFactory;
import com.ji.creational_patterns.factory_method._02_after.Ship;
import com.ji.creational_patterns.factory_method._02_after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory){
        this.shipPartsFactory = shipPartsFactory;
    }
    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return new Whiteship();
    }
}

package com.ji.creational_patterns.factory_method._02_after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteshipFactory(), "whiteship", "jshag90@naver.com");
        client.print(new BlackshipFactory(), "blackship", "jshag90@naver.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}

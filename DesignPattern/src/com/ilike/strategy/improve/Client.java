package com.ilike.strategy.improve;

public class Client {

    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        pekingDuck.fly();
    }
}

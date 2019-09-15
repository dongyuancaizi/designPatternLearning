package com.ilike.strategy.improve;

/**
 * 北京鸭
 */
public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior=new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }



}

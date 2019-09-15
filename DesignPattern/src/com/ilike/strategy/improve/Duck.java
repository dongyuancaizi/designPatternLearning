package com.ilike.strategy.improve;

/**
 * 鸭子抽象类
 */
public abstract class Duck {

     FlyBehavior flyBehavior;

    public Duck() {

    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public abstract void display();

    public void quack() {
        System.out.println("鸭子嘎嘎叫");
    }

    public void swim() {
        System.out.println("鸭子会游泳");
    }

    public void fly() {
       if(flyBehavior!=null){
           flyBehavior.fly();
       }
    }
}

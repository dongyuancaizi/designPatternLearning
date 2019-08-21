package com.ilike.abstractfactory.order;

import com.ilike.abstractfactory.pizza.*;

/**
 * 伦敦披萨工厂
 */
public class LDFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza=null;
        if(orderType.equals("cheese")){
            pizza=new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza=new LDPepperPizza();
        }
        return pizza;
    }
}

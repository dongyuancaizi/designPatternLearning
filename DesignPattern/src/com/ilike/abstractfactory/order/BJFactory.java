package com.ilike.abstractfactory.order;

import com.ilike.abstractfactory.pizza.BJCheesePizza;
import com.ilike.abstractfactory.pizza.BJPepperPizza;
import com.ilike.abstractfactory.pizza.Pizza;

/**
 * 北京披萨工厂
 */
public class BJFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza=null;
        if(orderType.equals("cheese")){
            pizza=new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza=new BJPepperPizza();
        }
        return pizza;
    }
}

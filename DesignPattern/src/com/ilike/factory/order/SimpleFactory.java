package com.ilike.factory.order;

import com.ilike.factory.pizza.CheesePizza;
import com.ilike.factory.pizza.GreekPizza;
import com.ilike.factory.pizza.PepperPizza;
import com.ilike.factory.pizza.Pizza;

/**
 * 简单工厂类
 */
public class SimpleFactory {

    /**
     * 根据orderType返回对应的披萨对象
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType) {
        //订购披萨的类型
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }


    //简单工厂模式，也叫静态工厂模式
    public static   Pizza createPizza2(String orderType) {
        //订购披萨的类型
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }

}

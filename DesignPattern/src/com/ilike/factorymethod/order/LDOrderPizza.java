package com.ilike.factorymethod.order;

import com.ilike.factorymethod.pizza.LDCheesePizza;
import com.ilike.factorymethod.pizza.LDPepperPizza;
import com.ilike.factorymethod.pizza.Pizza;

/**
 * 伦敦披萨订购
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}

package com.ilike.factorymethod.order;

import com.ilike.factorymethod.pizza.Pizza;
import com.ilike.factorymethod.pizza.BJCheesePizza;
import com.ilike.factorymethod.pizza.BJPepperPizza;

/**
 * 北京披萨订购
 */
public class BJOrderPizza extends OrderPizza {

    @Override
  public Pizza createPizza(String orderType) {
        Pizza pizza =null;
        if(orderType.equals("cheese")){
            pizza=new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza=new BJPepperPizza();
        }
        return pizza;
    }
}

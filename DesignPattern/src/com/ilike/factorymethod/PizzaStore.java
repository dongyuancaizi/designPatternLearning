package com.ilike.factorymethod;

import com.ilike.factorymethod.order.BJOrderPizza;
import com.ilike.factorymethod.order.LDOrderPizza;

public class PizzaStore {

    public static void main(String[] args) {
        //创建北京口味的各种披萨
       // new BJOrderPizza();
        new LDOrderPizza();
    }
}

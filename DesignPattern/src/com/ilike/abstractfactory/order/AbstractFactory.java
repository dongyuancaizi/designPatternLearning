package com.ilike.abstractfactory.order;

import com.ilike.abstractfactory.pizza.Pizza;

/**
 * 抽象工厂模式的抽象层
 */
public interface AbstractFactory {
    /**
     * 工厂子类具体实现
     * @return
     */
     Pizza createPizza(String orderType);
}

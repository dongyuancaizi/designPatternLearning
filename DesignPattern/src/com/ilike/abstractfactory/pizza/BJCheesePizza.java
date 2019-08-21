package com.ilike.abstractfactory.pizza;

/**
 * 北京奶酪披萨
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("给北京的奶酪披萨准备材料");
    }
}

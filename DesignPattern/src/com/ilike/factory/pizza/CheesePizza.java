package com.ilike.factory.pizza;

/**
 * 奶酪披萨
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备制作奶酪披萨的材料");
    }
}

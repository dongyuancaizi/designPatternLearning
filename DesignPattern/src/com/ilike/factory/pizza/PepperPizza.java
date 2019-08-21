package com.ilike.factory.pizza;

/**
 * 胡椒披萨
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备制作胡椒披萨的原材料");
    }
}

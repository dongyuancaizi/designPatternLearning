package com.ilike.abstractfactory.pizza;

/**
 * 伦敦胡椒披萨
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("给伦敦胡椒披萨准备材料");
    }
}

package com.ilike.decorator;

/**
 * 咖啡
 */
public class Coffee  extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}

package com.ilike.decorator;

/**
 * 牛奶（调味品）
 */
public class Milk extends Decorator{

    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        //调味品的价格
        setPrice(2.0F);
    }

}

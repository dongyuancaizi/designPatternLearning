package com.ilike.decorator;

/**
 * 巧克力（调味品）
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        //调味品的价格
        setPrice(3.0F);
    }

}

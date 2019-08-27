package com.ilike.decorator;

/**
 * 豆浆（调味品）
 */
public class Soy extends Decorator{

    public Soy(Drink drink) {
        super(drink);
        setDes("豆浆");
        //调味品的价格
        setPrice(1.5F);
    }

}

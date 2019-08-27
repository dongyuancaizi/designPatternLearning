package com.ilike.decorator;

/**
 * 装饰者
 */
public class Decorator extends Drink {

    private Drink drink;

    @Override
    public String getDes() {
        //drink.getDes()被装饰者的信息
        return super.getDes()+"  "+ super.getPrice() +"&&" +drink.getDes();
    }

    public Decorator(Drink drink) {
        this.drink = drink;
    }


    @Override
    public float cost() {
        //getPrice自己的价格
        return super.getPrice()+drink.cost();
    }
}

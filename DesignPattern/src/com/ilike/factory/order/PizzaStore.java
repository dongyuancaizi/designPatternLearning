package com.ilike.factory.order;

/**
 * 相当于客户端，发出订购任务
 */
public class PizzaStore {

    public static void main(String[] args) {
        //OrderPizza orderPizza = new OrderPizza();
        //使用简单工厂模式
      //  OrderPizza orderPizza= new OrderPizza(new SimpleFactory());
      //  System.out.println("退出程序");
        new OrderPizza2();
    }
}

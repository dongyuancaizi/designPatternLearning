package com.ilike.decorator;

/**
 * 咖啡店
 */
public class CoffeeBar {

    public static void main(String[] args) {
        //1.先点一份美式咖啡
        Drink order = new LongBlack();
        System.out.println("费用    "+order.getDes() +"    " +order.cost());
        //2.加入一份牛奶
        order= new Milk(order);
        System.out.println("费用    "+order.getDes() +"    " +order.cost());
        //3.再加入一份巧克力
        order= new Chocolate(order);
        System.out.println("费用    "+order.getDes() +"    " +order.cost());
        //4.再加入一份巧克力
        order= new Chocolate(order);
        System.out.println("费用    "+order.getDes() +"    " +order.cost());
        System.out.println("--------------");

        Drink order2 = new Decaf();
        System.out.println("费用    "+order2.getDes() +"    " +order2.cost());
        //加入一份牛奶
        order2= new Milk(order2);
        System.out.println("费用    "+order2.getDes() +"    " +order2.cost());
    }
}

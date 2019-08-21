package com.ilike.abstractfactory.order;

import com.ilike.abstractfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public  class OrderPizza {

    private AbstractFactory abstractFactory;

    public OrderPizza(AbstractFactory abstractFactory){
        setAbstractFactory(abstractFactory);
    }


    private void setAbstractFactory(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
        Pizza pizza=null;
        //订购披萨的类型
        String orderType;
        do {
            orderType=getType();
            pizza = abstractFactory.createPizza(orderType);
            if(pizza!=null){
                //输出披萨制作的过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购失败");
            }

        }while (true);
    }





    private Pizza pizza;


    /**
     * 获取客户希望订购的披萨
     *
     * @return
     */
    private String getType() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type");
            String str = br.readLine();
            return str;
        } catch (Exception e) {

        }
        return null;
    }
}

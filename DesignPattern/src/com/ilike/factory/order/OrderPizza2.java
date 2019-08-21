package com.ilike.factory.order;

import com.ilike.factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza2 {


    private Pizza pizza;
    String orderType = "";

    public OrderPizza2(){
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);
            //输出披萨制作的过程
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购披萨失败");
                break;
            }
        } while (true);
    }

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

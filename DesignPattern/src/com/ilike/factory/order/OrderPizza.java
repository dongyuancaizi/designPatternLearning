package com.ilike.factory.order;

import com.ilike.factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {

    public OrderPizza(SimpleFactory sf){
        setSf(sf);
    }

   /* public OrderPizza() {
        Pizza pizza=null;
        //订购披萨的类型
        String orderType;
        do {
            orderType=getType();
            if(orderType.equals("greek")){
                pizza=new GreekPizza();
                pizza.setName("希腊披萨");
            }else if(orderType.equals("cheese")){
                pizza=new CheesePizza();
                pizza.setName("奶酪披萨");
            }else if(orderType.equals("pepper")){
                pizza=new PepperPizza();
                pizza.setName("胡椒披萨");
            }else{
                break;
            }
            //输出披萨制作的过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }*/

    private SimpleFactory sf;

    private Pizza pizza;

    public SimpleFactory getSf() {
        return sf;
    }

    public void setSf(SimpleFactory sf) {
        String orderType = "";
        this.sf = sf;
        do {
            orderType = getType();
            pizza = sf.createPizza(orderType);
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

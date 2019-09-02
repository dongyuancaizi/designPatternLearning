package com.ilike.template.improve;

public class Client {

    public static void main(String[] args) {

        //制作红豆豆浆
        System.out.println("-------制作红豆豆浆---------");
        SoyaMilk soyaMilk = new RedBeanSoyaMilk();
        soyaMilk.make();

        //制作花生豆浆
        System.out.println("-------制作花生豆浆---------");
        SoyaMilk soyaMilk2 = new PennutSoyaMilk();
        soyaMilk2.make();

        //制作纯豆浆
        System.out.println("-------制作纯豆浆---------");
        SoyaMilk soyaMilk3 = new PureSoyaMilk();
        soyaMilk3.make();
    }
}

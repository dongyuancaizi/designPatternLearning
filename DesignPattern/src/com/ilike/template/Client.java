package com.ilike.template;

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
    }
}

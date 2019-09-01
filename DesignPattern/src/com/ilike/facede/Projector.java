package com.ilike.facede;

/**
 * 投影仪
 */
public class Projector {

    private static Projector projector = new Projector();

    private Projector(){

    }

    public static Projector getInstance(){
        return projector;
    }

    public void on(){
        System.out.println("投影仪打开");
    }
    public void off(){
        System.out.println("投影仪关闭");
    }
    public void focus(){
        System.out.println("投影仪聚焦");
    }

}

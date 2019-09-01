package com.ilike.facede;

/**
 * 爆米花机
 */
public class Popcorn {

    private static Popcorn popcorn = new Popcorn();

    private Popcorn(){

    }

    public static Popcorn getInstance(){
        return popcorn;
    }

    public void on(){
        System.out.println("爆米花机打开");
    }
    public void off(){
        System.out.println("爆米花机关闭");
    }
    public void pop(){
        System.out.println("爆米花机工作");
    }

    public void pause(){
        System.out.println("爆米花机暂停");
    }
}

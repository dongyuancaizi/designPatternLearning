package com.ilike.facede;

/**
 * 影院的灯光
 */
public class TheaterLight {

    private static TheaterLight theaterLight = new TheaterLight();

    private TheaterLight(){

    }

    public static TheaterLight getInstance(){
        return theaterLight;
    }

    public void on(){
        System.out.println("影院的灯光打开");
    }
    public void off(){
        System.out.println("影院的灯光关闭");
    }
    public void dim(){
        System.out.println("影院的灯光调暗");
    }
    public void bright(){
        System.out.println("影院的灯光调亮");
    }

}

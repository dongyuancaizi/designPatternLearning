package com.ilike.facede;

/**
 * 屏幕
 */
public class Screen {

    private static Screen screen = new Screen();

    private Screen(){

    }

    public static Screen getInstance(){
        return screen;
    }

    public void up(){
        System.out.println("屏幕上升");
    }
    public void down(){
        System.out.println("屏幕下降");
    }

}

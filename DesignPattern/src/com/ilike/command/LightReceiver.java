package com.ilike.command;

/**
 * 命令接受者
 */
public class LightReceiver {

    public void on(){
        System.out.println("电灯打开");
    }

    public void off(){
        System.out.println("电灯关闭");
    }
}

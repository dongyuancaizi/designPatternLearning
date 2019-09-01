package com.ilike.facede;

/**
 * DVD
 */
public class DVDPlayer {

    private static  DVDPlayer dvdPlayer = new DVDPlayer();

    private DVDPlayer(){

    }

    public static DVDPlayer getInstance(){
        return dvdPlayer;
    }

    public void on(){
        System.out.println("DVD打开");
    }
    public void off(){
        System.out.println("DVD关闭");
    }
    public void play(){
        System.out.println("DVD播放");
    }

    public void pause(){
        System.out.println("DVD暂停");
    }
}

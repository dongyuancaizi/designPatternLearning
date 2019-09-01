package com.ilike.facede;

/**
 * 立体声
 */
public class Stereo {

    private static Stereo stereo = new Stereo();

    private Stereo() {

    }

    public static Stereo getInstance() {
        return stereo;
    }

    public void on() {
        System.out.println("立体声打开");
    }

    public void off() {
        System.out.println("立体声关闭");
    }

    public void up() {
        System.out.println("立体声调大");
    }

}

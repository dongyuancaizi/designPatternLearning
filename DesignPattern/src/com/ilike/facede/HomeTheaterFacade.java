package com.ilike.facede;

/**
 * 家庭影院
 */
public class HomeTheaterFacade {

    //顶一各个子系统对象
    private TheaterLight theaterLight;

    private Popcorn popcorn;

    private Stereo stereo;

    private Projector projector;

    private Screen screen;

    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    //操作步骤分成4步

    /**
     * 准备
     */
    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    /**
     * 播放
     */
    public void play(){
        dvdPlayer.play();
    }

    /**
     * 暂停
     */
    public void pause(){
        dvdPlayer.pause();
    }

    /**
     * 结束
     */
    public void end(){
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();

    }
}

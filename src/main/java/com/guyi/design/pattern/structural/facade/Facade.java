package com.guyi.design.pattern.structural.facade;

/**
 * 外观类
 *
 * @author 孤诣
 */
public class Facade {
    /**
     * DVD
     */
    private final DvdPlay dvdPlay;

    /**
     * 爆米花机
     */
    private final Popcorn popcorn;

    public Facade() {
        this.dvdPlay = DvdPlay.getInstance();
        this.popcorn = Popcorn.getInstance();
    }

    /**
     * 准备工作
     */
    public void ready() {
        // 制作爆米花
        this.popcorn.on();
        this.popcorn.pong();
        this.popcorn.off();

        // 打开 DVD
        this.dvdPlay.on();
    }

    /**
     * 播放
     */
    public void play() {
        this.dvdPlay.play();
    }

    /**
     * 结束
     */
    public void end() {
        this.dvdPlay.off();
    }
}

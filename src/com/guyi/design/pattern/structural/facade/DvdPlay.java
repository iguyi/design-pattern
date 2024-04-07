package com.guyi.design.pattern.structural.facade;

/**
 * DVD
 *
 * @author 孤诣
 */
public class DvdPlay {
    private static volatile DvdPlay instance;

    private DvdPlay() {
    }

    /**
     * 获取 DvdPlay 实例
     *
     * @return DvdPlay
     */
    public static DvdPlay getInstance() {
        if (instance == null) {
            synchronized (DvdPlay.class) {
                if (instance == null) {
                    instance = new DvdPlay();
                }
            }
        }
        return instance;
    }

    public void on() {
        System.out.println("DVD 开机");
    }

    public void off() {
        System.out.println("DVD 关机");
    }

    public void play() {
        System.out.println("DVD 播放");
    }
}

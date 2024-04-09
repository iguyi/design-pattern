package com.guyi.design.pattern.structural.facade;

/**
 * 爆米花机
 *
 * @author 孤诣
 */
public class Popcorn {
    private static volatile Popcorn instance;

    private Popcorn() {
    }

    public static Popcorn getInstance() {
        if (instance == null) {
            synchronized (Popcorn.class) {
                if (instance == null) {
                    instance = new Popcorn();
                }
            }
        }
        return instance;
    }

    public void on() {
        System.out.println("爆米花机开启");
    }

    public void off() {
        System.out.println("爆米花机关闭");
    }

    public void pong() {
        System.out.println("爆米花机制作爆米花");
    }
}

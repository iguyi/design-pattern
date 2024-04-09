package com.guyi.design.pattern.behavioral.command;

/**
 * 【灯】命令的接收者
 *
 * @author 孤诣
 */
public class LightCommandReceiver {
    public void on() {
        System.out.println("开灯");
    }

    public void off() {
        System.out.println("关灯");
    }
}

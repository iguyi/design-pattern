package com.guyi.design.pattern.structural.facade;

/**
 * 测试外观模式
 *
 * @author 孤诣
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=========== 外观模式 ===========");
        Facade facade = new Facade();
        facade.ready();
        facade.play();
        facade.end();
    }
}

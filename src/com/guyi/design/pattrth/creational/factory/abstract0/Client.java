package com.guyi.design.pattrth.creational.factory.abstract0;

/**
 * 客户端代码
 *
 * @author 孤诣
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("======= 抽象工厂模式 =======");
        AbstractFactory factoryA = new ProductFactoryA();
        factoryA.createProduct("A1").operation();
        factoryA.createProduct("A2").operation();

        AbstractFactory factoryB = new ProductFactoryB();
        factoryB.createProduct("B1").operation();
        factoryB.createProduct("B2").operation();
    }
}
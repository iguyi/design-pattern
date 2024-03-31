package com.guyi.design.pattrth.creational.factory.abstract0;

/**
 * 客户端代码
 *
 * @author 孤诣
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factoryA = new ProductFactoryA();
        factoryA.createProduct("A1").operation();
        factoryA.createProduct("A2").operation();

        AbstractFactory factoryB = new ProductFactoryB();
        factoryB.createProduct("B1").operation();
        factoryB.createProduct("B2").operation();
    }
}
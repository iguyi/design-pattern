package com.guyi.design.pattern.creational.factory.method;

import com.guyi.design.pattern.creational.factory.common.Product;

/**
 * 客户端代码
 *
 * @author 孤诣
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("======= 工厂方法模式 =======");

        ProductMethodFactory methodFactoryA = new ProductMethodFactoryA();
        Product productA = methodFactoryA.factoryMethod();
        productA.operation();

        ProductMethodFactory methodFactoryB = new ProductMethodFactoryB();
        Product productB = methodFactoryB.factoryMethod();
        productB.operation();
    }
}
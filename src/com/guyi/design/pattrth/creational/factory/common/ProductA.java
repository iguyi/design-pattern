package com.guyi.design.pattrth.creational.factory.common;

/**
 * 具体产品 A
 *
 * @author 孤诣
 */
public class ProductA implements Product {
    @Override
    public void operation() {
        System.out.println("Operation of ConcreteProductA");
    }
}
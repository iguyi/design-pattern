package com.guyi.design.pattern.creational.factory.common;

/**
 * 具体产品 B
 *
 * @author 孤诣
 */
public class ProductB implements Product {
    @Override
    public void operation() {
        System.out.println("Operation of ConcreteProductB");
    }
}
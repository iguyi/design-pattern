package com.guyi.design.pattern.creational.factory.simple;

import com.guyi.design.pattern.creational.factory.common.Product;

/**
 * 客户端代码
 *
 * @author 孤诣
 */
public class Client {
    public static void main(String[] args) {
        // 通过工厂获取产品A
        Product productA = ProductSimpleFactory.createProduct("A");
        productA.operation();

        // 通过工厂获取产品B
        Product productB = ProductSimpleFactory.createProduct("B");
        productB.operation();
    }
}
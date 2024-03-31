package com.guyi.design.pattrth.creational.factory.abstract0;

import com.guyi.design.pattrth.creational.factory.common.Product;

/**
 * 生产 B 类的工厂
 */
class ProductFactoryB implements AbstractFactory {
    @Override
    public Product createProduct(String type) {
        if ("B1".equals(type)) {
            return new ProductB1();
        } else if ("B2".equals(type)) {
            return new ProductB2();
        } else {
            return null;
        }
    }
}
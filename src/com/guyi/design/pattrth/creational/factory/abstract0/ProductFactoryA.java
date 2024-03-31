package com.guyi.design.pattrth.creational.factory.abstract0;

import com.guyi.design.pattrth.creational.factory.common.Product;

/**
 * 生产 A 类的工厂
 */
class ProductFactoryA implements AbstractFactory {
    @Override
    public Product createProduct(String type) {
        if ("A1".equals(type)) {
            return new ProductA1();
        } else if ("A2".equals(type)) {
            return new ProductA2();
        } else {
            return null;
        }
    }
}
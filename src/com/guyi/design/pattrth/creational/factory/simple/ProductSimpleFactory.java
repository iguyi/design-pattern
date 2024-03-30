package com.guyi.design.pattrth.creational.factory.simple;

import com.guyi.design.pattrth.creational.factory.common.Product;
import com.guyi.design.pattrth.creational.factory.common.ProductA;
import com.guyi.design.pattrth.creational.factory.common.ProductB;

/**
 * 简单工厂类
 *
 * @author 孤诣
 */
public class ProductSimpleFactory {
    /**
     * 简单工厂方法
     */
    public static Product createProduct(String type) {
        Product product = null;
        if ("A".equals(type)) {
            product = new ProductA();
        } else if ("B".equals(type)) {
            product = new ProductB();
        }
        return product;
    }
}
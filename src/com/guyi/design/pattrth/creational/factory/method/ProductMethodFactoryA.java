package com.guyi.design.pattrth.creational.factory.method;

import com.guyi.design.pattrth.creational.factory.common.Product;
import com.guyi.design.pattrth.creational.factory.common.ProductA;

/**
 * 生产 ProductA 的工厂
 *
 * @author 孤诣
 */
public class ProductMethodFactoryA implements ProductMethodFactory {
    @Override
    public Product factoryMethod() {
        return new ProductA();
    }
}

package com.guyi.design.pattrth.creational.factory.method;

import com.guyi.design.pattrth.creational.factory.common.Product;
import com.guyi.design.pattrth.creational.factory.common.ProductB;

/**
 * 生产 ProductB 的工厂
 *
 * @author 孤诣
 */
public class ProductMethodFactoryB implements ProductMethodFactory {
    @Override
    public Product factoryMethod() {
        return new ProductB();
    }
}

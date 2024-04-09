package com.guyi.design.pattern.creational.factory.method;

import com.guyi.design.pattern.creational.factory.common.Product;
import com.guyi.design.pattern.creational.factory.common.ProductB;

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

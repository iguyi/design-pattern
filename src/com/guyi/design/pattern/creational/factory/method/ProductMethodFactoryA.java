package com.guyi.design.pattern.creational.factory.method;

import com.guyi.design.pattern.creational.factory.common.Product;
import com.guyi.design.pattern.creational.factory.common.ProductA;

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

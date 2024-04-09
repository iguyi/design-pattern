package com.guyi.design.pattern.creational.factory.method;

import com.guyi.design.pattern.creational.factory.common.Product;

/**
 * 工厂方法接口
 *
 * @author 孤诣
 */
public interface ProductMethodFactory {
    /**
     * 工厂方法
     *
     * @return 产品
     */
    Product factoryMethod();
}

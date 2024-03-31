package com.guyi.design.pattrth.creational.factory.abstract0;

import com.guyi.design.pattrth.creational.factory.common.Product;

/**
 * 抽象工厂接口
 *
 * @author 孤诣
 */
interface AbstractFactory {
    /**
     * 生产产品
     *
     * @param type 产品类型
     * @return 产品
     */
    Product createProduct(String type);
}
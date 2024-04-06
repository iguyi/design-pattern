package com.guyi.design.pattern.structural.decorator;

/**
 * 装饰物 - 牛奶
 *
 * @author 孤诣
 */
public class Milk extends Decorator {
    public Milk(BaseOrder baseOrder) {
        super(baseOrder);
        this.setDes("装饰物 - 牛奶");
        this.setPrice(2.0f);
    }
}

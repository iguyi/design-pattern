package com.guyi.design.pattern.structural.decorator;

/**
 * 装饰物 - 巧克力
 *
 * @author 孤诣
 */
public class Chocolate extends Decorator {
    public Chocolate(BaseOrder baseOrder) {
        super(baseOrder);
        this.setDes("装饰物 - 巧克力");
        this.setPrice(1.0f);
    }
}

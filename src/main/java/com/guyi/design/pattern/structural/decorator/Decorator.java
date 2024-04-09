package com.guyi.design.pattern.structural.decorator;

/**
 * 装饰器, 其子类都是装饰物
 *
 * @author 孤诣
 */
public class Decorator extends BaseOrder {
    /**
     * 被装饰者
     */
    private final BaseOrder baseOrder;

    public Decorator(BaseOrder baseOrder) {
        this.baseOrder = baseOrder;
    }

    @Override
    public float cost() {
        // super.getPrice() 自己的价格
        return super.getPrice() + baseOrder.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + ": " + super.getPrice() + "\n" + this.baseOrder.getDes();
    }
}

package com.guyi.design.pattern.structural.decorator;

/**
 * 咖啡类, 相当于一个缓存层, 用于编写所有咖啡类都要用到的代码。
 * 其子类都是被装饰对象
 *
 * @author 孤诣
 */
public class Coffee extends BaseOrder {
    @Override
    public String getDes() {
        return super.getDes() + ": " + super.getPrice();
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}

package com.guyi.design.pattern.structural.bridge;

/**
 * 手机接口
 *
 * @author 孤诣
 */
public abstract class Phone {
    /**
     * 组合手机
     */
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void call() {
        this.brand.call();
    }
}

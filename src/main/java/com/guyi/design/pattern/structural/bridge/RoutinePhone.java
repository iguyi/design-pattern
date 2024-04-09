package com.guyi.design.pattern.structural.bridge;

/**
 * 常规手机
 *
 * @author 孤诣
 */
public class RoutinePhone extends Phone {
    public RoutinePhone(Brand brand) {
        super(brand);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("常规手机打电话");
    }
}

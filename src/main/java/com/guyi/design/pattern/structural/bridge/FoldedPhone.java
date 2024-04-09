package com.guyi.design.pattern.structural.bridge;

/**
 * 折叠手机
 *
 * @author 孤诣
 */
public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("折叠手机打电话");
    }
}

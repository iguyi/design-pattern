package com.guyi.design.pattern.structural.bridge;

/**
 * 小米
 *
 * @author 孤诣
 */
public class XiaoMi implements Brand {
    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}

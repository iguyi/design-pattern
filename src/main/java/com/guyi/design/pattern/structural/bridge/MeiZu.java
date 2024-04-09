package com.guyi.design.pattern.structural.bridge;

/**
 * 魅族
 *
 * @author 孤诣
 */
public class MeiZu implements Brand {
    @Override
    public void call() {
        System.out.println("魅族手机打电话");
    }
}

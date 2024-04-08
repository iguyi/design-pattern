package com.guyi.design.pattern.structural.proxy.static_proxy;

/**
 * 具体教师, 目标对象
 *
 * @author 孤诣
 */
public class Teacher implements TeacherInterface {
    @Override
    public void teach() {
        System.out.println("教师正在授课...");
    }
}

package com.guyi.design.pattern.structural.proxy.static_proxy;

/**
 * 代理教师
 *
 * @author 孤诣
 */
public class TeacherProxy implements TeacherInterface {
    /**
     * 目标对象(被代理对象)
     */
    private final Teacher target;

    public TeacherProxy(Teacher target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理开始, 进行准备操作...");
        target.teach();
        System.out.println("代理结束");
    }
}

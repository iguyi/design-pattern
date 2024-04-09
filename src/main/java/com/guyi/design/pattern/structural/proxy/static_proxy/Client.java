package com.guyi.design.pattern.structural.proxy.static_proxy;

/**
 * 测试静态代理模式
 *
 * @author 孤诣
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=========== 静态代理 ===========");
        TeacherProxy teacherProxy = new TeacherProxy(new Teacher());
        teacherProxy.teach();
    }
}

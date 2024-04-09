package com.guyi.design.pattern.structural.proxy.cglib;

/**
 * 测试 Cglib 动态代理
 *
 * @author 孤诣
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("============ Cglib 动态代理 ============");
        ProxyFactory proxyFactory = new ProxyFactory(new Teacher());
        Teacher proxyTeacher = (Teacher) proxyFactory.getProxyInstance();
        proxyTeacher.teach();
    }
}

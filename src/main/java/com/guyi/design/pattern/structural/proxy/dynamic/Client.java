package com.guyi.design.pattern.structural.proxy.dynamic;

/**
 * @author 孤诣
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=========== 动态代理 ===========");
        ProxyFactory proxyFactory = new ProxyFactory(new Teacher());
        TeacherInterface teacherProxy = (TeacherInterface) proxyFactory.getProxyInstance();
        System.out.println(teacherProxy.getClass());
        teacherProxy.teach();
    }
}

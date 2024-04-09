package com.guyi.design.pattern.structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理工厂
 *
 * @author 孤诣
 */
public class ProxyFactory implements MethodInterceptor {
    /**
     * 目标对象(被代理对象)
     */
    private final Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 获取 target 的代理对象
     *
     * @return target 的代理对象
     */
    public Object getProxyInstance() {
        // 创建工具类
        Enhancer enhancer = new Enhancer();

        // 设置父类
        enhancer.setSuperclass(target.getClass());

        // 设置回调函数
        enhancer.setCallback(this);

        // 创建子类(代理对象)
        return enhancer.create();
    }

    /**
     * 方法拦截器, 会调用目标对象的方法
     *
     * @return 被拦截方法执行后的返回值
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib 动态代理开始...");
        Object methodVal = method.invoke(target, args);
        System.out.println("其他操作...");
        return methodVal;
    }
}

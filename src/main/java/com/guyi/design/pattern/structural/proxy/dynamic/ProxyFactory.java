package com.guyi.design.pattern.structural.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * 代理工厂
 *
 * @author 孤诣
 */
public class ProxyFactory {
    /**
     * 目标对象
     * 注意: 这里是 Object 类型
     */
    private final Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 生成目标对象的代理对象
     *
     * @return 目标对象的代理对象
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("JDK 动态代理开始...");
                    // 通过反射调用目标对象的方法
                    Object result = method.invoke(target, args);
                    System.out.println("进行其他处理...");
                    return result;
                }
        );
    }
}

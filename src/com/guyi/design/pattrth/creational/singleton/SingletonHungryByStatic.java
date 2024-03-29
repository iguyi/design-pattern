package com.guyi.design.pattrth.creational.singleton;

/**
 * 单例模式 - 饿汉式 By 静态代码块
 *
 * @author 孤诣
 */
public class SingletonHungryByStatic {
    private final String id;

    private static final SingletonHungryByStatic INSTANCE;

    // 在类加载时就初始化单例，保证了线程安全
    static {
        INSTANCE = new SingletonHungryByStatic();
    }

    /**
     * 私有构造函数，防止外部通过 new 创建实例
     */
    private SingletonHungryByStatic() {
        this.id = "This singleton hungry by static.";
    }

    /**
     * 提供一个全局访问点
     */
    public static SingletonHungryByStatic getInstance() {
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "SingletonHungryByConstant{" + "id='" + id + '\'' + '}';
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
    }
}
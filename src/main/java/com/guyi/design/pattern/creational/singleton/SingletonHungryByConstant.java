package com.guyi.design.pattern.creational.singleton;

/**
 * 单例模式 - 饿汉式 By 常量
 *
 * @author 孤诣
 */
public class SingletonHungryByConstant {
    private final String id;

    /**
     * 在类加载时就初始化单例，保证了线程安全
     */
    private static final SingletonHungryByConstant INSTANCE = new SingletonHungryByConstant();

    /**
     * 私有构造函数，防止外部通过 new 创建实例
     */
    private SingletonHungryByConstant() {
        this.id = "This singleton hungry by constant.";
    }

    /**
     * 提供一个全局访问点
     */
    public static SingletonHungryByConstant getInstance() {
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
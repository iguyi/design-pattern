package com.guyi.design.pattrth.creational.singleton;

/**
 * 单例模式 - 懒汉式
 *
 * @author 孤诣
 */
public class SingletonLazy {
    private final String id;

    private static SingletonLazy instance;

    /**
     * 私有构造函数，防止外部通过 new 创建实例
     */
    private SingletonLazy() {
        this.id = "This singleton lazy";
    }

    /**
     * 提供一个全局访问点
     * 同步方法，确保线程安全，但每次访问都需要同步，影响性能
     */
    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "SingletonLazy{" + "id='" + id + '\'' + '}';
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
    }
}
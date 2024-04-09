package com.guyi.design.pattern.creational.singleton;

/**
 * 单例模式 - 静态内部类
 *
 * @author 孤诣
 */
public class SingletonStaticInner {
    private final String id;

    private SingletonStaticInner() {
        this.id = "This singleton static inner.";
    }

    /**
     * 静态内部类，用于持有 SingletonStaticInner 的实例
     */
    private static class Holder {
        private static final SingletonStaticInner INSTANCE = new SingletonStaticInner();
    }

    @Override
    public String toString() {
        return "SingletonStaticInner{" + "id='" + id + '\'' + '}';
    }

    /**
     * 全局访问点
     */
    public static SingletonStaticInner getInstance() {
        return Holder.INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
    }
}
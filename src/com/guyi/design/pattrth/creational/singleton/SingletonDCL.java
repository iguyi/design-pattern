package com.guyi.design.pattrth.creational.singleton;

/**
 * 单例模式 - 双检锁
 *
 * @author 孤诣
 */
public class SingletonDCL {
    private final String id;

    private volatile static SingletonDCL instance;

    private SingletonDCL() {
        this.id = "This singleton DCL.";
    }

    /**
     * 提供一个全局访问点
     */
    public static SingletonDCL getInstance() {
        // 第一次检查
        if (instance == null) {
            synchronized (SingletonDCL.class) {
                // 第二次检查，不会被反复执行(被执行次数有限)
                if (instance == null) {
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return "SingletonDCL{" + "id='" + id + '\'' + '}';
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
    }
}
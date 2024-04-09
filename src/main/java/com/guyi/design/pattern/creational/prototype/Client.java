package com.guyi.design.pattern.creational.prototype;

/**
 * 原型模式客户端
 *
 * @author 孤诣
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("======= 原型模式 =======");

        System.out.println("======= 传统方式 =======");
        Sheep sheep = new Sheep("绵羊", "多莉", new String[]{"鲜草", "干丛"});
        System.out.println("克隆前的源对象: " + sheep);
        Sheep cloneSheep = (Sheep) sheep.clone();
        cloneSheep.setFood(0, "树叶");
        System.out.println("克隆物: " + cloneSheep);
        System.out.println("克隆后的源对象: " + sheep);

        System.out.println("======= 序列化方式 =======");
        Dog dog = new Dog("小狗", new String[]{"肉", "骨头"});
        System.out.println("克隆前的源对象: " + dog);
        Dog cloneDog = (Dog) dog.deepClone();
        cloneDog.setFood(1, "狗粮");
        System.out.println("克隆物: " + cloneDog);
        System.out.println("克隆后的源对象: " + dog);
    }
}

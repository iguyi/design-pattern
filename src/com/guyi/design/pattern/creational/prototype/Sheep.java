package com.guyi.design.pattern.creational.prototype;

import java.util.Arrays;

/**
 * 羊 - 传统的克隆方式
 *
 * @author 孤诣
 */
public class Sheep implements Cloneable {
    /**
     * 羊的类型
     */
    private final String type;

    /**
     * 羊的名字
     */
    private final String name;

    /**
     * 羊会吃的食物
     */
    private String[] foodArray;

    public Sheep(String type, String name, String[] foodArray) {
        this.type = type;
        this.name = name;
        this.foodArray = foodArray;
    }

    public void setFood(int index, String food) {
        this.foodArray[index] = food;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", foodArray=" + Arrays.toString(foodArray) +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 浅克隆
        Object clone = super.clone();
        Sheep sheepClone = (Sheep) clone;
        // 克隆引用类型的属性
        sheepClone.foodArray = sheepClone.foodArray.clone();
        return sheepClone;
    }
}

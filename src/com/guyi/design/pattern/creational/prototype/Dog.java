package com.guyi.design.pattern.creational.prototype;

import java.io.*;
import java.util.Arrays;

/**
 * 狗 - 使用序列化与反序列化进行克隆
 *
 * @author 孤诣
 */
public class Dog implements Serializable {
    /**
     * 狗的名字
     */
    private final String name;

    /**
     * 狗会吃的食物
     */
    private final String[] foodArray;

    public Dog(String name, String[] foodArray) {
        this.name = name;
        this.foodArray = foodArray;
    }

    public Object deepClone() {
        // 创建流对象
        ByteArrayOutputStream bos;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 将当前对象输出为对象流
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            return ois.readObject();
        } catch (Exception e) {
            System.out.println("异常");
            return null;
        } finally {
            // 关闭流对象
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void setFood(int index, String food) {
        this.foodArray[index] = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", foodArray=" + Arrays.toString(foodArray) +
                '}';
    }
}

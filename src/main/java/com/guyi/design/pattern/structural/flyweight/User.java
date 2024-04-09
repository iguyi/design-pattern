package com.guyi.design.pattern.structural.flyweight;

/**
 * 用户, 充当享元模式的外部状态
 *
 * @author 孤诣
 */
public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

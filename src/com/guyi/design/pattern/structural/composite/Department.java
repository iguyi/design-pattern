package com.guyi.design.pattern.structural.composite;

/**
 * 系, 将来做为树型结构的叶子
 *
 * @author 孤诣
 */
public class Department extends Organization {
    public Department(String name) {
        super(name);
    }

    @Override
    protected void print() {
        System.out.println(this.getName());
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

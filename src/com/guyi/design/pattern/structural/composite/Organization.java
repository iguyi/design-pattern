package com.guyi.design.pattern.structural.composite;

/**
 * 组织
 *
 * @author 孤诣
 */
public abstract class Organization {
    /**
     * 名字
     */
    private String name;

    public Organization(String name) {
        this.name = name;
    }

    /**
     * 添加
     *
     * @param organization 子组织
     */
    protected void add(Organization organization) {
        System.out.println("不支持操作");
    }

    /**
     * 移除
     *
     * @param organization 子组织
     */
    protected void remove(Organization organization) {
        System.out.println("不支持操作");
    }

    /**
     * 打印
     */
    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

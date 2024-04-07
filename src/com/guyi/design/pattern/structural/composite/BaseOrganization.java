package com.guyi.design.pattern.structural.composite;

/**
 * 组织
 *
 * @author 孤诣
 */
public abstract class BaseOrganization {
    /**
     * 名字
     */
    private final String name;

    public BaseOrganization(String name) {
        this.name = name;
    }

    /**
     * 添加
     *
     * @param baseOrganization 子组织
     */
    protected void add(BaseOrganization baseOrganization) {
        System.out.println("不支持操作");
    }

    /**
     * 打印
     */
    protected abstract void print();

    public String getName() {
        return name;
    }
}

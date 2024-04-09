package com.guyi.design.pattern.structural.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * 大学
 *
 * @author 孤诣
 */
public class University extends BaseOrganization {
    /**
     * 子组织列表, 对应的是 College
     *
     * @see College
     */
    private final List<BaseOrganization> childBaseOrganizationList = new LinkedList<>();

    public University(String name) {
        super(name);
    }

    @Override
    protected void add(BaseOrganization baseOrganization) {
        childBaseOrganizationList.add(baseOrganization);
    }

    @Override
    protected void print() {
        System.out.println("=========" + this.getName() + "=========");
        childBaseOrganizationList.forEach(BaseOrganization::print);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

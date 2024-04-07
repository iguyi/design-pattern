package com.guyi.design.pattern.structural.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * 院
 *
 * @author 孤诣
 */
public class College extends Organization {
    /**
     * 子组织列表, 对应的是 Department
     *
     * @see Department
     */
    private final List<Organization> childOrganizationList = new LinkedList<>();

    public College(String name) {
        super(name);
    }

    @Override
    protected void add(Organization organization) {
        childOrganizationList.add(organization);
    }

    @Override
    protected void remove(Organization organization) {
        childOrganizationList.remove(organization);
    }

    @Override
    protected void print() {
        System.out.println("=========" + this.getName() + "=========");
        childOrganizationList.forEach(Organization::print);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

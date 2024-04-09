package com.guyi.design.pattern.structural.composite;

/**
 * 测试组合模式
 *
 * @author 孤诣
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("========= 组合模式 =========");

        // 创建大学
        BaseOrganization university = new University("大学");

        // 为大学添加学院
        BaseOrganization college1 = new College("计算机学院");
        BaseOrganization college2 = new College("信息工程学院");
        university.add(college1);
        university.add(college2);

        // 为学院添加系(专业)
        college1.add(new Department("软件工程"));
        college1.add(new Department("计算机科学与技术"));
        college1.add(new Department("网络工程"));
        college2.add(new Department("信息工程"));
        college2.add(new Department("通信工程"));

        // 打印
        university.print();
    }
}

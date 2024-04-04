package com.guyi.design.pattern.structural.bridge;

/**
 * 客户端
 *
 * @author 孤诣
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("======= 桥接模式 =======");
        Phone meiZuRoutinePhone = new RoutinePhone(new MeiZu());
        meiZuRoutinePhone.call();

        System.out.println("======================");
        Phone xiaoMiFoldedPhone = new FoldedPhone(new XiaoMi());
        xiaoMiFoldedPhone.call();
    }
}

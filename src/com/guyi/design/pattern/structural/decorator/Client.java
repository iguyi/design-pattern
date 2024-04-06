package com.guyi.design.pattern.structural.decorator;

/**
 * 测试装饰器模式
 *
 * @author 孤诣
 */
public class Client {
    public static void main(String[] args) {
        // 黑咖啡 + 一份牛奶 + 两份巧克力
        BaseOrder order = new BlackCoffee();
        System.out.println("【黑咖啡】添加成功, 当前订单: \n" + order.getDes() + "\n总价: " + order.cost() + "\n");

        order = new Milk(order);
        System.out.println("【牛奶】添加成功, 当前订单: \n" + order.getDes() + "\n总价: " + order.cost() + "\n");

        order = new Chocolate(order);
        System.out.println("【巧克力】添加成功, 当前订单: \n" + order.getDes() + "\n总价: " + order.cost() + "\n");

        order = new Chocolate(order);
        System.out.println("【巧克力】添加成功, 当前订单: \n" + order.getDes() + "\n总价: " + order.cost() + "\n");
    }
}

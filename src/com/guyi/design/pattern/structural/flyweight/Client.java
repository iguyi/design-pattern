package com.guyi.design.pattern.structural.flyweight;

/**
 * 测试享元模式
 *
 * @author 孤诣
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("============ 享元模式 ============");

        // 创建工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        // 获取网页形式的网站
        WebSite webPage = webSiteFactory.getWebSiteCategory("网页");
        webPage.use(new User("张三"));

        // 获取公众号形式的网站
        WebSite gongzhonghao = webSiteFactory.getWebSiteCategory("公众号");
        gongzhonghao.use(new User("李四"));

        // 再次获取公众号形式的网站
        WebSite gongzhonghao2 = webSiteFactory.getWebSiteCategory("公众号");
        gongzhonghao2.use(new User("王五"));

        System.out.println("网站数: " + webSiteFactory.count());
    }
}

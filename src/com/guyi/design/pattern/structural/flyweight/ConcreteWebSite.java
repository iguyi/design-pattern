package com.guyi.design.pattern.structural.flyweight;

/**
 * 具体网站
 *
 * @author 孤诣
 */
public class ConcreteWebSite implements WebSite {
    /**
     * 网站的发布形式
     */
    private final String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为: " + type + ", " + user + "正在使用");
    }
}

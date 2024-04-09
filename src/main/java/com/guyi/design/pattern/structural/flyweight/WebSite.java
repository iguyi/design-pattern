package com.guyi.design.pattern.structural.flyweight;

/**
 * 抽象网站
 *
 * @author 孤诣
 */
public interface WebSite {
    /**
     * 使用产品
     *
     * @param user 使用的用户, 充当外部状态
     */
    void use(User user);
}

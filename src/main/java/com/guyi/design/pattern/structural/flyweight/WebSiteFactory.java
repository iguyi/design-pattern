package com.guyi.design.pattern.structural.flyweight;

import java.util.HashMap;

/**
 * 网站工工厂类, 根据需求返回具体的网站
 *
 * @author 孤诣
 */
public class WebSiteFactory {
    /**
     * 网站池
     */
    private final HashMap<String, ConcreteWebSite> concreteWebSitePool = new HashMap<>();

    /**
     * 根据类型返回一个网站, 如果对应类型的网站不在 concreteWebSitePool 中, 则创建后存入 concreteWebSitePool, 然后返回
     *
     * @param type 网站发布形式
     * @return 目标网站
     */
    public WebSite getWebSiteCategory(String type) {
        if (!concreteWebSitePool.containsKey(type)) {
            synchronized (WebSiteFactory.class) {
                if (!concreteWebSitePool.containsKey(type)) {
                    ConcreteWebSite targetWebSite = new ConcreteWebSite(type);
                    concreteWebSitePool.put(type, targetWebSite);
                    return targetWebSite;
                }
            }
        }

        return concreteWebSitePool.get(type);
    }

    /**
     * 统计网站数
     *
     * @return 网站数
     */
    public int count() {
        return concreteWebSitePool.size();
    }
}

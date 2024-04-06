package com.guyi.design.pattern.structural.decorator;

/**
 * 订单
 *
 * @author 孤诣
 */
public abstract class BaseOrder {

    /**
     * 描述
     */
    private String des;

    /**
     * 价格
     */
    private float price;

    /**
     * 计算费用的抽象方法
     *
     * @return 总费用
     */
    public abstract float cost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

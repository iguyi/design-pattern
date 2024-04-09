package com.guyi.design.pattern.behavioral.template;

/**
 * 豆浆抽象类
 *
 * @author 孤诣
 */
public abstract class BaseSoyMilk {
    /**
     * 模板方法
     */
    final void make() {
        select();
        if (hasAddCondition()) {
            add();
        }
        beta();
    }

    /**
     * 选材
     */
    void select() {
        System.out.println("选择优质黄豆");
    }

    /**
     * 添加配料
     */
    abstract void add();

    /**
     * 研磨豆浆
     */
    void beta() {
        System.out.println("研磨豆浆");
    }

    /**
     * 钩子方法，是否添加调味品。
     * 默认添加
     *
     * @return true - 是; false - 否
     */
    boolean hasAddCondition() {
        return true;
    }
}

package com.guyi.design.pattern.behavioral.template;

/**
 * 纯豆浆
 *
 * @author 孤诣
 */
public class PureSoyMilk extends BaseSoyMilk {
    @Override
    void add() {
        // 空实现
    }

    @Override
    boolean hasAddCondition() {
        return false;
    }
}

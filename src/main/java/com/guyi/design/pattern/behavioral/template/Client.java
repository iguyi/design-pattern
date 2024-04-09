package com.guyi.design.pattern.behavioral.template;

/**
 * @author 孤诣
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("====== 模板方法模式 ======");

        System.out.println("======= 制作咸豆浆 =======");
        BaseSoyMilk saltedSoyMilk = new SaltedSoyMilk();
        saltedSoyMilk.make();

        System.out.println("======= 制作甜豆浆 =======");
        BaseSoyMilk sweetSoyMilk = new SweetSoyMilk();
        sweetSoyMilk.make();

        System.out.println("====== 制作纯豆浆 ======");
        BaseSoyMilk pureSoyMilk = new PureSoyMilk();
        pureSoyMilk.make();
    }
}

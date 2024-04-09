package com.guyi.design.pattern.behavioral.command;

/**
 * 测试命令模式
 *
 * @author 孤诣
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("========== 命令模式 ==========");

        // 创建开灯相关的命令(包含了创建命令接收者)
        Command lightOnCommand = new LightOnCommand();
        Command lightOffCommand = new LightOffCommand();

        // 创建命令调用者并设置按钮
        CommandInvoker commandInvoker = new CommandInvoker();
        commandInvoker.setCommand(0, lightOnCommand, lightOffCommand);

        commandInvoker.onButton(0);
        commandInvoker.offButton(0);
        commandInvoker.undoButton();
    }
}

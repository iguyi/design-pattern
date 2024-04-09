package com.guyi.design.pattern.behavioral.command;

import java.util.Stack;

/**
 * 命令调用者
 *
 * @author 孤诣
 */
public class CommandInvoker {
    /**
     * 【开】命令列表
     */
    private final Command[] onCommandArray;

    /**
     * 【关】命令数组
     */
    private final Command[] offCommandArray;

    /**
     * 历史命令栈
     */
    private final Stack<Command> historyCommandStack = new Stack<>();

    public CommandInvoker() {
        int initCommandNum = 5;
        onCommandArray = new Command[initCommandNum];
        offCommandArray = new Command[initCommandNum];
        for (int i = 0; i < initCommandNum; i++) {
            onCommandArray[i] = new NoCommand();
            offCommandArray[i] = new NoCommand();
        }
    }

    /**
     * 设置命令
     *
     * @param no         命令位置
     * @param onCommand  【开】相关的命令
     * @param offCommand 【关】相关的命令
     */
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommandArray[no] = onCommand;
        offCommandArray[no] = offCommand;
    }

    /**
     * 按下【开】按钮
     *
     * @param no 按钮位置
     */
    public void onButton(int no) {
        Command command = onCommandArray[no];
        command.execute();
        // 记录操作
        historyCommandStack.push(command);
    }

    /**
     * 按下【关】按钮
     *
     * @param no 按钮位置
     */
    public void offButton(int no) {
        Command command = offCommandArray[no];
        command.execute();
        // 记录操作
        historyCommandStack.push(command);
    }

    /**
     * 撤销命令
     */
    public void undoButton() {
        if (historyCommandStack.isEmpty()) {
            return;
        }
        Command pop = historyCommandStack.pop();
        pop.undo();
    }
}

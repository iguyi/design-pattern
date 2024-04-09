package com.guyi.design.pattern.behavioral.command;

/**
 * 空命令, 避免 null 判断, 简化操作
 *
 * @author 孤诣
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}

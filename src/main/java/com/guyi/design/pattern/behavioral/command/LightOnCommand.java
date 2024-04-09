package com.guyi.design.pattern.behavioral.command;

/**
 * 开灯命令
 *
 * @author 孤诣
 */
public class LightOnCommand implements Command {
    /**
     * 命令接收者
     */
    private final LightCommandReceiver receiver = new LightCommandReceiver();

    @Override
    public void execute() {
        this.receiver.on();
    }

    @Override
    public void undo() {
        this.receiver.off();
    }
}

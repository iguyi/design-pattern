package com.guyi.design.pattern.behavioral.command;

/**
 * 关灯命令
 *
 * @author 孤诣
 */
public class LightOffCommand implements Command {
    /**
     * 命令接收者
     */
    private final LightCommandReceiver receiver = new LightCommandReceiver();

    @Override
    public void execute() {
        this.receiver.off();
    }

    @Override
    public void undo() {
        this.receiver.on();
    }
}

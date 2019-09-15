package com.ilike.command;

/**
 * 电视开的命令
 */
public class TVOnCommand implements Command {

   private  TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        tvReceiver.on();
    }

    @Override
    public void undo() {
        //调用接收者的方法
        tvReceiver.off();
    }
}

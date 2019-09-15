package com.ilike.command;

/**
 * 电视机关的命令
 */
public class TVOffCommand implements Command {

   private  TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        tvReceiver.off();
    }

    @Override
    public void undo() {
        //调用接收者的方法
        tvReceiver.on();
    }
}

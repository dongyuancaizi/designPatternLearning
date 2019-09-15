package com.ilike.command;

/**
 * 遥控器
 */
public class RemoteController {

    //开的命令数组
    private Command[] onCommands;

    //关的命令数组
    private Command[] offCommands;
    /**
     * 执行撤销的命令
     */
    private Command undoCommand;

    public RemoteController() {
        this.onCommands = new Command[5];
        this.offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i]=new NoCommand();
            offCommands[i]=new NoCommand();
        }
    }

    /**
     * 给按钮设置需要的命令
     */
    public void setCommand(int no,Command onCommand,Command offCommand){
        onCommands[no]=onCommand;
        offCommands[no]=offCommand;
    }

    /**
     * 按下开的按钮
     */
    public void onButtonWasPushed(int no){
        //找到你按下的开的按钮，并调用对应的方法
        onCommands[no].execute();
        //记录最后这次的操作，用于撤销
        undoCommand=onCommands[no];
    }

    /**
     * 按下关的按钮
     */
    public void offButtonWasPushed(int no){
        //找到你按下的关的按钮，并调用对应的方法
        offCommands[no].execute();
        //记录最后这次的操作，用于撤销
        undoCommand=offCommands[no];
    }
    /**
     * 按下撤销的按钮
     */
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}

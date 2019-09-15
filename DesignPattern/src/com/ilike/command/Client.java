package com.ilike.command;

public class Client {

    public static void main(String[] args) {
        //使用命令设计模式，完成通过遥控，对电灯的操作
        //创建电灯接受者
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //需要一个遥控器
        RemoteController remoteController= new RemoteController();
        //给遥控器设置命令，比如 no=0是电灯的开和关的操作
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

    /*    System.out.println("------------按下灯的开的按钮-------------");
        remoteController.onButtonWasPushed(0);
        System.out.println("------------按下灯的关的按钮-------------");
        remoteController.offButtonWasPushed(0);
        System.out.println("------------按下撤销的按钮-------------");
        remoteController.undoButtonWasPushed();
*/
        System.out.println("=============操作电视机===============");
        //创建电视机接受者
        TVReceiver tvReceiver = new TVReceiver();
        //创建电视机相关的开关命令
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        //给遥控器设置命令，比如 no=1是电视机的开和关的操作
        remoteController.setCommand(1,tvOnCommand,tvOffCommand);

        System.out.println("------------按下电视机的开的按钮-------------");
        remoteController.onButtonWasPushed(1);
        System.out.println("------------按下电视机的关的按钮-------------");
        remoteController.offButtonWasPushed(1);
        System.out.println("------------按下撤销的按钮-------------");
        remoteController.undoButtonWasPushed();
    }
}

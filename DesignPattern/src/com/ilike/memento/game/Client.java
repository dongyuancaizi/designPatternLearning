package com.ilike.memento.game;

public class Client {

    public static void main(String[] args) {
        //创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);
        System.out.println("大战前的状态");
        gameRole.display();
        //保存大战前的状态
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());
        System.out.println("和boss大战");
        gameRole.setVit(30);
        gameRole.setDef(30);
        gameRole.display();
        System.out.println("大战后恢复使用备忘录对象恢复到大战前");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        gameRole.display();

    }
}

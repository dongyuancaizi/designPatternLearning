package com.ilike.memento.theroy;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("状态一，攻击力100");
        //保存了当前的状态
        caretaker.add(originator.saveMemento());

        originator.setState("状态二，攻击力80");
        caretaker.add(originator.saveMemento());

        originator.setState("状态三，攻击力50");
        caretaker.add(originator.saveMemento());

        System.out.println("当前的状态："+originator.getState());
        //恢复到状态1,
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("恢复到状态1的状态："+originator.getState());
    }
}

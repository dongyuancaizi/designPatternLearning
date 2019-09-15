package com.ilike.memento.game;

/**
 * 守护者对象，保存游戏角色的状态
 */
public class Caretaker {
    /**
     * 保存一次状态
     */
    private Memento memento;

    /**
     * 保存多次状态
     */
   // private List<Memento> mementos;

    /**
     * 对多个游戏角色保存多种状态
     */
   // private HashMap<String,List<Memento>> rolesMemento;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}

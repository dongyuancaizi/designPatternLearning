package com.ilike.memento.theroy;

public class Originator {

    /**
     * 状态信息
     */
    private String state;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveMemento(){
        return  new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state=memento.getState();
    }
}

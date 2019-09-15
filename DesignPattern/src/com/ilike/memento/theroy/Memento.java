package com.ilike.memento.theroy;

/**
 * 备忘录对象
 */
public class Memento {
    /**
     * 状态信息
     */
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

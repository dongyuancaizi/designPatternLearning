package com.ilike.uml.aggregation;

/**
 * 鼠标和显示器可以和电脑分离
 */
public class Computer {

    private Mouse mouse;
    private Monitor monitor;

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}

package com.ilike.uml.composition;

/**
 * 鼠标和显示器可以和电脑不可分离
 */
public class Computer {

    private Mouse mouse = new Mouse();
    private Monitor monitor=new Monitor();


}

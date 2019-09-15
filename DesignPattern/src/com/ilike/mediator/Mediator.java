package com.ilike.mediator;

/**
 * 中介
 */
public abstract class Mediator {
    public abstract void getMessage(int stageChange, String name) ;

    /**
     * 接收消息，接收具体的同事对象发出的消息
     * @param name
     * @param colleague
     */
    public abstract void register(String name, Colleague colleague) ;

    public abstract void sendMessage() ;
}

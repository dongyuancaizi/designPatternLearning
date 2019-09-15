package com.ilike.mediator;

import java.util.HashMap;

/**
 * 具体的中介者类
 */
public class ConcreteMediator extends Mediator {
    /**
     * 放入了所有的同事对象
     */
    private HashMap<String,Colleague> colleagueMap;
    private HashMap<String,String> interMap;


    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>();
        this.interMap = new HashMap<>();
    }

    @Override
    public void getMessage(int stageChange, String name) {

    }

    @Override
    public void register(String name, Colleague colleague) {
        colleagueMap.put(name,colleague);
        if(colleague instanceof Alarm){
            interMap.put("Alarm",name);
        } else if(colleague instanceof Alarm){
            interMap.put("Alarm",name);
        }else if(colleague instanceof Alarm){
            interMap.put("Alarm",name);
        }
    }

    @Override
    public void sendMessage() {

    }
}

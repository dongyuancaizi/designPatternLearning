package com.ilike.mediator;


/**
 * 闹钟
 */
public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    @Override
    public Mediator getMediator() {
        return super.getMediator();
    }

    public void sendAlarm(int stageChange){
      sendMessage(stageChange);
    }


    @Override
    public void sendMessage(int stageChange) {
      this.getMediator().getMessage(stageChange,this.name);
    }
}

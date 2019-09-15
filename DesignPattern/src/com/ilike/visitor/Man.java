package com.ilike.visitor;

/**
 * 男人
 * 1.这里我们使用了双分派，首先在客户端程序中,将具体的状态作为参数传递到Man(第一次分派)
 * 2.然后Man类调用作为参数“具体方法中”getManResult，同时将自己作为参数传入(第二次分派)
 */
public class Man  extends Person {
    @Override
    void accespt(Action action) {
        action.getManResult(this);
    }
}

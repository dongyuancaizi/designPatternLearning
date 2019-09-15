package com.ilike.visitor;

/**
 * 女人
 */
public class Woman extends Person {
    @Override
    void accespt(Action action) {
        action.getWomanResult(this);
    }
}

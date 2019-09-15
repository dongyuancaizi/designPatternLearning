package com.ilike.memento.theroy;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<Memento> mementoList=new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}

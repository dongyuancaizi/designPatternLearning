package com.ilike.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 数据结构，管理着很多人
 */
public class ObjectStructure {
    /**
     * 维护了一个集合
     */
    private List<Person> persons=new LinkedList<>();

    /**
     * 评论
     * @param person
     */
    public void attach(Person person){
        persons.add(person);
    }

    /**
     * 取消投票
     * @param person
     */
    public void detach(Person person){
        persons.remove(person);
    }

    public void display(Action action){
        for (Person person: persons) {
            person.accespt(action);
        }
    }
}

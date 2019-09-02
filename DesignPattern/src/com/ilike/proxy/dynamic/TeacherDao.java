package com.ilike.proxy.dynamic;

public class TeacherDao implements IIeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello ," + name);
    }
}

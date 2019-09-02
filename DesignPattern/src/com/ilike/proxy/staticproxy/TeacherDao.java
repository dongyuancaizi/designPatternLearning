package com.ilike.proxy.staticproxy;



public class TeacherDao implements IIeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中");
    }
}

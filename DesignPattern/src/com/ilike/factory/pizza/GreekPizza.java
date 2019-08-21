package com.ilike.factory.pizza;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备制作希腊披萨的材料");
    }
}

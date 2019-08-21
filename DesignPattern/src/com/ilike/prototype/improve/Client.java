package com.ilike.prototype.improve;

/**
 * 原型模式完成对象的克隆
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色","蒙古");
        Person person = new Person(666, "swd");
        sheep.setFriend(person);
        Sheep sheep1 =(Sheep) sheep.clone();
        Sheep sheep2 =(Sheep) sheep.clone();
        Sheep sheep3 =(Sheep) sheep.clone();
        System.out.println(sheep1+""+sheep1.getFriend());
        System.out.println(sheep2+""+sheep2.getFriend());
        System.out.println(sheep3+""+sheep3.getFriend());
    }
}

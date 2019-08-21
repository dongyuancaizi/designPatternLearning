package com.ilike.prototype.improve;

public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;

    private String address;

    private Person friend;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person getFriend() {
        return friend;
    }

    public void setFriend(Person friend) {
        this.friend = friend;
    }

    public Sheep(String name, int age, String color, String address) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 克隆该实例，使用默认的clone方法来完成
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() {
        Sheep sheep=null;
        try {
            sheep= (Sheep) super.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return sheep;
    }


    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                ", friend=" + friend +
                '}';
    }
}

/**
 * 羊的主人
 */
class Person{
    private  int id;
    private  String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }


}

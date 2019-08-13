package com.ilike.singleResponsibility;

/**
 * 单一职责原则
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

/**
 * 交通工具类
 */
class Vehicle {
    /**
     * 违反了单一职责原则
     * @param vehicle
     */
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }

}
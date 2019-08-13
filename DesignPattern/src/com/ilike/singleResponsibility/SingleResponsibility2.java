package com.ilike.singleResponsibility;

/**
 * 单一职责原则
 *   遵守了单一职责原则，但是改动很大
 *   可以改进
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");
        AirVehicle airVehicle=new AirVehicle();
        airVehicle.run("飞机");
    }
}

/**
 * 公路上跑的交通工具类
 */
class RoadVehicle {
    /**
     * 违反了单一职责原则
     * @param vehicle
     */
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }

}

/**
 * 空中的交通工具类
 */
class AirVehicle {
    /**
     * 违反了单一职责原则
     * @param vehicle
     */
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空中跑");
    }

}

/**
 * 水中的交通工具类
 */
class WaterVehicle {
    /**
     * 违反了单一职责原则
     * @param vehicle
     */
    public void run(String vehicle) {
        System.out.println(vehicle + "在水中跑");
    }

}

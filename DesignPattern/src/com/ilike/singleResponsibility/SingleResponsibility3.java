package com.ilike.singleResponsibility;

/**
 * 单一职责原则
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }
}


/**
 * 交通工具类
 */
class Vehicle2 {

    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空跑");
    }
    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中跑");
    }

}

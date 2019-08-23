package com.ilike.builder.improve;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Client2 {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("55");
        System.out.println(stringBuilder.toString());
        //该普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector=new HouseDirector(commonHouse);
        //完成盖房子
        House house = houseDirector.constructHouse();

        //盖高楼
        HighBuilding highBuilding = new HighBuilding();
        //完成盖房子
        houseDirector.setHouseBuilder(highBuilding);
        House house2 = houseDirector.constructHouse();
    }
}

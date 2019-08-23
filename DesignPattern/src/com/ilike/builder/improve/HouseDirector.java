package com.ilike.builder.improve;

/**
 * 指挥者,指挥制作流程
 */
public class HouseDirector {

   private HouseBuilder houseBuilder;

    /**
     * 构造器传入houseBuilder
     */
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public HouseBuilder getHouseBuilder() {
        return houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    /**
     * 如何建造房子的流程交给指挥者
     */
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}

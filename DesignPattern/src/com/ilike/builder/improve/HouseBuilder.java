package com.ilike.builder.improve;

/**
 *   建造者-->Builder
 */
public abstract class HouseBuilder {

    private House house = new House();

    /**
     * 打地基
     */
    public abstract void buildBasic();

    /**
     * 砌墙
     */
    public abstract void buildWalls();

    /**
     * 盖屋顶
     */
    public  abstract void roofed();

    /**
     * 将房子建造好后返回
     * @return
     */
    public House buildHouse(){
        return house;

    }
}

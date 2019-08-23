package com.ilike.builder;

/**
 * 房子
 */
public abstract class AbstractHouse {
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

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }

}

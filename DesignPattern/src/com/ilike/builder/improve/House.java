package com.ilike.builder.improve;

/**
 * 房子（产品）-->Product
 */
public class House {
    /**
     * 地基
     */
    private String baise;
    /**
     * 墙
     */
    private String wall;
    /**
     * 屋顶
     */
    private String roofed;

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}

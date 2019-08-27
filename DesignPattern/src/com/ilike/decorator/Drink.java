package com.ilike.decorator;

/**
 * 饮品抽象类
 */
public  abstract class Drink {
    /**
     * 描述
     */
    public String des;
    /**
     * 价格
     */
    private float price=0.0F;


    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 计算价格
     * @return
     */
    public abstract float cost();
}

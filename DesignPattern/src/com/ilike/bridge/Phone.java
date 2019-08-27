package com.ilike.bridge;

/**
 * 手机抽象类
 */
public abstract class Phone {
    /**
     * 品牌
     */
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }
}

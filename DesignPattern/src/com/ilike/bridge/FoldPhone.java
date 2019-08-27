package com.ilike.bridge;

/**
 * 折叠手机
 */
public class FoldPhone extends Phone {

    public FoldPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠样式手机开机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠样式手机关机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠样式手机打电话");
    }
}

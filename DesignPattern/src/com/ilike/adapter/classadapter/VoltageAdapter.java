package com.ilike.adapter.classadapter;

/**
 * 适配器
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output5v() {
        //获取220V电压
        int src=output220v();
        //转成5V
        int dst=src/44;
        return dst;
    }
}

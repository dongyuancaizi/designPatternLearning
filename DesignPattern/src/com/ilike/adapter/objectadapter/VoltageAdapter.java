package com.ilike.adapter.objectadapter;


/**
 * 适配器
 */
public class VoltageAdapter implements Voltage5V {
    private Voltage220V voltage220V;

    /**
     * 通过构造方法传入Voltage220V（聚合）
     *
     * @param voltage220V
     */
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5v() {
        //获取220V电压
        if (voltage220V != null) {
            int src = voltage220V.output220v();
            //转成5V
            int dst = src / 44;
            return dst;
        }
        return 0;
    }
}

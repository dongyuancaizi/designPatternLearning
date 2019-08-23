package com.ilike.adapter.classadapter;

public class Phone {
    /**
     * 充电
     */
    public void charging(VoltageAdapter voltageAdapter) {
        if (voltageAdapter.output5v() == 5) {
            System.out.println("电压5v，可以充电");
        } else if (voltageAdapter.output5v() > 5) {
            System.out.println("电压大于5v，无法充电");
        }

    }
}

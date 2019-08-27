package com.ilike.adapter.objectadapter;

/**
 * 被适配者
 */
public class Voltage220V {

    /**
     * 输出220v电压
     * @return
     */
    public int output220v() {
        int src = 220;
        System.out.println("电压=" + src + "V");
        return src;
    }
}
